package Modelo;

public class libro {
    
    private int id_libro;
    private String nombre;
    private int paginas;
    private int precio;
    private int stock;
    private String idioma;

    public libro() {
    }

    public libro(int id_libro, String nombre, int paginas, int precio, int stock, String idioma) {
        this.id_libro = id_libro;
        this.nombre = nombre;
        this.paginas = paginas;
        this.precio = precio;
        this.stock = stock;
        this.idioma = idioma;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public int getId_libro() {
        return id_libro;
    }

    public void setId_libro(int id_libro) {
        this.id_libro = id_libro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
}
