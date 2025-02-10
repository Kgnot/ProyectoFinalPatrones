package Decorator;
// Implementación base de un envío estándar
class EnvioBase implements Envio {
    @Override
    public double calcularCosto() {
        return 10000; // Costo base del envío
    }

    @Override
    public String getDescripcion() {
        return "Envío estándar";
    }
}