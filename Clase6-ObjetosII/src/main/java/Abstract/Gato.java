package Abstract;

public class Gato extends Animal {

    private String razaGato;

    public Gato(String nombre, int peso, int altura, String razaGato) {
        super(nombre, peso, altura);
        this.razaGato = razaGato;
    }

    @Override
    public String getAlimento() {
        //añadir la lógica para getAlimento
        return "Whiskas";
    }

    //No nos permite llamar al constructor vacío (sin parámetros). Esto es porque en el
    // parent debe estar también
    //public Gato() {}


    /*@Override
    protected String getAlimento() {
        //Añadir lógica
        return null;
    }*/
}
