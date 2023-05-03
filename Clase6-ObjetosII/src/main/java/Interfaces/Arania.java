package Interfaces;

public class Arania implements Mascota, SerVivo{

    private boolean amistoso;
    @Override
    public boolean isAmistosa() {
        return false;
    }

    @Override
    public void Jugar() {
        System.out.println("Soy una araña jugando...");
    }

    @Override
    public void talk() {
        System.out.println("Las arañas no hablan.");
    }

    @Override
    public void respirar() {
        System.out.println("Araña respirando");
    }
}
