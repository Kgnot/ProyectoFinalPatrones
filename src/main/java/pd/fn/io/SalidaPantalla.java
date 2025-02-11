package pd.fn.io;

public class SalidaPantalla implements  Salida{
    @Override
    public void imprimir(String st) {
        System.out.println(st);
    }
}
