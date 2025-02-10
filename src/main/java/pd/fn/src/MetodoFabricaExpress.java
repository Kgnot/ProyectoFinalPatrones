package pd.fn.src;

import pd.fn.src.utils.MetodoFabricaEnvio;

public class MetodoFabricaExpress extends MetodoFabricaEnvio {
    @Override
    public Envio fabricaEnvio(String destino, float costo)
    {
        return new EnvioExpress(destino,costo);
    }
}
