package pd.fn.src;

import java.sql.Time;

public abstract class Envio {
    private String destino;
    private float costo;
    public Envio(String destino, float costo)
    {
        this.destino = destino;
        this.costo = costo;
    }
    abstract float calcularTiempo();
}
