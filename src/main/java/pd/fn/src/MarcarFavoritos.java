package pd.fn.src;

import pd.fn.utils.Producto;

public class MarcarFavoritos implements Comando{

    private Tienda tienda;
    private Producto producto;

    public MarcarFavoritos(Tienda tienda, Producto producto) {
        this.producto = producto;
        this.tienda = tienda;
    }
    @Override
    public void ejecutar() {
    tienda.marcarFavorito(producto);
    }
}
