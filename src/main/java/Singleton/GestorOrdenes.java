package Singleton;
// Singleton para gestionar órdenes
public class GestorOrdenes {
    private static GestorOrdenes instancia;
    private int contadorOrden = 100; // Número inicial de órdenes

    private GestorOrdenes() {}

    public static GestorOrdenes getInstancia() {
        if (instancia == null) {
            instancia = new GestorOrdenes();
        }
        return instancia;
    }

    public String generarOrden() {
        return "ORDEN-" + (contadorOrden++);
    }
}

