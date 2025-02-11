package pd.fn.src;

public abstract class Usuario {
    protected String nombre;
    protected ChatMediator chat;

    public Usuario(ChatMediator chat, String nombre)
    {
        this.chat = chat;
        this.nombre = nombre;
    }

    public abstract void enviarMensaje(String mensaje);
    public abstract void recibirMensaje(String mensaje,Usuario user);


}
