package pd.fn;

import pd.fn.ex.APIGoogle;
import pd.fn.src.LoginAdapterGoogle;
import pd.fn.src.LoginConcrete;
import pd.fn.src.Usuario;

public class
Main {
    public static void main(String[] args) {
        //Aqui tenemos la prueba,
        Usuario user1 = new Usuario();
        user1.setNombre("Nombre1");
        user1.setCorreo("correo1");
        user1.setQuest("pregunta para registrarse ");
        LoginConcrete login = new LoginConcrete();
        login.setUsuario(user1);
        login.setPassword("password1");
        login.registrarse();
        // ahora con esto nosotros creamos un usuario:
        //nuestro usuario ingresara con google y:
        APIGoogle apiGoogle = new APIGoogle();
        LoginAdapterGoogle google = new LoginAdapterGoogle(apiGoogle);

        // de esta forma, usamos la api para ingresar de la misma forma, pero internamente :D
        google.registrarse();
    }
}