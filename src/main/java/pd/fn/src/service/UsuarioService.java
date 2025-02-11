package pd.fn.src.service;

import pd.fn.src.entity.Usuario;

public class UsuarioService {

    // aqui nosotros podriamos usar un servicio que implemente una interfaz de un servico
    // aquel que tenga metodos como findByUser()

    public Usuario findByUsuario(String email)
    {
        // aqui buscariamos el usuario
        return new Usuario("prueba","prueba@correo.com");
    }

}
