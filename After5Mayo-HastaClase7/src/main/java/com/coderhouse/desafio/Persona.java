package com.coderhouse.desafio;

import java.util.ArrayList;
import java.util.Arrays;

public class Persona {
    private String nombre;
    private String apellido;

    private final String[] nombres = {"Sebastián", "Gimena", "Rodolfo", "Ana", "Azucena"};
    private final String[] apellidos = {"González", "Moro", "Ghandi", "Keynes", "Lopez", "Di Carlo"};

    public Persona() {
        this.nombre = getRandomItem(nombres);
        this.apellido = getRandomItem(apellidos);
    }

    private String getRandomItem (String[] data) {
        int randomIndex = (int) Math.round(Math.random() * (data.length - 1));
        return data[randomIndex];
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Persona persona)) return false;

        if (!getNombre().equals(persona.getNombre())) return false;
        return getApellido().equals(persona.getApellido());
    }

    @Override
    public int hashCode() {
        int result = getNombre().hashCode();
        result = 31 * result + getApellido().hashCode();
        return result;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

/*    private String getRandomItem (String[] data) {
        int randomIndex = (int) Math.round(Math.random() * (data.length - 1));
        return data[randomIndex];
    }*/


    public static ArrayList<Persona> sortPersonas (ArrayList<Persona> listado, String sortBy){
        switch (sortBy) {
            case "nombre" -> listado.sort((o1, o2) -> o1.getNombre().compareTo(o2.getNombre()));
            case "apellido" -> listado.sort((o1, o2) -> o1.getApellido().compareTo(o2.getApellido()));
            default -> {
            }
        }
        return listado;
    }
}
