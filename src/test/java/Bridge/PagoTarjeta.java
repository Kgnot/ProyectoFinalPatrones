package Bridge;
// Implementaciones concretas de MetodoPago
class PagoTarjeta implements MetodoPago {
    public String procesarPago(double monto) {
        return "Pago de $" + monto + " procesado con Tarjeta de Crédito.";
    }
}
