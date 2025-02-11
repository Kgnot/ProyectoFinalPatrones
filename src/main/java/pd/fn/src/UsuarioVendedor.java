package pd.fn.src;

import pd.fn.io.Salida;
import pd.fn.io.SalidaPantalla;

public class UsuarioVendedor extends Usuario {

    private final Salida out = new SalidaPantalla();

    public UsuarioVendedor(ChatMediator chat, String nombre) {
        super(chat, nombre);
    }


    @Override
    public void enviarMensaje(String mensaje) {
        chat.enviarMensaje(mensaje, this);
    }

    @Override
    public void recibirMensaje(String mensaje, Usuario user) {
        out.imprimir("Mensaje recibido de: "+user.nombre);
        out.imprimir("mensaje: "+mensaje);
        // Aqui se podría implementar un tipo de interfaz visual
    }
}