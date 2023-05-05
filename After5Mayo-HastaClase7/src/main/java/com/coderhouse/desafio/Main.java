package com.coderhouse.desafio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
CONSIGNA
Agregar 5 objetos del tipo Persona a una lista.
Crear la lógica para ordenar alfabéticamente la lista y mostrar en consola de acuerdo al siguiente criterio:
Ordenado por nombre.
Ordenado por apellido.
Ordenado inversamente por apellido.
*/

public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        Persona persona3 = new Persona();
        Persona persona4 = new Persona();

        ArrayList<Persona> listado = new ArrayList<>();
        listado.add(persona1);
        listado.add(persona2);
        listado.add(persona3);
        listado.add(persona4);

        System.out.println(
                listado.get(0).getNombre() + " - " +
                listado.get(1).getNombre() + " - " +
                listado.get(2).getNombre() + " - " +
                listado.get(3).getNombre() + " - " );

        ArrayList<Persona> listadoOrdenadoPorNombre = Persona.sortPersonas(listado, "nombre");

        //Print
        System.out.println(
                listadoOrdenadoPorNombre.get(0).getNombre() + " - " +
                listadoOrdenadoPorNombre.get(1).getNombre() + " - " +
                listadoOrdenadoPorNombre.get(2).getNombre() + " - " +
                listadoOrdenadoPorNombre.get(3).getNombre() + " - " );
    }
}
