import java.util.List;

public class Reporteador implements IReportable {

    private List<Contenido> contenidos;

    public Reporteador(List<Contenido> contenidos) {
        this.contenidos = contenidos;
    }

    @Override
    public void generarReporte() {
        System.out.println("=== Reporte de Contenidos Publicados ===");
        for (Contenido c : contenidos) {
            if (c.isPublicado()) {
                System.out.println("- " + c.getTitulo() + " (" + c.getCategoria() + ")");
            }
        }
    }
}