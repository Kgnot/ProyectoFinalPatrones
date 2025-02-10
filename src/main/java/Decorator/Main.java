package Decorator;
// Clase principal para ejecutar el programa
public class Main {
    public static void main(String[] args) {
        Entrada entrada = new EntradaTeclado();
        Salida salida = new SalidaPantalla();
        Envio envio = new EnvioBase();
        int opcion;
        do {
            salida.mostrarMensaje("Seleccione una opcion: \n1. Agregar envoltura de regalo ($2000)\n2. Agregar seguro de envio ($5000)\n3. Agregar entrega express ($7000)\n4. Finalizar seleccion");
            salida.mostrarMensaje("Ingrese una opción: ");
            opcion = entrada.leerEntero();
            
            switch (opcion) {
                case 1:
                    envio = new EnvolturaRegalo(envio);
                    break;
                case 2:
                    envio = new SeguroEnvio(envio);
                    break;
                case 3:
                    envio = new EntregaExpress(envio);
                    break;
                case 4:
                    break;
                default:
                    salida.mostrarMensaje("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 4);

        salida.mostrarMensaje("Costo total: " + envio.calcularCosto());
        salida.mostrarMensaje("Detalles: " + envio.getDescripcion());
    }
}
