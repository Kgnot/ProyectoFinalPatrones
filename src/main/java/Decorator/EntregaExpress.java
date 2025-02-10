package Decorator;
// Decorador para entrega express
class EntregaExpress extends EnvioDecorator {
    public EntregaExpress(Envio envio) {
        super(envio);
    }

    @Override
    public double calcularCosto() {
        return super.calcularCosto() + 7000;
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " + Entrega express";
    }
}