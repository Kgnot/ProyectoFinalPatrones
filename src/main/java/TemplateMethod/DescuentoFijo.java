package TemplateMethod;
// Subclase para descuento fijo
class DescuentoFijo extends Descuento {
    @Override
    protected boolean aplicaDescuento(int cantidad) {
        return cantidad >= 10; // Aplica si compra 10 o más unidades
    }

    @Override
    protected double aplicarDescuento(double precioBase, int cantidad) {
        double precioTotal = precioBase * cantidad;
        return precioTotal - 50; // Descuento fijo de $50
    }
}