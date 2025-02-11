package pd.fn.src;

import lombok.Setter;
import pd.fn.io.Salida;
import pd.fn.io.SalidaPantalla;

public class CompradorObservador implements Observador {

    private final Salida out = new SalidaPantalla();
    @Setter
    private String nombre;

    @Override
    public void actualizar(String str) {
        // Aqui iria algun patron que genere la notificacion ya sea con sms, o por correo, o en celular :D
        out.imprimir("Notifiacion exitosa: para "+nombre+" :=>" + str);
    }
}
