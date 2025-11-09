package ejercicioPilas;
/**
 * Programa que me permite trabajar con los datos en formato de LIFO
 * Es una pila estatica para manipular datos
 */
public class MiStack {

    private final int MAXIMO; //el final se le agrega a las variables que van a ser constantes (las variables constantes van en mayusuculas)
    private final String [] STACK;
    private int tope;

    /**
     * Metodo que me permita ver el contenido de la pila, lo mete en un arreglo
     * regresa un arreglo con los datos.
     * @return
     */
    public String [] viewStack(){
        int topeVirtual = tope+1;
        String[] values = new String[topeVirtual];
        System.out.println(values.length);
        int index = 0;
        for(int i = tope; i>=0;i--){
            values[index] = STACK[i];
            index++;
            System.out.println(STACK[i]);
        }
        return values;
    }


    /**
     * Metodos que permite mostrar los elementos de la pila
     * si no existe regresa un null
     * @return
     */
    public String peek(){
        String value = "";
        if(tope >=0){
            value=STACK[tope];
        }
        return value;
    }


    /**
     * Método que permite sacarl el valor que tenemos en el tope de la pilla
     * @return regresa el valor que tenemos en el final de la pila
     * si el valor no existe regresa vacia
     */
    public String pop(){
        String value = "";
        if(tope>=0){
            value = STACK[tope];
            tope --;
        }
        return value;
    }

    /**
     * Metodo que ingresa un valor a la pila, nos manda un true si se agregó
     * y nos manda un false si la pila está vacia.
     * @param value
     * @return
     */
    public boolean push (String value){
        boolean isSucces;
        if(tope < MAXIMO){
            tope++;
            STACK[tope]=value;
            isSucces = true;
        }
        else{
            isSucces = false;
        }
        return isSucces;
    }

    public MiStack(){
        this(10);
    }

    public MiStack(int max){
        MAXIMO =max;
        STACK = new String [MAXIMO];
        tope = -1;
    }

}
