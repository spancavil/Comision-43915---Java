import java.util.Scanner;

public class Problema5 {
    public static void main(String[] args) {
        //Ingresar dos números por consola.
        // Imprimir cuál número es mayor que cual, en caso de ser iguales
        // también debe informarlo.
        // Ejemplo: “4 es mayor a 3”, “2 es igual a 2” (Dificultad 1/5)

        try {
            int numero1 = 0;
            int numero2 = 0;
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese el primer número: ");
            numero1 = sc.nextInt();
            System.out.println("Ingrese el segundo número: ");
            numero2 = sc.nextInt();
            if (numero1 > numero2) {
                System.out.println("El numero " + numero1 + " es mayor que el numero " + numero2);
            } else {
                if (numero1 == numero2) {
                    System.out.println("El numero " + numero1 + " es igual que el numero " + numero2);
                } else {
                    System.out.println("El numero " + numero2 + " es mayor que el numero " + numero1);
                }
            }

        } catch (Exception e) {
            System.out.println("Ocurrió una excepción: ");
            System.out.println(e.getMessage());
        }
    }
}
