package AbstractFactory;
// Fábrica que crea productos de ropa
class FabricaRopa extends FabricaProducto {
    @Override
    public Producto crearProducto(String nombre, double precioBase) {
        return new ProductoRopa(nombre, precioBase);
    }
}
