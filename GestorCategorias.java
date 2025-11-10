import java.util.ArrayList;
import java.util.List;

public class GestorCategorias {
    private List<Categoria> categorias = new ArrayList<>();

    public void crearCategoria(String nombre, String descripcion) {
        categorias.add(new Categoria(nombre, descripcion));
        System.out.println("Categoría creada: " + nombre);
    }

    public List<Categoria> getCategorias() {
        return categorias;
    }
}