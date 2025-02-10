package TemplateMethod;
// Clase abstracta que define el Template Method
abstract class Descuento {
    public final double calcularPrecioFinal(double precioBase, int cantidad) {
        if (!aplicaDescuento(cantidad)) {
            return precioBase * cantidad;
        }
        return aplicarDescuento(precioBase, cantidad);
    }

    protected abstract boolean aplicaDescuento(int cantidad);
    protected abstract double aplicarDescuento(double precioBase, int cantidad);
}