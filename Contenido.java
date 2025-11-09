import java.time.LocalDate;

public abstract class Contenido implements IPublicable {
    protected String titulo;
    protected String autor;
    protected LocalDate fechaPublicacion;
    protected String categoria;
    protected boolean publicado;

    public Contenido(String titulo, String autor, String categoria) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.publicado = false;
    }

    public abstract void publicar();
    public abstract void visualizar();

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public LocalDate getFechaPublicacion() { return fechaPublicacion; }
    public String getCategoria() { return categoria; }
    public boolean isPublicado() { return publicado; }

    @Override
    public String toString() {
        return titulo + " (" + categoria + ") - Autor: " + autor +
               (publicado ? " [Publicado]" : " [Borrador]");
    }
}