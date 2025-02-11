package pd.fn.src;


import pd.fn.utils.Producto;

public class AgregarCarro implements Comando{
    private Tienda tienda;
    private Producto producto;

    public AgregarCarro(Tienda tienda, Producto producto) {
        this.producto = producto;
        this.tienda = tienda;
    }

    @Override
    public void ejecutar() {
        tienda.agregarCarro(producto);
    }
}
