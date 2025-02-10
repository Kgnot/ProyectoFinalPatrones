package TemplateMethod;
// Clase de salida para mostrar mensajes
class SalidaPantalla extends Salida{
    @Override
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    @Override
    public void mostrarResultado(double resultado) {
        System.out.println("El precio final es: $" + resultado);
    }
}






