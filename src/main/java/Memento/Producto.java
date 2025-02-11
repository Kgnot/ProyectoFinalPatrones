package Memento;
// Producto: Permite modificar y restaurar su precio
public class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Guarda el estado actual del precio
    public Memento guardarPrecio() {
        return new Memento(precio);
    }

    // Restaura el precio anterior desde el Memento
    public void restaurarPrecio(Memento memento) {
        this.precio = memento.getPrecioGuardado();
    }
}
