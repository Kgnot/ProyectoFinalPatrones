package pd.fn.src.service;

import pd.fn.io.Salida;
import pd.fn.io.SalidaPantalla;

public class FacturaService {

    private Salida out;

    public FacturaService() {
        out = new SalidaPantalla();
    }

    public void generarFactura(String email) {
        out.imprimir("Factura generada para: " + email);
    }
}
