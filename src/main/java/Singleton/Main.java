package Singleton;
public class Main {
    public static void main(String[] args) {
        Entrada entrada = new EntradaTeclado();
        Salida salida = new SalidaPantalla();
        GestorOrdenes gestor = GestorOrdenes.getInstancia();

        salida.mostrarMensaje("Sistema de ordenes de Mercado Libre:");
        
        String opcion;
        do {
            String nuevaOrden = gestor.generarOrden();
            salida.mostrarMensaje("Orden generada: " + nuevaOrden);
            
            salida.mostrarMensaje("Desea generar otra orden? (s/n): ");
            opcion = entrada.leerTexto();
        } while (opcion.equalsIgnoreCase("s"));

        salida.mostrarMensaje("Gracias por usar el sistema de ordenes");
    }
}
