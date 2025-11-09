package retos.reto2;
/**
 * Este programa es la version en bruto del programa que hicimos como actividad de la fila de tortillas
 * en vez de usar array list o linked list, llamamos objetos y punteros.
 * Hasta este punto el programa ya da la opcion de agregar al inicio, a la vez imprime al revez desde el case 5
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TortilleriaTecsito {

    public static void main(String[] args) {
        Persona inicioFila = null; //se inicializa en null porque no sabemos quien es

        Scanner leer = new Scanner(System.in);
        int opcion = 0;

        List<String> fila = new ArrayList<>();

        //menu
        do {
            String menu = """
                    1...Agregar cliente 
                    2...Atender Cliente
                    3...Cliente sale de la fila
                    4...Imprimir lista al revés
                    5...Imprimir lista en orden
                    6...Terminar servicio
                    
                    Escoga una opción: 
                    """;
            System.out.println(menu);
            opcion = leer.nextInt();
            leer.nextLine();

            switch (opcion) {
                case 1:

                    System.out.println("Quieres agregarlo al inicio o al final de la lista?: "); //le decimos que si quiere ser al inicio o al final el registro, y guardamos
                    String inicio=leer.nextLine();

                    if(inicio.equals("inicio")){   //este es el caso en el que el usuario indique que quiere al inicio el nuevo registro
                        System.out.println("Dame un nombre: ");
                        String nombreInicio=leer.nextLine();
                        Persona personaNueva = new Persona();  // de la clase Persona hacemos un nuevo objeto llamada persona nueva
                        personaNueva.nombre = nombreInicio; //Ese objeto, con el atribuyto de nombre de su clase, lo apuntamos al inicio de la fila
                        personaNueva.vieneAtras = inicioFila; //la persona nueva, si viene atras aun asi la vamos apuntar al inico de la fila
                        inicioFila = personaNueva;

                    }
                    else {
                        System.out.println("Dame un nombre: "); //de lo contrario seguimos agregando al final de la fila como ya lo teniamos
                        String nombre = leer.nextLine();
                        Persona personaNueva = new Persona();
                        personaNueva.nombre = nombre;
                        if (inicioFila == null) { //si el inicio de la fila esta vacio entonces inicio fila es la persona nueva
                            inicioFila = personaNueva;
                        } else { // de lo contrario, apuntamos al inico de la fila pero entramos al while
                            Persona siguiente = inicioFila;
                            while (siguiente.vieneAtras != null) {
                                siguiente = siguiente.vieneAtras;
                            }
                            siguiente.vieneAtras = personaNueva;
                        }

                    }
                    imprimirLista(inicioFila);
                    break;

                case 2:
                    if(inicioFila != null) {
                        inicioFila = inicioFila.vieneAtras;
                    }
                    imprimirLista(inicioFila);
                    break;

                case 3:
                    System.out.println("A quien quieres eliminar: ");
                    String elimina = leer.next();
                    Persona buscado = inicioFila;
                    Persona atrasBuscado = null;
                    while(!buscado.nombre.equals(elimina) && buscado != null){
                        atrasBuscado = buscado;
                        buscado = buscado.vieneAtras;
                    }
                    //caso 1
                    if(buscado != null ){
                        //caso 1:
                        if(atrasBuscado == null){
                            inicioFila = inicioFila.vieneAtras;
                        }else if (buscado.vieneAtras == null) atrasBuscado.vieneAtras = null; //aqui desenlaza segun le indiquemos al objeto de su posicion
                        else atrasBuscado.vieneAtras = buscado.vieneAtras;

                    }
                    imprimirLista(inicioFila);
                    break;


                case 4:
                    //imprimios al reves con el metodo recursivo
                    System.out.println("Lista al reves");
                    imprimirListaReves(inicioFila);
                    break;

                case 5:
                    //imprimos en orden
                    System.out.println("La fila en orden");
                    imprimirLista(inicioFila);
                    break;

                case 6:
                    //mostramos a los clientes que no se sacaron de la fila

                    int contador = 0;
                    while(inicioFila != null){
                        contador ++;
                        inicioFila = inicioFila.vieneAtras;
                    }
                    System.out.println("Las personas sin atender son: "+contador);
                    break;


            }
        }
        while (opcion != 6);
    }
    public static void imprimirLista(Persona persona){
        if(persona != null){
            System.out.println(persona.nombre);
            imprimirLista(persona.vieneAtras);
        }
    }
    public static void imprimirListaReves(Persona persona){
        if(persona != null){
            imprimirListaReves(persona.vieneAtras);
            System.out.println(persona.nombre);

        }
    }
}

//esta clase define quien será la persona.
class Persona{
    String nombre;
    Persona vieneAtras;
}
