package Flyweight;
// Prueba
public class Main {
    public static void main(String[] args) {
        Salida salida = new SalidaPantalla();

        Reseña r1 = new Reseña("Juan", "Celular X", "Buena calidad");
        Reseña r2 = new Reseña("Ana", "Celular X", "Buena calidad");
        Reseña r3 = new Reseña("Pedro", "Laptop Y", "Llegó rápido");
        Reseña r4 = new Reseña("Luisa", "Celular X", "Buena calidad");

        salida.mostrarMensaje("Reseñas de productos:");
        salida.mostrarMensaje(r1.obtenerReseñaDetallada());
        salida.mostrarMensaje(r2.obtenerReseñaDetallada());
        salida.mostrarMensaje(r3.obtenerReseñaDetallada());
        salida.mostrarMensaje(r4.obtenerReseñaDetallada());
    }
}



