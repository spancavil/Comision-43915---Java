package Interfaces;

interface Mascota {

    boolean isAmistosa ();

    void Jugar ();

    //Se pueden asignar métodos por default
    //No es obligatorio implementarlos, ya que de no hacerlo,
    //se utiliza el código por default
    default void talk(){
        System.out.println("Animal is talking by default");
    }
}
