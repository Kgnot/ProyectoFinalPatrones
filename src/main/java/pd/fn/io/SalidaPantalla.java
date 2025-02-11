package pd.fn.io;

public class SalidaPantalla implements Salida{
    @Override
    public void imprimir(String cadena) {
        System.out.println(cadena);
    }
}
