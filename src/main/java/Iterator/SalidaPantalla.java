package Iterator;
// Implementación concreta SalidaPantalla
class SalidaPantalla extends Salida {
    @Override
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}