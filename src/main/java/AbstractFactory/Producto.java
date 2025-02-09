package AbstractFactory;
// Clase abstracta que representa un producto en Mercado Libre
abstract class Producto {
    protected String nombre;
    protected double precioBase; // Precio base sin impuestos

    public Producto(String nombre, double precioBase) {
        this.nombre = nombre;
        this.precioBase = precioBase;
    }
// Método abstracto que cada tipo de producto implementará
    public abstract double calcularPrecioFinal();

    public String getNombre() {
        return nombre;
    }
}
