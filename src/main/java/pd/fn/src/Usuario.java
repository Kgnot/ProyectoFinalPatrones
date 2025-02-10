package pd.fn.src;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Usuario {

    private String nombre;
    private String correo;
    private String quest;


    public boolean isNotBd()
    {
        return true;
    }

}
