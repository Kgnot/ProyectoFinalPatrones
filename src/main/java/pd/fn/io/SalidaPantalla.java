package pd.fn.io;

public class SalidaPantalla implements Salida {
    @Override
    public void imprimir(String str) {
        System.out.println(str);
    }
}
