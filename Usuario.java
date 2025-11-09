public abstract class Usuario {
    protected String nombre;
    protected String correo;
    protected String rol;

    public Usuario(String nombre, String correo, String rol) {
        this.nombre = nombre;
        this.correo = correo;
        this.rol = rol;
    }

    public abstract void crearContenido(Contenido c);
    public abstract void editarContenido(Contenido c, String nuevoTitulo);

    public String getRol() { return rol; }
    public String getNombre() { return nombre; }
}