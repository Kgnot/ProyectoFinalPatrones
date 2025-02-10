package Builder;
// Interfaz Builder: Define los métodos para construir una publicación
interface Builder {
    Builder setTitulo(String titulo);
    Builder setDescripcion(String descripcion);
    Builder setPrecio(double precio);
    Builder setCategoria(String categoria);
    Publicacion build();
}
