package pd.fn.src;

import pd.fn.io.Salida;
import pd.fn.io.SalidaPantalla;
import pd.fn.utils.Carrito;
import pd.fn.utils.Producto;

public class Tienda {

    private final Salida out = new SalidaPantalla();

    public void marcarFavorito(Producto producto) {
        // Aqui se simulario el como seria marcar un producto como favorito
        producto.marcarFavorito();
        // luego se añaderia a los favoritos mediante el patorn iterator
        out.imprimir("Se marco como favorito: Favorito: "+producto.getValor());
    }

    public void agregarCarro(Producto producto) {
        // mediante un singleton meteriamos el producto al carrito
        Carrito.getInstance().add(producto);
    }

    public void comprar(Producto producto) {
        // aqui iria la logia de compra
        // Por ejemplo un patron que se uso anteriormente para poder comprar
        // Por ejemplo el usado en FACADE.
        out.imprimir("Se compró" + producto.getNombre());
    }

}
