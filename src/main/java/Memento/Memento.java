package Memento;
// Memento: Guarda el estado del precio del producto
public class Memento {
    private final double precioGuardado;

    public Memento(double precio) {
        this.precioGuardado = precio;
    }

    public double getPrecioGuardado() {
        return precioGuardado;
    }
}


