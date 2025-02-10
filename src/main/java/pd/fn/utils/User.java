package pd.fn.utils;

import lombok.Data;

@Data
public class User {

    private String nombre;
    private String correo;

    public User(String nombre, String correo)
    {
        this.correo = correo;
        this.nombre = nombre;
    }
}
