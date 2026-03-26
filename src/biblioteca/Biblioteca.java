package biblioteca;
import java.util.Date;

public class Biblioteca {

    public static void main(String[] args) {
        
        // SE REGISTRA ESTUDIANTE1, BIBLIOTECARIO1 Y LIBRO1
        Estudiante estudiante1 = new Estudiante("1031806117", "Andres", "afnoval@gmail.com", "137357", "Ing Sistemas");
        Bibliotecario bibliotecario1 = new Bibliotecario("1254879554", "Carlos", "carlos@gmail.com", "145879");
        Libro libro1 = new Libro("LIB-001", "Cien anios de soledad", "G. Garcia Marquez", true);

        // SE REGISTRA ESTUDIANTE2, BIBLIOTECARIO2 Y LIBRO2
        Estudiante estudiante2 = new Estudiante("1547896521", "David", "david@gmail.com", "137356", "Ing Sistemas");
        Bibliotecario bibliotecario2 = new Bibliotecario("1254879554", "Lucia", "lucia@gmail.com", "158978");
        Libro libro2 = new Libro("LIB-002", "La vuelta al mundo en 80 dias", "Julio Verne", true);

        // SE REGISTRA LIBRO3
        Libro libro3 = new Libro("LIB-003", "Harry Potter: La piedra filosofal", "J.K Rowling", true);

        // SE REGISTRA EL PRIMER PRESTAMO
        Prestamo prestamo1 = bibliotecario1.registrarPrestamo(estudiante1, libro1);
        prestamo1.mostrarInformacionPrestamo();
        libro1.mostrarDatosLibro();
        bibliotecario1.registrarDevolucion(prestamo1);
        System.out.println("Libro disponible? " + libro1.isDisponible());

        // SE REGISTRA EL SEGUNDO PRESTAMO
        System.out.println();
        Date hoy = new Date();
        Prestamo prestamo2 = estudiante2.solicitarPrestamo(libro2, hoy, null);
        prestamo2.mostrarInformacionPrestamo();
    }
}
