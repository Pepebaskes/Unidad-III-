package ejercicioPilas;

import java.util.Arrays;

/**
 * Clase que me permite verificar mis operaciones con la pila
 */
public class SimulacionPila {

    public static void main(String[] args) {
        MiStack miPila = new MiStack(4);
        miPila.push("Uno");
        miPila.push("Dos");
        miPila.push("Tres");

        System.out.println("Valor que esta en el tope: "+miPila.peek());

        miPila.pop();

        System.out.println("Todos los valores: "+ Arrays.toString(miPila.viewStack()));


    }
}
