import java.util.Scanner;
public class Variables {
    public static void main(String[] args) {

        int var1 = 300;
        System.out.println(var1);

        boolean isPCAvailable;
        isPCAvailable = false;

        System.out.println(isPCAvailable);

        //Narrowing
        int precioDolar = 100;
        byte dolarEnByte = (byte) precioDolar;
        System.out.println(dolarEnByte);

        //Widening
        byte var2 = 4;
        int var3 = var2;
        System.out.println(var3);

        int modulo = var2 % 2;

        System.out.println("Modulo: " + modulo);

        int i = 1;
        System.out.println(++i);
        System.out.println(i);

        int j = 1;
        System.out.println(j++);
        System.out.println(j);

        byte k = 2;

        char letra = '2';

        System.out.println(k == letra);

        int valor4 = 200;
        int valor5 = 500;
        System.out.println(valor4 >= valor5);

        float capitalSolicitado = 120000;
        float interes = 0.1f;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el período en meses: ");
        int periodoEnMeses;
        periodoEnMeses = sc.nextInt();
        sc.close();
        float intereses = capitalSolicitado * interes * periodoEnMeses;
        float loQueVamosAPagar = intereses + capitalSolicitado;
        System.out.println(loQueVamosAPagar);

        /*
        //PLUS
        // Creamos un Scanner a partir del input de la consola
        Scanner sc = new Scanner(System.in);
        // declaramos las variables que utilizaremos.
        int intData;
        char charData;
        //Obtenemos la linea entera como String
        System.out.println("Enter a String value:");
        String str = sc.nextLine();

        //Obtenemos un valor entero
        System.out.println("Enter Integer value:");
        intData = sc.nextInt();

        //Obtenemos el primer character
        System.out.println("Enter Character value:");
        charData = sc.next().charAt(0);

        sc.close();
         */
    }
}
