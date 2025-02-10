package Chain_of_Responsibility;
// Clase Main
public class Main {
    public static void main(String[] args) {
        // Crear los manejadores
        ManejadorReembolso auto = new AprobacionAutomatica();
        ManejadorReembolso agente = new AgenteServicio();
        ManejadorReembolso gerente = new Gerente();

        // Construir la cadena
        auto.setSiguiente(agente);
        agente.setSiguiente(gerente);

        // Leer el monto y procesar
        Salida salida = new SalidaPantalla();
        salida.mostrarMensaje("Ingrese el monto del reembolso: ");
        Entrada entrada = new EntradaTeclado();
        double monto = entrada.leerMonto();
        
        // Procesar y mostrar resultado
        String resultado = auto.procesarReembolso(monto);//se inicia la cadena
        salida.mostrarMensaje(resultado);
    }
}


