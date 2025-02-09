package AbstractFactory;
// Fábrica que crea productos de muebles
class FabricaMuebles extends FabricaProducto {
    @Override
    public Producto crearProducto(String nombre, double precioBase) {
        return new ProductoMueble(nombre, precioBase);
    }
}
