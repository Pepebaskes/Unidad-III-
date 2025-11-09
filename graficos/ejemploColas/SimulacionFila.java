/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploColas;

import java.util.Arrays;

/**
 *
 * @author rafae
 */
public class SimulacionFila {
    
    public static void main(String[] args) {
        var fila = new MiFila(5);
        
        fila.Offer("pEPE");
        fila.Offer("Carlos");
        fila.Offer("Luis");
        
        System.out.println("Valores "+ Arrays.toString(fila.aArreglo()));
        
        fila.poll();
        System.out.println("Valores: "+Arrays.toString(fila.aArreglo()));
        
        
    }
    
}
