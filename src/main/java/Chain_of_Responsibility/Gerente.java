package Chain_of_Responsibility;
// Nivel 3: Gerente
class Gerente extends ManejadorReembolso {
    public String procesarReembolso(double monto) {
        if (monto > 200) {
            return "Reembolso de $" + monto + " aprobado por el gerente.";
        }
        return "No se pudo procesar el reembolso.";
    }
}


