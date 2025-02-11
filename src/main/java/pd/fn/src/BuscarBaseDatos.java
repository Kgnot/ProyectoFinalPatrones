package pd.fn.src;

import pd.fn.io.Salida;
import pd.fn.io.SalidaPantalla;

public class BuscarBaseDatos implements EstrategiaBuscar{

    private final Salida out = new SalidaPantalla();

    @Override
    public String buscar(String user) {

        // Aqui noosotros deberiamos poner la logica para buscar en el producto
        // puede ser un servicio con el método findByNombre();
        out.imprimir("Buscando en la Base de Datos"+ user);
        return user;
    }
}
