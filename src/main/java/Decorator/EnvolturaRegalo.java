package Decorator;
// Decorador para envoltura de regalo
class EnvolturaRegalo extends EnvioDecorator {
    public EnvolturaRegalo(Envio envio) {
        super(envio);
    }

    @Override
    public double calcularCosto() {
        return super.calcularCosto() + 2000;
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " + Envoltura de regalo";
    }
}
