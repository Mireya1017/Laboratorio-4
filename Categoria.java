import java.util.ArrayList;
import java.util.List;

public class Categoria {
    private String nombre;
    private String descripcion;
    private List<Contenido> contenidos;

    public Categoria(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.contenidos = new ArrayList<>();
    }

    public void agregarContenido(Contenido c) {
        contenidos.add(c);
    }

    public List<Contenido> getContenidos() {
        return contenidos;
    }

    @Override
    public String toString() {
        return nombre + " - " + descripcion;
    }
}