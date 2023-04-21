import java.util.ArrayList;
import java.util.List;

public class Problema2 {
    public static void main(String[] args) {
        //Realizar un programa que dado un listado de alumnos
        //previamente establecido, devuelva un alumno al azar. (DIficultad 3/5)

        List<String> listadoAlumnos = new ArrayList<>();
        listadoAlumnos.add("Hector");
        listadoAlumnos.add("Walter");
        listadoAlumnos.add("Augusto");
        listadoAlumnos.add("Fernando");
        listadoAlumnos.add("Adrian");
        listadoAlumnos.add("Lucas");

        System.out.println(listadoAlumnos);

        int randomIndex = (int) (Math.round(Math.random() * (listadoAlumnos.size() - 1)));

        System.out.println(randomIndex);

        System.out.println("Un alumno al azar es: " + listadoAlumnos.get(randomIndex));
    }
}
