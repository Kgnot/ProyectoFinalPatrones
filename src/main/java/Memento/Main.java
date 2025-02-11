package Memento;
public class Main {
    public static void main(String[] args) {
        Entrada entrada = new EntradaTeclado();
        Salida salida = new SalidaPantalla();

        salida.mostrar("Ingrese el nombre del producto:");
        String nombre = entrada.leerTexto();

        salida.mostrar("Ingrese el precio inicial:");
        double precioInicial = Double.parseDouble(entrada.leerTexto());

        Producto producto = new Producto(nombre, precioInicial);
        Memento memento = producto.guardarPrecio(); // Guardamos el primer precio

        salida.mostrar("Precio guardado: $" + producto.getPrecio());

        salida.mostrar("\nIngrese un nuevo precio:");
        double nuevoPrecio = Double.parseDouble(entrada.leerTexto());
        producto.setPrecio(nuevoPrecio);
        salida.mostrar("Nuevo precio guardado: $" + producto.getPrecio());

        salida.mostrar("\nRestaurar el precio anterior? (si/no)");
        if (entrada.leerTexto().equalsIgnoreCase("si")) {
            producto.restaurarPrecio(memento);
            salida.mostrar("Precio restaurado: $" + producto.getPrecio());
        }
    }
}

