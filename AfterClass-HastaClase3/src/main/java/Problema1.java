import java.util.Scanner;

public class Problema1 {
    public static void main(String[] args) {
        //Determinar si un número entero ingresado por consola es primo.
        //Ejemplo: 71: es primo, 90 no es primo. (Dificultad 3/5)
        //Los numeros primos son solamente divisibles por si mismos y por uno

        try {
            int numero = 0;
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese el número a determinar: ");
            numero = sc.nextInt();
            if (numero < 1) {
                System.out.println("Sólo numero positivos mayores a 1");
            } else {
                //Bandera auxiliar o flag
                boolean state = false;
                for (int i = 2; i < numero/2; i++) {
                //System.out.println(i);
                    if (numero % i == 0) {
                        state = true;
                        break;
                    }
                }
                //System.out.println(state);
                if (state == true) System.out.println("El número NO es primo");
                else System.out.println("El numero ES primo");
            }
        } catch (Exception e) {
            System.out.println("Algo ocurrió");
            System.out.println(e.getMessage());
        }

    }
}
