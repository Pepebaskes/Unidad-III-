package ejemploColas;

public class ColaDatos {
    private final String[] cola;
    private int size;

    public ColaDatos(int capacidad) {
        cola = new String[capacidad];
        size = 0;
    }

    // Agregar (offer): entra por el "inicio" visual (jTextField1)
    public void offer(String dato) {
        if (dato == null || dato.isEmpty()) return;

        // si aún no está llena, aumentamos tamaño
        if (size < cola.length) {
            size++;
        }

        // desplazamos los elementos hacia la derecha
        for (int i = size - 1; i > 0; i--) {
            cola[i] = cola[i - 1];
        }

        // el nuevo siempre va a la posición 0 (jTextField1)
        cola[0] = dato;
    }

    // Sacar (poll): sale el más viejo (el que está más a la derecha)
    public String poll() {
        if (size == 0) return null;

        String eliminado = cola[size - 1];
        cola[size - 1] = null;
        size--;
        return eliminado;
    }

    // Ver el siguiente en salir (peek)
    public String peek() {
        if (size == 0) return null;
        return cola[size - 1]; // el más viejo
    }

    // Para que la ventana pueda pintar los textfields
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
