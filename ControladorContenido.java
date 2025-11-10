import java.util.ArrayList;
import java.util.List;

public class ControladorContenido {
    private List<Contenido> contenidos = new ArrayList<>();

    public void agregarContenido(Contenido c) {
        contenidos.add(c);
    }

    public void publicarContenido(Contenido c) {
        c.publicar();
    }

    public void mostrarTodos() {
        for (Contenido c : contenidos) {
            System.out.println(c);
        }
    }

    public List<Contenido> filtrarPorCategoria(String categoria) {
        List<Contenido> resultado = new ArrayList<>();
        for (Contenido c : contenidos) {
            if (c.getCategoria().equalsIgnoreCase(categoria)) {
                resultado.add(c);
            }
        }
        return resultado;
    }
}