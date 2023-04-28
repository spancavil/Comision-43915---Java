public class Animal {
    int cantidadPatas;
    boolean isAmistoso;

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

    @Override
    public String toString() {
        return "Animal{" +
                "cantidadPatas=" + cantidadPatas +
                ", isAmistoso=" + isAmistoso +
                '}';
    }
}
