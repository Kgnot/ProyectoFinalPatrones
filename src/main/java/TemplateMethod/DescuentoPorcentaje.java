package TemplateMethod;
// Subclase para descuento por porcentaje
class DescuentoPorcentaje extends Descuento {
    @Override
    protected boolean aplicaDescuento(int cantidad) {
        return cantidad >= 5; // Aplica si compra 5 o más unidades
    }

    @Override
    protected double aplicarDescuento(double precioBase, int cantidad) {
        double precioTotal = precioBase * cantidad;
        return precioTotal * 0.90; // 10% de descuento
    }
}

