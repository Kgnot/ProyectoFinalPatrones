package pd.fn;

import pd.fn.io.Entrada;
import pd.fn.io.EntradaTeclado;
import pd.fn.io.Salida;
import pd.fn.io.SalidaPantalla;
import pd.fn.src.Envio;
import pd.fn.src.MetodoFabricaExpress;
import pd.fn.src.utils.MetodoFabircaClasico;
import pd.fn.src.utils.MetodoFabricaEnvio;
import pd.fn.src.utils.MetodoFabricaSucursal;

public class Main {
    public static void main(String[] args) {
        Entrada in = new EntradaTeclado();
        Salida out = new SalidaPantalla();
        // primero inicializaremos las fabricas:
        MetodoFabricaEnvio envClasico = new MetodoFabircaClasico();
        MetodoFabricaEnvio envExpress = new MetodoFabricaExpress();
        MetodoFabricaEnvio retiroSucursal = new MetodoFabricaSucursal();
        // ahora refernciamos a envio:
        Envio tipoEnvio;
        //
        String eleccion;
        out.imprimir("""
                Que tipo de envio quiere?\s
                 1. Clasico
                 2. Express
                 3. Retirar de Sucursal\s""");

        eleccion = in.capturar();
        // Vamos a suponer que tenemos un envio que vale 500,000 y destino es Suba
        switch (eleccion) {
            case "1" -> tipoEnvio = envClasico.fabricaEnvio("suba",500000f);
            case "2"-> tipoEnvio = envExpress.fabricaEnvio("suba",500000f);
            default -> tipoEnvio= retiroSucursal.fabricaEnvio("suba",500000f);
        }
        out.imprimir(tipoEnvio.toString());
    }
}