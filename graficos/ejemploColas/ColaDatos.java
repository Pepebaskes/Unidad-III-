package ejemploColas;

public class ColaDatos {
    private final String[] cola;
    private int size;

    public ColaDatos(int capacidad) {
        cola = new String[capacidad];
        size = 0;
    }


// metodo offer desde el primer label
public boolean offer(String dato) {
    if (dato == null || dato.isEmpty()) return false;

 //si esta llena la cola no agrega nada
    if (size >= cola.length) {
        return false; // devolvemos false indicando que no se pudo agregar
    }

    // desplazamos los elementos hacia la derecha
    for (int i = size; i > 0; i--) {
        cola[i] = cola[i - 1];
    }

    // el nuevo siempre va a la posición 0 (jTextField1)
    cola[0] = dato;
    size++;
    return true; // éxito
}


    // saca el primero que ingrese ne orden
    public String poll() {
        if (size == 0) return null;

        String eliminado = cola[size - 1];
        cola[size - 1] = null;
        size--;
        return eliminado;
    }

    // ve el siguiente en salir
    public String peek() {
        if (size == 0) return null;
        return cola[size - 1]; // el más viejo
    }

    // 
    public String[] getEstado() {
        return cola.clone();
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }
}
