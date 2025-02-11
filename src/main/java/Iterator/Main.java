package Iterator;
// Clase Main
public class Main {
    public static void main(String[] args) {
        Salida salida = new SalidaPantalla();
        Entrada entrada = new EntradaTeclado();
        ListaFavoritos listaFavoritos = new ListaFavoritos();

        salida.mostrarMensaje("Lista de favoritos");
        // Permitir al usuario agregar productos
        String opcion;
        do {
            salida.mostrarMensaje("Ingrese el nombre del producto:");
            String nombre = entrada.leerTexto();
            
            salida.mostrarMensaje("Ingrese el precio del producto:");
            double precio = entrada.leerNumero();
            
            listaFavoritos.agregarProducto(new Producto(nombre, precio));

            salida.mostrarMensaje("Desea agregar otro producto (si/no):");
            entrada.leerTexto(); 
            opcion = entrada.leerTexto();
        } while (opcion.equalsIgnoreCase("si"));

        // Recorrer la lista de favoritos usando el iterador
        IteradorFavoritos iterador = listaFavoritos.crearIterador();
        salida.mostrarMensaje("\nProductos en tu lista de favoritos:");

        while (iterador.tieneSiguiente()) {
            Producto producto = iterador.siguiente();
            salida.mostrarMensaje( producto.getNombre() + " ($" + producto.getPrecio() + ")");
        }
    }
}