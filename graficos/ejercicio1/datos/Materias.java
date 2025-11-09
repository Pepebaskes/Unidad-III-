
package ejercicio1.datos;

/**
 *
 * @author rafae
 */
public class Materias {
    
    public String [] aArreglo(){
        String [] arreglo = new String [3];
        arreglo[0] = nombre;
        arreglo[1] = ""+semestre;
        arreglo[2] = ""+calificaciones;
        arreglo[3] = ""+promedio;
        return arreglo;
    }
    
    public Materias(String nombre, int calificaciones, int semestre, int promedio) {
          this.nombre = nombre;
          this.calificaciones = calificaciones;
          this.semestre = semestre;
          this.promedio = promedio = 0;
    }
    
    public Materias(String nombre, int calificaciones, int semestre) {
          this(nombre, calificaciones, semestre, 0);
}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(int calificaciones) {
        this.calificaciones = calificaciones;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public int getPromedio() {
        return promedio;
    }

    public void setPromedio(int promedio) {
        this.promedio = promedio;
    }
    
    
    String nombre;
    int calificaciones;
    int semestre;
    int promedio;
}
