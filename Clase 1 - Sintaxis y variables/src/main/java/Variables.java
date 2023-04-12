import java.util.Scanner;
public class Variables {
    public static void main(String[] args) {


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

        // Wrappeamos intData y charData como si fueran objetos. Sólo asi obtendremos su clase y el nombre del type
        System.out.println(intData + " is of type " + ((Object)intData).getClass().getSimpleName());
        System.out.println(charData + " is of type " + ((Object)charData).getClass().getSimpleName());
        //String no necesita ser casteado, porque ya es un objeto.
        System.out.println(str + " is of type " + str.getClass().getSimpleName());
        // close Scanner class object
        sc.close();
    }
}
