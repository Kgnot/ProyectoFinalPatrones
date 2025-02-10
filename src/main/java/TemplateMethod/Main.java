package TemplateMethod;
public class Main {
    public static void main(String[] args) {
        EntradaTeclado entrada = new EntradaTeclado();
        SalidaPantalla salida = new SalidaPantalla();

        salida.mostrarMensaje("Ingrese el precio base del producto:");
        double precioBase = entrada.leerDouble();

        salida.mostrarMensaje("Ingrese la cantidad de productos:");
        int cantidad = entrada.leerInt();

        Descuento descuento;
        salida.mostrarMensaje("Seleccione el tipo de descuento: 1. Porcentaje (10%)  2. Fijo ($50)");
        int opcion = entrada.leerInt();

        if (opcion == 1) {
            descuento = new DescuentoPorcentaje();
        } else {
            descuento = new DescuentoFijo();
        }

        double precioFinal = descuento.calcularPrecioFinal(precioBase, cantidad);
        salida.mostrarResultado(precioFinal);
    }
}