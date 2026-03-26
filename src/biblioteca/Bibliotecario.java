package biblioteca;
import java.util.Date;

public class Bibliotecario extends Persona{
    private String codigoEmpleado;

    public Bibliotecario(String id, String nombre, String correo, String codigoEmpleado){
        super(id, nombre, correo);

        this.codigoEmpleado = codigoEmpleado;
    }
            
    public String getCodigoEmpleado(){
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(String codigoEmpleado){
        this.codigoEmpleado = codigoEmpleado;
    }

    public Prestamo registrarPrestamo(Estudiante estudiante, Libro libro) {
        Date hoy = new Date();
        String idPrestamo = "PREST-" + estudiante.getCodigoEstudiante() + "-" + libro.getCodigoLibro();
        libro.setDisponible(false);
        return new Prestamo(idPrestamo, estudiante, libro, hoy, null);
    }

    public void registrarDevolucion(Prestamo prestamo){
        prestamo.setFechaDevolucion(new Date());
        prestamo.getLibro().isDisponible(true);
        System.out.println("Devolucion registrada para el prestamo: " + prestamo.getIdPrestamo());
    }
}
