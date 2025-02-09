package AbstractFactory;
// Fábrica que crea productos electrónicos
class FabricaElectronicos extends FabricaProducto {
    @Override
    public Producto crearProducto(String nombre, double precioBase) {
        return new ProductoElectronico(nombre, precioBase);
    }
}
