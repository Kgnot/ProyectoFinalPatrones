package pd.fn.src;


import pd.fn.io.Salida;
import pd.fn.io.SalidaPantalla;

// Esta sería la clase contexto del patron
public class Buscador {

    private EstrategiaBuscar estrategia;
    private final Salida out =  new SalidaPantalla();

    public void setEstrategia(EstrategiaBuscar estrategia)
    {
        this.estrategia = estrategia;
    }

    public void buscar(String search)
    {
        if(estrategia == null)
            return;
        String res = estrategia.buscar(search);
        out.imprimir(res);
    }


}
