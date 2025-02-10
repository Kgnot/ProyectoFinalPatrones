package Chain_of_Responsibility;
// Nivel 1: Aprobación automática
class AprobacionAutomatica extends ManejadorReembolso {
    public String procesarReembolso(double monto) {
        if (monto <= 50) {
            return "Reembolso de $" + monto + " aprobado automáticamente.";
        } else if (siguiente != null) {
            return siguiente.procesarReembolso(monto);
        }
        return "No se pudo procesar el reembolso.";
    }
}


