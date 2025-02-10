package Flyweight;
// Fábrica Flyweight usando ArrayList en lugar de HashMap
import java.util.ArrayList;
import java.util.List;

class FlyweightFactory {
    private static final List<ReseñaFlyweight> reseñasComunes = new ArrayList<>();

    public static ReseñaFlyweight obtenerReseña(String contenido) {
        // Buscar si ya existe una reseña con el mismo contenido
        for (ReseñaFlyweight r : reseñasComunes) {
            if (r.obtenerContenido().equals(contenido)) {
                return r;
            }
        }
        // Si no existe, se crea y se añade a la lista
        ReseñaFlyweight nuevaReseña = new ReseñaFlyweight(contenido);
        reseñasComunes.add(nuevaReseña);
        return nuevaReseña;
    }
}
