package com.coderhouse.Clase3.Servicio.REST.externo.aop;

import jakarta.servlet.http.HttpServletRequest;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.util.Arrays;
import java.util.stream.Stream;

@Aspect
//Si no lo colocamos component no lo mappea como un bean, por lo tanto no interceptará nada.
@Component
public class LogAspect {

    //Los Pointcut son un lenguaje de expresión propio de Spring AOP.
    //Básicamente definimos los lugares (packages, clases, métodos) donde queremos que se ejecuten nuestros advices
    //También se puede dar nombre al pointcut, en nuestro caso log()
    @Pointcut("execution(* com.coderhouse.Clase3.Servicio.REST.externo.controller.*.*(..))")
    public void log(){}

    //Definimos el advice (after, before, afterThrowing, etc)
    @Before("log()")
    public void doBefore(JoinPoint joinPoint) {
        System.out.println("Hola! Me ejecutaré antes de TODOS los métodos en controller");
        //Podemos por ejemplo imprimir todos los argumentos.
        Stream.of(joinPoint.getArgs())
                .forEach(o -> System.out.println("arg value: " + o.toString()));

        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        assert attributes != null;
        HttpServletRequest request = attributes.getRequest();
        String url = request.getRequestURL().toString();
        String ip = request.getRemoteAddr();
        String classMethod = joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName();
        Object [] args = joinPoint.getArgs();
        RequestLog requestLog = new RequestLog(url, ip, classMethod, args);
        System.out.println("Request: " + requestLog);
    }

    private class RequestLog {
        private final String url;
        private final String ip;
        private final String classMethod;
        private final Object[] args;

        public RequestLog(String url, String ip, String classMethod, Object[] args) {
            this.url = url;
            this.ip = ip;
            this.classMethod = classMethod;
            this.args = args;
        }

        @Override
        public String toString() {
            return "{" +
                    "url='" + url + '\'' +
                    ", ip='" + ip + '\'' +
                    ", classMethod='" + classMethod + '\'' +
                    ", args=" + Arrays.toString(args) +
                    '}';
        }
    }

    @Around("log()")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.nanoTime();
        try {
            return joinPoint.proceed();
        }
        finally {
            System.out.println(joinPoint + " -> " + (System.nanoTime() - startTime) / 1000000 + " ms");
        }
    }
}
