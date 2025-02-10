package pd.fn.src.utils;

import pd.fn.src.Envio;
import pd.fn.src.EnvioClasico;

public class MetodoFabircaClasico extends MetodoFabricaEnvio{
    @Override
    public Envio fabricaEnvio(String destino, float costo) {
        return new EnvioClasico(destino, costo);
    }

}
