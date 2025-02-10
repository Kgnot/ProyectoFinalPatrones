package Bridge;
class PagoContraEntrega implements MetodoPago {
    public String procesarPago(double monto) {
        return "Pago de $" + monto + " procesado Contra Entrega.";
    }
}