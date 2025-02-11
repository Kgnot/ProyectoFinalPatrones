package Iterator;
// Clase Lista de Favoritos

import java.util.ArrayList;
import java.util.List;

class ListaFavoritos {
    private List<Producto> favoritos = new ArrayList<>();

    public void agregarProducto(Producto producto) {
        favoritos.add(producto);
    }

    public IteradorFavoritos crearIterador() {
        return new IteradorListaFavoritos(favoritos);
    }
}