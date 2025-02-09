package AbstractFactory;

// Clase abstracta para la fábrica de productos
abstract class FabricaProducto {
    public abstract Producto crearProducto(String nombre, double precioBase);
}
