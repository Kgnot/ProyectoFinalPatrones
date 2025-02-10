package pd.fn.src;

public class EnvioClasico extends Envio {

    public EnvioClasico(String destino, float costo)
    {
        super(destino, costo);
    }

    @Override
    public float calcularTiempo()
    {
        float retorno = 12; // aqui iria alguna logica para implementar el calculo del tiempo
        return retorno;
    }

}

