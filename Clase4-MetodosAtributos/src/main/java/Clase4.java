import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Clase4 {
    public static void main(String[] args) {
        //Llamar método imprimir colores
        imprimirColores();

        //ver qué pasa si no le ponemos static al método
        Clase4 clase4 = new Clase4();
        clase4.imprimirColores2();

        //llamar método suma, recibe como parámetros 2 números, devolver otro número (float)
        float suma1 = suma(4.5f, 5.2f);
        System.out.println("El resultado de la suma es:" + suma1);

        float suma2 = suma(4.5f, 3.4f, 5.6f);

        float areaCirculo1 = area(4f);

        System.out.println(areaCirculo1);

        float areaRectangulo1 = area(2f, 4f);

        System.out.println(areaRectangulo1);

        //Siempre pasar por argumentos la cantidad adecuada de parámetros dependiendo el/los métodos
        //float suma3 = suma();

        //llamar método para instanciar una lista de colores

        //Ejemplo Edificio
        Edificio hilton = new Edificio();
        hilton.setPisos(25);
        System.out.println(hilton.getPisos());

        Edificio canavagh = new Edificio();
        canavagh.setPisos(6000);
        canavagh.setPisos(600);
        System.out.println(canavagh.getPisos());

        System.out.println(Edificio.CANTIDAD_MAXIMA_PISOS);

        //Calculo de area con constante PI

        //Revisar la librería Math
    }

    static void imprimirColores() {

        System.out.println("Blanco, amarillo, azul, magenta, indigo");
    }

    //Cambio de firma porque cambia el nombre del método
    static int imprimirColores3() {
        System.out.println("Blanco, amarillo, azul, magenta, indigo");
        return 5;
    }

    void imprimirColores2 () {
        System.out.println("Esmeralda");
    }

    static float suma(float num1, float num2) {
        return num1 + num2;
    }

    //Cambia la implementación pero no cambia la firma por lo tanto el método no esta
    //correctamente declarado
    /*static float suma(float num1, float num2) {
        return num1 - num2;
    }*/

    //Overloading o sobrecarga de métodos
    static float suma(float num1, float num2, float num3) {
        return num1 + num2 + num3;
    }

    static float area(float radio){
        return (float) Math.PI * (radio * radio);
    }

    static float area(float base, float altura) {
        return base * altura;
    }

 }

 class Edificio {

    //Variable de instancia
    private int pisos;

    //Variable pública, de clase (no hay que instanciar edificio)
    public static final int CANTIDAD_MAXIMA_PISOS = 100;

     public int getPisos() {
         return pisos;
     }

     public void setPisos(int pisos) {

         //Variable de método
         String message = "La cantidad de pisos no es la indicada";
         //Vamos a validar que la cantidad de pisos sea correcta
         if (pisos > CANTIDAD_MAXIMA_PISOS) {
             System.out.println(message);
         } else {
            this.pisos = pisos;
         }
     }

 }