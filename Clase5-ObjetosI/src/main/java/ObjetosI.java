import java.util.ArrayList;
import java.util.List;

public class ObjetosI {
    public static void main(String[] args) {
        //Ver == en primitivos
        int a = 1;
        int b = 2;
        System.out.println(a == b);
        //Metodo equals
        //en listas ya está implementado
        List<String> lista1 = new ArrayList<>();
        lista1.add("Joaquin");
        List<String> lista2 = new ArrayList<>();
        lista2.add("Joaquin");
        System.out.println(lista1.equals(lista2));

        //en otros objetos (los objetos que creemos) no está implementado, hereda de Object

        Perro dogui = new Perro(92, "Dogui", "doberman");
        //Setteamos las variables de instancia para el objeto dogui que es una instancia de Perro
        /*dogui.setRaza("doberman");
        dogui.setNombre("Dogui");
        dogui.setTamanio(92);*/
        //System.out.println(dogui.getNombre());

        Perro doguiDuplicado = new Perro();
        doguiDuplicado.setRaza("doberman");
        doguiDuplicado.setNombre("Dogui");
        doguiDuplicado.setTamanio(92);
        //System.out.println(doguiDuplicado.getNombre());

        //Object
//        System.out.println(dogui.equals(doguiDuplicado));

//        System.out.println(dogui.hashCode());
//        System.out.println(doguiDuplicado.hashCode());

        Perro can = new Perro();
        can.setRaza("pekines");
        can.setTamanio(20);
        can.setNombre("Jazmin");

        System.out.println(can.hashCode());
        System.out.println(dogui.hashCode());
        System.out.println(can.equals(dogui));

        //can.toString();

        //Ver la clase Object y sus métodos

        //Metodo hashcode en objetos (ver salida antes y después de sobreescribirlo)
        Gato michi = new Gato();
        michi.setAlimentoPreferido("Gati");
        System.out.println("El alimento preferido de mi gato es: " + michi.getAlimentoPreferido());

        Animal tigre = new Animal();
        tigre.setAmistoso(false);
        tigre.setCantidadPatas(4);
        System.out.println(tigre.toString());
    }
}

