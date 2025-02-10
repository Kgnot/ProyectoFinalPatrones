package Decorator;
// Decorador base
abstract class EnvioDecorator implements Envio {
    protected Envio envio;

    public EnvioDecorator(Envio envio) {
        this.envio = envio;
    }

    @Override
    public double calcularCosto() {
        return envio.calcularCosto();
    }

    @Override
    public String getDescripcion() {
        return envio.getDescripcion();
    }
}