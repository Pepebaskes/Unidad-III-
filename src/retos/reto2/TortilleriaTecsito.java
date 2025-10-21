package retos.reto2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TortilleriaTecsito {

    public static void main(String[] args) {
        Persona inicioFila = null; //se inicializa en null porque no sabemos quien es

        Scanner leer = new Scanner(System.in);
        int opcion = 0;

        List<String> fila = new ArrayList<>();


        do {
            String menu = """
                    1...Agregar cliente 
                    2...Atender Cliente
                    3...Cliente sale de la fila
                    4...Terminar servicio 
                    Escoga una opción: 
                    """;
            System.out.println(menu);
            opcion = leer.nextInt();
            leer.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Dame un nombre: ");
                    String nombre = leer.nextLine();
                    Persona personaNueva = new Persona();
                    personaNueva.nombre = nombre;
                    if (inicioFila == null) {
                        inicioFila = personaNueva;
                    } else {
                       Persona siguiente = inicioFila;
                       while(siguiente.vieneAtras != null){
                           siguiente = siguiente.vieneAtras;
                       }
                       siguiente.vieneAtras = personaNueva;
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
                        }else if (buscado.vieneAtras == null) atrasBuscado.vieneAtras = null;
                        else atrasBuscado.vieneAtras = buscado.vieneAtras;

                    }

            }
        }
        while (opcion != 4);
    }
    public static void imprimirLista(Persona persona){
        if(persona != null){
            System.out.println(persona.nombre);
            imprimirLista(persona.vieneAtras);
        }
    }
}

//esta clase define quien será la persona.
class Persona{
    String nombre;
    Persona vieneAtras;
}
