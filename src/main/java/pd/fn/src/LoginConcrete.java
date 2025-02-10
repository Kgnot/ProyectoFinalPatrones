package pd.fn.src;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginConcrete implements  Login{

    private Usuario usuario;
    private String password;


    @Override
    public void registrarse() {
        //Aqui iria l alogica que usaremos para registrar el usuario
        if(usuario.isNotBd())
        {
            // si es algo relaciondo con spring entonces tendriamos que manejar las transacciones
            // y tambien entitdades y algun ManagerEntity.
            System.out.println("Nos registramos de forma normal :D");
        }
        return;
    }
}
