package biblioteca;
import java.util.Date;

public class Estudiante extends Persona{
    private String codigoEstudiante;
    private String carrera;
    
    public Estudiante (String id, String nombre, String correo, String codigoEstudiante, String carrera) {
        super (id, nombre, correo);
        this.codigoEstudiante = codigoEstudiante;
        this.carrera = carrera;
    }
    
    public String getCodigoEstudiante() {
        return codigoEstudiante;
    }
    
    public void setCodigoEstudiante(String codigoEstudiante){
        this.codigoEstudiante = codigoEstudiante;
    }
    
    public String getCarrera(){
        return carrera;
    }
    
    public void setCarrera(String carrera){
        this.carrera = carrera;
    }
    
    public Prestamo solicitarPrestamo(Libro libro, Date fechaPrestamo, Date fechaDevolucion){
        String idPrestamo = "PREST-" + this.codigoEstudiante + "-" + libro.getCodigoLibro();
        Prestamo prestamo1 = new Prestamo (idPrestamo, this, libro, fechaPrestamo, fechaDevolucion);
        return prestamo1;
    }
}
