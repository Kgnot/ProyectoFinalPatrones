package pd.fn.src;

import pd.fn.utils.Producto;

public class Comprar implements Comando {

    private Tienda tienda;
    private Producto producto;

    public Comprar(Tienda tienda, Producto producto) {
        this.producto = producto;
        this.tienda = tienda;
    }

    @Override
    public void ejecutar() {
        tienda.comprar(producto);
    }
}
