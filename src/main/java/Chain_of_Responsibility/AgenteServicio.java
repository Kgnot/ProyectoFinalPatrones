package Chain_of_Responsibility;
// Nivel 2: Agente de servicio al cliente
class AgenteServicio extends ManejadorReembolso {
    public String procesarReembolso(double monto) {
        if (monto <= 200) {
            return "Reembolso de $" + monto + " aprobado por un agente de servicio al cliente.";
        } else if (siguiente != null) {
            return siguiente.procesarReembolso(monto);
        }
        return "No se pudo procesar el reembolso.";
    }
}

