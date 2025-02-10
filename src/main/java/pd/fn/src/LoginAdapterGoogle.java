package pd.fn.src;

import pd.fn.ex.APIGoogle;

public class LoginAdapterGoogle implements Login{
    private APIGoogle api;
    public LoginAdapterGoogle(APIGoogle api)
    {
        this.api = api;
    }
    @Override
    public void registrarse() {
        // Aqui nosotros vamos a crear el usuario y usar la misma manera en que nos registraremos
        Usuario user = new Usuario();
        user.setNombre("");// aqui usariamos el api para extraer el json que nos manda de como es el nombre
        if(user.isNotBd())
        {
            //Si no se encuentra en la base de datos pues lo registramos
            // con el mismo EntityManager para SpringBoot :D
            System.out.println("Nos Registramosss por google!!");
        }
    }
}
