package pd.fn;

import pd.fn.src.ChatMercadoLibre;
import pd.fn.src.UsuarioComprador;

public class Main {
    public static void main(String[] args) {

        // primero creamos el chatMediator:
        ChatMercadoLibre chat = new ChatMercadoLibre();
        // creamos a los dos usuarios:
        UsuarioComprador comprador = new UsuarioComprador(chat,"Alan");
        UsuarioComprador vendedor = new UsuarioComprador(chat,"Luis");
        // una vez creado los usuarios debemos anlcarlos al chat:
        chat.agregarUsuario(comprador);
        chat.agregarUsuario(vendedor);
        // y aqui se puede ya entrar en una comunicacion:
        comprador.enviarMensaje("Hola Luis xd");
        vendedor.enviarMensaje("usted quien es?");
        comprador.enviarMensaje("Se que usted me debe algo");
        vendedor.enviarMensaje("Llamaré a las autoridades");

        // Aqui se evidencia que el chat se efectuo correctamente
        // Lastima que no haya algo de seguridad. . .
    }
}