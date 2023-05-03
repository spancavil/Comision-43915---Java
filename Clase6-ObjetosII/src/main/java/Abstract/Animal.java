package Abstract;

//Ver qué ocurre si no colocamos abstract en la clase
public abstract class Animal {
    protected String nombre;
    protected int peso;
    protected int altura;

    public Animal(String nombre, int peso, int altura) {
        this.nombre = nombre;
        this.peso = peso;
        this.altura = altura;
    }

    //Ver qué ocurre si no le colocamos abstract a la clase Animal
    public abstract String getAlimento();

    //Método no abstracto
    protected int getHorasDescanso() {
        return 6;
    }
}
