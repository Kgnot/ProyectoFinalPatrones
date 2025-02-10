package pd.fn.src.utils;

import pd.fn.src.Envio;

public abstract class MetodoFabricaEnvio {

    public abstract Envio fabricaEnvio(String destino, float costo);
}
