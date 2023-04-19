import java.util.Locale;
import java.util.Scanner;

public class ControlDeFlujos {
    public static void main(String[] args) {


        /*int volumen = 4;
        if (volumen >= 7) {
            System.out.println("Volumen muy alto, puede ser perjudicial");
        } else {
            System.out.println("Volumen aceptable");
        }

        int max = 100;
        int min = 1;
        int numeroAleatorio = (int) (Math.random() * (max - min) + min);

        System.out.println(numeroAleatorio);

        if (numeroAleatorio > 50) {
            System.out.println("El numero mayor a 50");
        } else {
            System.out.println("El numero es menor a 50");
        }

        int mesInt = 8;
        String nombreMes;
        String estacion;

        switch (mesInt) {
            case 1: nombreMes = "Enero";
                break;
            case 2: nombreMes = "Febrero";
                break;
            case 3: nombreMes = "Marzo";
                break;
            default: nombreMes = "otro";
        }

        System.out.println(nombreMes);
        switch (mesInt) {
            case 1:
            case 2:
            case 3:
                estacion = "verano";
                break;
            case 4:
            case 5:
            case 6:
                estacion = "otoño";
                break;
            default:
                estacion = "o invierno o primavera";
        }

        System.out.println(estacion);*/


        /*
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Ingrese un valor entero");
            int input = sc.nextInt();
            System.out.println("El valor que ingresaste fue: " + input);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Un valor entero te pedí mono!");
        } finally {
            System.out.println("Terminó el bloque try catch");
        }*/

        /*boolean isMateDulce = false;
        int cucharadasAzucar = isMateDulce ? 2 : 0;
        System.out.println(cucharadasAzucar);

        int edad = 10;
        String isMayorEdad;
        isMayorEdad = edad >= 18 ? "mayor" : "menor";

        System.out.println(isMayorEdad);*/

        String mes;
        int numeroMes = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar el nombre del mes:");
        mes = sc.nextLine().toUpperCase();
        sc.close();
        System.out.println(mes);
        switch (mes) {
            case "ENERO": numeroMes = 1;
                break;
            case "FEBRERO": numeroMes = 2;
                break;
            case "MARZO": numeroMes = 3;
                break;
            default:
                System.out.println("Nombre de mes inválido");
        }

        System.out.println(numeroMes);
    }
}
