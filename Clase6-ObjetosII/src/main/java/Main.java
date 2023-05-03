import DesafioClase.Circulo;
import Interfaces.Arania;
import NormalClasses.Gato;

public class Main {
    public static void main(String[] args) {
        Gato gato1 = new Gato();
        gato1.hablar();

        Abstract.Gato gato2 = new Abstract.Gato("Ramon", 6, 50, "Siames");

        System.out.println(gato2.getAlimento());

        Arania arania = new Arania();
        System.out.println("La araña es amistosa: " + arania.isAmistosa());
        arania.Jugar();

        arania.talk();

        Circulo circulo = new Circulo(1);

        System.out.println("El area del circulo es: " + circulo.area());


    }
}
