package pd.fn.utils;

import pd.fn.io.Salida;
import pd.fn.io.SalidaPantalla;

import java.util.ArrayList;
import java.util.List;

public class Carrito {
    private final List<Producto> carrito;
    private final Salida out = new SalidaPantalla();

    public static Carrito instance;

    private Carrito()
    {
        carrito = new ArrayList<>();
    }

    public static Carrito getInstance()
    {
        if(instance == null )
        {
            instance = new Carrito();
        }
        return instance;
    }


    public void add(Producto producto)
    {
            carrito.add(producto);
    out.imprimir("Producto añadido al carrito :D");
    }

}
