public class Imagen extends Contenido {
    private String resolucion;
    private String formato;

    public Imagen(String titulo, String autor, String categoria, String resolucion, String formato) {
        super(titulo, autor, categoria);
        this.resolucion = resolucion;
        this.formato = formato;
    }

    @Override
    public void publicar() {
        publicado = true;
        fechaPublicacion = java.time.LocalDate.now();
        System.out.println("Imagen publicada: " + titulo);
    }

    @Override
    public void visualizar() {
        System.out.println("=== Imagen ===");
        System.out.println("Título: " + titulo);
        System.out.println("Resolución: " + resolucion);
        System.out.println("Formato: " + formato);
    }
}