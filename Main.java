import java.util.List;

public class Main {
    public static void main(String[] args) {
        ControladorContenido controlador = new ControladorContenido();
        GestorCategorias gestor = new GestorCategorias();

        gestor.crearCategoria("Educación", "Contenidos educativos");
        gestor.crearCategoria("Tecnología", "Novedades tecnológicas");

        Administrador admin = new Administrador("Mireya", "mireya@ega.com");
        Editor editor = new Editor("Julio", "julio@ega.com");

        Contenido art = new Articulo("Aprendiendo Java", "Julio", "Educación", "Texto del artículo...", "EGA");
        Contenido vid = new Video("Tutorial POO", "Mireya", "Tecnología", 300, "1080p");
        Contenido img = new Imagen("Logo EGA", "Julio", "Diseño", "800x600", "PNG");

        controlador.agregarContenido(art);
        controlador.agregarContenido(vid);
        controlador.agregarContenido(img);

        admin.crearContenido(art);
        editor.editarContenido(art, "Aprendiendo Java con ejemplos");

        controlador.publicarContenido(art);
        controlador.publicarContenido(vid);

        controlador.mostrarTodos();

        Reporteador reporteador = new Reporteador(controlador.filtrarPorCategoria("Educación"));
        reporteador.generarReporte();
    }
}