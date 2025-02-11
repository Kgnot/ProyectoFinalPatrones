package pd.fn.src;

import pd.fn.io.Salida;
import pd.fn.io.SalidaPantalla;

public class BuscarRedis implements EstrategiaBuscar{

    private final Salida out = new SalidaPantalla();

    @Override
    public String buscar(String producto) {

        // Al igual que en la otra clase.
        // un servicio findByNombreRedis()
        out.imprimir("Buscando en el caché de redis: "+producto);
        return producto;
    }
}
