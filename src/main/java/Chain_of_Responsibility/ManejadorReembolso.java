package Chain_of_Responsibility;
// Clase abstracta para la cadena de responsabilidad
abstract class ManejadorReembolso {
    protected ManejadorReembolso siguiente;

    public void setSiguiente(ManejadorReembolso siguiente) {
        this.siguiente = siguiente;
    }
    public abstract String procesarReembolso(double monto);
}

