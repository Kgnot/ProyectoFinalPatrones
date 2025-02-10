package Bridge;
// Implementaciones concretas de Publicacion
class PublicacionNueva extends Publicacion {
    public PublicacionNueva(MetodoPago metodoPago, String producto, double precio) {
        super(metodoPago, producto, precio);
    }
    
    public String realizarVenta() {
        return "Venta de producto nuevo: " + producto + ". " + metodoPago.procesarPago(precio);
    }
}
