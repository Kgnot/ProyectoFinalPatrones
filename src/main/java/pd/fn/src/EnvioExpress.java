package pd.fn.src;

public class EnvioExpress extends Envio {

    public EnvioExpress(String destino, float costo)
    {
        super(destino,costo);
    }


    @Override
    public float calcularTiempo() {
        float retornoRapido= 5; //aquí iria otra función que calcularia el timpo que tarde un envio express
        return 0f;
    }
}
