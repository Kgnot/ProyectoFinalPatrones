package pd.fn.src.utils;

import pd.fn.src.Envio;
import pd.fn.src.RetiroSucursal;

public class MetodoFabricaSucursal extends MetodoFabricaEnvio {
    @Override
    public Envio fabricaEnvio(String destino, float costo) {
        return new RetiroSucursal(destino,costo);
    }
}
