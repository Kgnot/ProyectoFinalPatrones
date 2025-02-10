package Flyweight;
// Clase Reseña con datos únicos (usuario y producto)
class Reseña {
    private final ReseñaFlyweight reseña;
    private final String usuario;
    private final String producto;

    public Reseña(String usuario, String producto, String contenido) {
        this.usuario = usuario;
        this.producto = producto;
        this.reseña = FlyweightFactory.obtenerReseña(contenido);
    }

    public String obtenerReseñaDetallada() {
        return "Usuario: " + usuario + "\nProducto: " + producto + "\nReseña: " + reseña.obtenerContenido();
    }
}
