package AbstractFactory;

public class Main {
    public static void main(String[] args) {
        // Creación instancias de entrada y salida
        Entrada entrada = new EntradaTeclado();
        Salida salida = new SalidaPantalla();
        // Solicitamos el tipo de producto al usuario
        salida.mostrarMensaje("Seleccione el tipo de producto: 1. Electronico, 2. Ropa, 3. Mueble");
        int opcion = (int) entrada.leerNumero();
        entrada.leerTexto();
        // Solicitamos el nombre del producto
        salida.mostrarMensaje("Ingrese el nombre del producto:");
        String nombre = entrada.leerTexto();
        // Solicitamos el precio base del producto
        salida.mostrarMensaje("Ingrese el precio base del producto:");
        double precioBase = entrada.leerNumero();
        // Creación de la fábrica
        FabricaProducto fabrica = null;
        switch (opcion) {
            case 1:
                fabrica = new FabricaElectronicos();
                break;
            case 2:
                fabrica = new FabricaRopa();
                break;
            case 3:
                fabrica = new FabricaMuebles();
                break;
            default:
                salida.mostrarMensaje("Opción no válida.");
                return;
        }
        // Creamos el producto usando la fábrica seleccionada
        Producto producto = fabrica.crearProducto(nombre, precioBase);
        salida.mostrarMensaje("Producto creado: " + producto.getNombre() +
                "\nPrecio final: $" + producto.calcularPrecioFinal());
    }
}
