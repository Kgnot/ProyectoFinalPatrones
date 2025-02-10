package pd.fn.src;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import pd.fn.io.Salida;
import pd.fn.io.SalidaPantalla;

@Setter
@Getter
@ToString
public class PublicacionProducto extends Publicacion{

    private String title;
    private String desc;
    private String details;
// El apartado de aqui es para las salidas
    private final Salida out = new SalidaPantalla();
    public PublicacionProducto(Usuario usuario) {super(usuario);}
    public PublicacionProducto(PublicacionProducto pb)
    {
        super(pb);
        if(pb!=null)
        {
            this.title=pb.title;
            this.desc = pb.desc;
            this.details = pb.details;
        }
    }
    @Override
    public void publicar()
    {
        // supongamos que se publica.
        out.salida("Se publicaaa! ");
    }
    @Override
    public Publicacion clone() {
        return new PublicacionProducto(this);
    }
}
