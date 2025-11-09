public class Video extends Contenido {
    private int duracion; 
    private String resolucion;

    public Video(String titulo, String autor, String categoria, int duracion, String resolucion) {
        super(titulo, autor, categoria);
        this.duracion = duracion;
        this.resolucion = resolucion;
    }

    @Override
    public void publicar() {
        publicado = true;
        fechaPublicacion = java.time.LocalDate.now();
        System.out.println("Video publicado: " + titulo);
    }

    @Override
    public void visualizar() {
        System.out.println("=== Video ===");
        System.out.println("Título: " + titulo);
        System.out.println("Duración: " + duracion + " segundos");
        System.out.println("Resolución: " + resolucion);
    }
}