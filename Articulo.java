public class Articulo extends Contenido {
    private String texto;
    private String fuente;

    public Articulo(String titulo, String autor, String categoria, String texto, String fuente) {
        super(titulo, autor, categoria);
        this.texto = texto;
        this.fuente = fuente;
    }

    @Override
    public void publicar() {
        publicado = true;
        fechaPublicacion = java.time.LocalDate.now();
        System.out.println("Artículo publicado: " + titulo);
    }

    @Override
    public void visualizar() {
        System.out.println("=== Artículo ===");
        System.out.println("Título: " + titulo);
        System.out.println("Texto: " + texto);
        System.out.println("Fuente: " + fuente);
    }
}