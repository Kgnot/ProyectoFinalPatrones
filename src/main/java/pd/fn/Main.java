package pd.fn;

import pd.fn.src.*;
import pd.fn.utils.Producto;

public class Main {
    public static void main(String[] args) {

        // Para poder probar esto necesitamos crear la tienda:
        Tienda tienda = new Tienda();
        Producto celular = new Producto("Celular");
        Producto arete = new Producto("Arete");
        Producto pantalla = new Producto("Pantalla");

        // luego algo que procesa los comandos:
        // el primero sera para un procesador para comprar un producto
        Procesador procesador = new Procesador();
        Comprar comandoComprar = new Comprar(tienda, pantalla);
        MarcarFavoritos marcarFav = new MarcarFavoritos(tienda, arete);
        AgregarCarro agregarCarro = new AgregarCarro(tienda, celular);
        // Ahora asignaremos los comandos
        procesador.setComando(comandoComprar);
        procesador.activar();
        procesador.setComando(marcarFav);
        procesador.activar();
        procesador.setComando(agregarCarro);
        procesador.activar();
    }
}