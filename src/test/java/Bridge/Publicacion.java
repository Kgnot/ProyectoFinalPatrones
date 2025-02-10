package Bridge;
// Abstracción: Publicacion
abstract class Publicacion {
    protected MetodoPago metodoPago;
    protected String producto;
    protected double precio;
    
    public Publicacion(MetodoPago metodoPago, String producto, double precio) {
        this.metodoPago = metodoPago;
        this.producto = producto;
        this.precio = precio;
    }
    
    public abstract String realizarVenta();
}
