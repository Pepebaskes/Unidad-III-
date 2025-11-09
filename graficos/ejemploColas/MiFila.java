
package ejemploColas;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author rafae
 */
public class MiFila {
    
    //Queue<String> cola = new PriorityQueue<>();
    private final int MAXIMO;
    private final String []fila;
    private int fin;
    
    public String [] aArreglo(){
        String arreglo[] = new String [fin]; //inicializamos el arreglo con lo que tiene el fin
        for (int i = 0; i < fin; i++) {
            arreglo[i] = fila[i]; //arreglo será igual a lo que tiene fila en la posicion i
        }
        return arreglo;
    }
    
    /**
     * metodo que me permite traer el primer valor que tengo en la fila
     * @return el primer valor
     */
    public String peek(){
        String value = "";
        if(fin>0){
            value = fila [0];
        }
        
        return value; 
    }
    
    
    /**
     * Metodo para sacar el valor del inicio de la fila
     * @return el valor que se encontro, en blanco si no hay
     */
    public String poll(){
        String value = "";
        
        if (fin > 0){
            value = fila [0];
            for (int i = 1; i < fin; i++) { //aqui en este ciclo recorre todo los datos
                fila[i-1] = fila[i]; //aqui intercambiamos el valor de la fila, le decimos que fila en la posicion i, lo ponga en la posicion i-1
            }
            fin --; //disminuimos la fila
        }
        return value;
      }
   
    /**
     * metodo que me permite agregar valores a la fila
     * @param value valor a agregar
     * @return verdadero si se puedo agrerar, falso si no. 
     */
   public boolean Offer(String value){
       boolean isSuccess;
       if(fin < MAXIMO){
           fila[fin] = value;
           isSuccess = true;
       }
       else{
           isSuccess = false;
       }
       return isSuccess;
        
    }
   
   
    public MiFila (int max){
        MAXIMO = max;
        fila = new String [MAXIMO];
    }
    
    
}
