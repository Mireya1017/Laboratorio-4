public class Editor extends Usuario {

    public Editor(String nombre, String correo) {
        super(nombre, correo, "Editor");
    }

    @Override
    public void crearContenido(Contenido c) {
        System.out.println(nombre + " creó un nuevo contenido: " + c.getTitulo());
    }

    @Override
    public void editarContenido(Contenido c, String nuevoTitulo) {
        System.out.println(nombre + " editó el contenido: " + c.getTitulo() + " → " + nuevoTitulo);
    }
}