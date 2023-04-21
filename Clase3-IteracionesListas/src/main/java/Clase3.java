import java.util.ArrayList;
import java.util.List;

public class Clase3 {

        public static void main(String[] args) {

                //Método abreviado de inicialización
                char[] charArray = {'a', 'b', 'c', 'd', 'e'};
//                charArray = new char[5];
//                charArray[0] = 'a';
//                charArray[1] = 'b';
//                charArray[2] = 'c';
//                charArray[3] = 'd';
//                charArray[4] = 'e';

 /*               System.out.println("En la posición 3 del array tenemos: " + charArray[3]);

                charArray[2] = 'z';

                System.out.println("En la posición 3 del array tenemos: " + charArray[2]);
                //charArray[5] = 'f'; OutOfBounds
                //Shortcut
                //La asignación de memoria se asigna junto a la declaración
                char[] charArray2 = {'a', 'b', 'c', 'd', 'e'};

                System.out.println(charArray2.length);*/
        /*
                List<String> listaAmigos = new ArrayList<>();

                List<Integer>edadesAmigos = new ArrayList<>();


                listaAmigos.add("Sebas");
                listaAmigos.add("Romeo");
                listaAmigos.add("Julieta");
                listaAmigos.add("Sebas");
                listaAmigos.add("Julian");
                edadesAmigos.add(29);
                edadesAmigos.add(34);

                System.out.println("En la segunda posición de la lista edadesAmigos tenemos: " + edadesAmigos.get(1));

                edadesAmigos.set(0, 20);

                System.out.println(edadesAmigos.get(0));

                System.out.println("Sebas está en la posición: " + listaAmigos.lastIndexOf("Sebas")); */
/*
//                listaAmigos.remove(0);

                System.out.println(listaAmigos);

                System.out.println(listaAmigos.size());

                for (String amigo: listaAmigos
                ) {
                    System.out.println(amigo.getClass());
                }

                //Lambda function
                edadesAmigos.forEach(edad -> {
                    System.out.println(edad);
                });

                //Que puede ser reemplazado por:
                edadesAmigos.forEach(System.out::println);

                //Mix data
                List<Object>randomDatos = new ArrayList<>();

                randomDatos.add("Sebas");
                randomDatos.add(123);

                System.out.println(randomDatos.get(0).getClass());
                System.out.println(randomDatos.get(1).getClass());

                System.out.println(randomDatos);
 */
                /*int i = 5;
                while (i < 5) {
                    System.out.println(i);
                    i++;
                };

                do {
                    System.out.println(i);
                    i ++;
                } while (i < 10);*/

                /*for (int j = 1; j <= 10; j++) {
                        System.out.println(j);
                }

                int[] listadoNotas = {8,9,6,10};

                List<Integer> listadoNotas2 = new ArrayList<>();
                listadoNotas2.add(5);
                listadoNotas2.add(3);
                listadoNotas2.add(4);

                for (int i = 0; i < listadoNotas.length; i++) {
                        System.out.println(listadoNotas[i]);
                }

                for (int nota: listadoNotas) {
                        System.out.println(nota);
                }

                listadoNotas2.forEach(nota -> {
                        System.out.println(nota);
                });

                listadoNotas2.forEach(System.out::println);

                System.out.println(listadoNotas2);

                int i = 1;

                //Imprimir el numero i hasta que sea divisible por 3 y por 5
                 do {
                         i++;
                        System.out.println("Se cumple la condicion: " + i);
                } while (!(i % 3 == 0 && i % 5 == 0));*/

                List<Integer> listadoAleatorio = new ArrayList<>();

                for (int i = 0; i < 10; i++) {
                        listadoAleatorio.add((int)(Math.random() * 100 + 1 ));
                }

                System.out.println(listadoAleatorio);

                for (int numeroListado: listadoAleatorio
                     ) {
                        if (!(numeroListado % 3 == 0 && numeroListado % 5 == 0)) {
                                System.out.println(numeroListado);
                        } else {
                                break;
                        }
                }
        }
}
