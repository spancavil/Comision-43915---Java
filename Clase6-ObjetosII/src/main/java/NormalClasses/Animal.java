package NormalClasses;

public class Animal {
    private int cantidadPatas;
    private boolean isAmistoso;

    public Animal(int cantidadPatas, boolean isAmistoso) {
        this.cantidadPatas = cantidadPatas;
        this.isAmistoso = isAmistoso;
    }

    public Animal(){}

    public int getCantidadPatas() {
        return cantidadPatas;
    }

    public void setCantidadPatas(int cantidadPatas) {
        this.cantidadPatas = cantidadPatas;
    }

    public boolean isAmistoso() {
        return isAmistoso;
    }

    public void setAmistoso(boolean amistoso) {
        isAmistoso = amistoso;
    }

    public void hablar(){
        System.out.println("Soy un animal hablando..");
    }

    @Override
    public String toString() {
        return "NormalClasses.Animal{" +
                "cantidadPatas=" + cantidadPatas +
                ", isAmistoso=" + isAmistoso +
                '}';
    }
}

