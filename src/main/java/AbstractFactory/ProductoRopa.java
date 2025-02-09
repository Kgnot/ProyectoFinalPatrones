package AbstractFactory;
// Producto de Ropa con un impuesto del 8%
class ProductoRopa extends Producto {
    public ProductoRopa(String nombre, double precioBase) {
        super(nombre, precioBase);
    }

    @Override
    public double calcularPrecioFinal() {
        return precioBase * 1.08; // 8% de impuestos
    }
}
