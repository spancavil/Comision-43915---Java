package NormalClasses;

public class Gato extends Animal{

    //Variable adicional
    private String alimentoPreferido;

    //Método 1: constructor no vacío
    public Gato(int cantidadPatas, boolean isAmistoso, String alimentoPreferido) {
        super(cantidadPatas, isAmistoso);
        this.alimentoPreferido = alimentoPreferido;
    }

    public Gato(){}

    @Override
    public void hablar() {
        //Armamos nuestra propia implementación
        System.out.println("Miau miau!");
    }

    //Sobrecarga, no sería un override. Siempre en los overrides hay que respetar la firma
    //de los métodos del padre.
    public boolean isAmistoso(String especie) {
        return super.isAmistoso();
    }

    //Método 2: sin constrcutro

    public String getAlimentoPreferido() {
        return alimentoPreferido;
    }

    public void setAlimentoPreferido(String alimentoPreferido) {
        this.alimentoPreferido = alimentoPreferido;
    }
}

