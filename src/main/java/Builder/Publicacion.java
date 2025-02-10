package Builder;
// Producto: Representa la publicación en Mercado Libre
class Publicacion {
    private String titulo;
    private String descripcion;
    private double precio;
    private String categoria;
    
    public Publicacion(String titulo, String descripcion, double precio, String categoria) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.categoria = categoria;
    }
    
    public String mostrarDetalles() {
        return "Título: " + titulo + "\nDescripción: " + descripcion + "\nPrecio: $" + precio + "\nCategoría: " + categoria;
    }
}