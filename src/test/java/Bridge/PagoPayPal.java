package Bridge;
class PagoPayPal implements MetodoPago {
    public String procesarPago(double monto) {
        return "Pago de $" + monto + " procesado con PayPal.";
    }
}