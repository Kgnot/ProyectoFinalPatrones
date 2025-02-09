package AbstractFactory;
// Producto Mueble con un impuesto del 12%
class ProductoMueble extends Producto {
    public ProductoMueble(String nombre, double precioBase) {
        super(nombre, precioBase);
    }

    @Override
    public double calcularPrecioFinal() {
        return precioBase * 1.12; // 12% de impuestos
    }
}
