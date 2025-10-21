package ArregloAsociativo;

import java.util.HashMap;
import java.util.Map;

public class ArregloAsociativo {

    public static void main(String[] args) {
        HashMap<Integer,String> mapaEmpleados=new HashMap<>();

        mapaEmpleados.put(123,"Jose Luis");
        mapaEmpleados.put(132,"Luis José");
        mapaEmpleados.put(143,"Pepe Baskes");
        mapaEmpleados.put(111,"Rafael");

        boolean estaono = mapaEmpleados.containsValue("Pepe Baskes");

        if(estaono == true){
            System.out.println("Si esta el usuario");
        }
        else{
            System.out.println("No está el usuario");
        }


    }



}
