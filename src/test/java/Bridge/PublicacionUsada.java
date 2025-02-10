package Bridge;

class PublicacionUsada extends Publicacion {
    public PublicacionUsada(MetodoPago metodoPago, String producto, double precio) {
        super(metodoPago, producto, precio);
    }
    
    public String realizarVenta() {
        return "Venta de producto usado: " + producto + ". " + metodoPago.procesarPago(precio);
    }
}
