package pd.fn.src;

import java.util.ArrayList;
import java.util.List;

public class ChatMercadoLibre implements ChatMediator {

    private final List<Usuario> listUsuario;

    public ChatMercadoLibre() {
        listUsuario = new ArrayList<>();
    }

    @Override
    public void enviarMensaje(String texto, Usuario user) {
        for (var u : listUsuario) {
            if (user.equals(u)) {
                continue;
            }
            user.recibirMensaje(texto, user);
        }
    }

    @Override
    public void agregarUsuario(Usuario usuario) {
        listUsuario.add(usuario);
    }
}
