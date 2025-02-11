package pd.fn.src;

import pd.fn.io.Salida;
import pd.fn.io.SalidaPantalla;

public class BuscarAPI implements EstrategiaBuscar{

    private final Salida out = new SalidaPantalla();

    @Override
    public String buscar(String ciudad) {

        // Aqui buscariamos en alguna Api, con lo cual
        // podriamos buscarla mediante una configuracion o otro servicio
        //puede ser algo del clima por ejemplo

        out.imprimir("Buscando mediante una api, "+ciudad);

        return "Clima, 7 Grados, "+ciudad;
    }
}
