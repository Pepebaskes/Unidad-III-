package retos.reto2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FilaDeTortillas {

    public static void main(String[] args) {
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
                    System.out.println("Ingrese el nombre: ");
                    String nombre = leer.nextLine();
                    fila.add(nombre);
                    System.out.println(fila);
                    break;

                case 2:
                    System.out.println("El cliente que atendió es: " + fila.get(0));
                    fila.remove(0);
                    System.out.println(fila);
                    break;
                case 3:
                    System.out.println("Ingrese el cliente que quiere remover: ");
                    int remover = leer.nextInt();
                    System.out.println("El cliente que removió fue: "+fila.remove(remover));
                    System.out.println(fila);
                    break;

                case 4:
                    System.out.println("Estos clientes quedaron sin atender: "+fila);
                    break;
            }
        }
            while (opcion != 4) ;

    }
}