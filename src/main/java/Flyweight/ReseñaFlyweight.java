package Flyweight;
// Clase Flyweight que almacena frases de reseñas (datos compartidos)
class ReseñaFlyweight {
    private final String contenido;

    public ReseñaFlyweight(String contenido) {
        this.contenido = contenido;
    }

    public String obtenerContenido() {
        return contenido;
    }
}

