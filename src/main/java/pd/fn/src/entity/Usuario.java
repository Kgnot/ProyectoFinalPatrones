package pd.fn.src.entity;


import lombok.Data;

@Data
public class Usuario {
    private String nombre;
    private String email;

    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

}
