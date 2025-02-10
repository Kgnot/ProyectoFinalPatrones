package pd.fn.src;

import java.sql.Time;

public class RetiroSucursal extends Envio {

    public RetiroSucursal(String destino, float costo)
    {
        super(destino,costo);
    }


    @Override
    public float calcularTiempo() {
        return 0f;
    }
}
