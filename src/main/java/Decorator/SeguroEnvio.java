package Decorator;
// Decorador para seguro de envío
class SeguroEnvio extends EnvioDecorator {
    public SeguroEnvio(Envio envio) {
        super(envio);
    }

    @Override
    public double calcularCosto() {
        return super.calcularCosto() + 5000;
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " + Seguro de envío";
    }
}
