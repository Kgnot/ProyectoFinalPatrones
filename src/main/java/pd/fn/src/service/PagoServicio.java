package pd.fn.src.service;

import pd.fn.io.Salida;
import pd.fn.io.SalidaPantalla;

public class PagoServicio {

    // Por lo general usariamos algun patron para esto
    // pero al no combinar patrones será solo simple

    private Salida out;

    public PagoServicio() {
        out = new SalidaPantalla();
    }

    public void procesarPago(double monto) {
        out.imprimir("Pago realizado con exito");
    }

}
