package biblioteca;

public class Libro {
    private String codigoLibro;
    private String titulo;
    private String autor;
    private boolean disponible;

    public Libro (String codigoLibro, String titulo, String autor, boolean disponible) {
        this.codigoLibro = codigoLibro;
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = disponible;
    }

    public String getCodigoLibro(){
        return codigoLibro;
    }

    public void setCodigoLibro(String codigoLibro){
        this.codigoLibro = codigoLibro;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getAutor(){
        return autor;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public boolean isDisponible(){
        return disponible;
    }

    public void setDisponible(boolean disponible){
        this.disponible = disponible;
    }

    public void mostrarDatosLibro(){
        System.out.println("---- Datos Libro");
        System.out.println("- Codigo Libro: " + getCodigoLibro());
        System.out.println("---- Datos Libro");
        System.out.println("---- Datos Libro");
    }
}
