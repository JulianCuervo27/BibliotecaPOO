package biblioteca;
import java.util.Date;

public class Prestamo {
    private String idPrestamo;
    private Estudiante estudiante;
    private Libro libro;
    private Date fechaPrestamo;
    private Date fechaDevolucion;
    
    public Prestamo (String idPrestamo, Estudiante estudiante, Libro libro, Date fechaPrestamo, Date fechaDevolucion){
        this.idPrestamo = idPrestamo;
        this.estudiante = estudiante;
        this.libro = libro;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }
    
    public String getIdPrestamo(){
        return idPrestamo;
    }
    
    public Estudiante getEstudiante(){
        return estudiante;
    }
    
    public Libro getLibro(){
        return libro;
    }
    
    public Date getFechaPrestamo(){
        return fechaPrestamo;
    }
    
    public void setFechaPrestamo(Date fechaPrestamo){
        this.fechaPrestamo = fechaPrestamo;
    }
    
    public Date getFechaDevolucion(){
        return fechaDevolucion;
    }
    
    public void setFechaDevolucion(Date fechaDevolucion){
        this.fechaDevolucion = fechaDevolucion;
    }
    
    public void mostrarInformacionPrestamo(){
        System.out.println("---- Detalle Prestamo ----");
        System.out.println("- ID Prestamo: " + idPrestamo);
        System.out.println("- Estudiante: " + estudiante.getNombre());
        System.out.println("- Libro: " + libro.getTitulo());
        System.out.println("- Fecha prestamo: " + fechaPrestamo);
        System.out.println("- Fecha devolucion: " + fechaDevolucion);
    }
}
