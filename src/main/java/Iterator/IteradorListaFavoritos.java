package Iterator;
// Implementación del iterador

import java.util.List;

class IteradorListaFavoritos implements IteradorFavoritos {
    private List<Producto> favoritos;
    private int posicion = 0;

    public IteradorListaFavoritos(List<Producto> favoritos) {
        this.favoritos = favoritos;
    }

    @Override
    public boolean tieneSiguiente() {
        return posicion < favoritos.size();
    }

    @Override
    public Producto siguiente() {
        return favoritos.get(posicion++);
    }
}