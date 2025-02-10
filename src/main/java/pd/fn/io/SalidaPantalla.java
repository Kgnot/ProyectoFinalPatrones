package pd.fn.io;

public class SalidaPantalla implements Salida{
    @Override
    public void salida(String str) {
        System.out.println(str);
    }
}
