package arreglo;
import java.util.Scanner;
public class Arreglo {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int arreglo1[] = new int[20];
        int [] arreglo2= {4,3,2,1,2};
        int matriz1 [][] = new int[3][2];
        int[] matriz2 [] = {{2,4,2},{1,2,3,5,3,2}};

        System.out.println("Valor: "+ matriz2[1][2]);

        System.out.println("Ma matriz tiene: "+matriz2.length);

        System.out.println(matriz2[0].length);

        System.out.println("El primer arreglo tiene "+arreglo1.length + " posiciones");

        System.out.println("El primer arreglo tiene "+arreglo2.length + " posiciones");

        //pedir 3 nombres, 3 carreras, 3 edades y acomodar en una tabla que sea, nombre, carreras, edad.

        String[][] misDatos = new String[3][3];

        for(int i = 0; i<3;i++){
            System.out.println("Ingrese el nombre: ");
            String nombre=leer.nextLine();
            System.out.println("Ingrese la carrera: ");
            String carrera=leer.nextLine();
            System.out.println("Edad: ");
            String edad=leer.nextLine();

            misDatos[i][0] = nombre;
            misDatos[i][1] = carrera;
            misDatos[i][2] = edad;


        }
        for (String[] fila : misDatos) {
            for (String dato : fila) {
                System.out.printf("%-15s", dato);
            }
            System.out.println();
        }

        /*for (String[] fila : misDatos) {
          for (String dato : fila) {
            System.out.printf("%-10",dato);
            }
            System.out.println("");
        }
*/



    }
}


