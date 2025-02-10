package Builder;
// Implementación del Builder para construir publicaciones
class PublicacionBuilder implements Builder {
    private String titulo;
    private String descripcion;
    private double precio;
    private String categoria;
    
    public Builder setTitulo(String titulo) {
        this.titulo = titulo;
        return this;
    }
    
    public Builder setDescripcion(String descripcion) {
        this.descripcion = descripcion;
        return this;
    }
    
    public Builder setPrecio(double precio) {
        this.precio = precio;
        return this;
    }
    
    public Builder setCategoria(String categoria) {
        this.categoria = categoria;
        return this;
    }
    
    public Publicacion build() {
        return new Publicacion(titulo, descripcion, precio, categoria);
    }
}