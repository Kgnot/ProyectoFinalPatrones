package AbstractFactory;
// Producto Electrónico con un impuesto del 15%
class ProductoElectronico extends Producto {
    public ProductoElectronico(String nombre, double precioBase) {
        super(nombre, precioBase);
    }

    @Override
    public double calcularPrecioFinal() {
        return precioBase * 1.15; // 15% de impuestos
    }
}
