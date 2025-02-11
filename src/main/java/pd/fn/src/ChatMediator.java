package pd.fn.src;

public interface ChatMediator {
    void enviarMensaje(String texto, Usuario user);
    void agregarUsuario(Usuario usuario);
}
