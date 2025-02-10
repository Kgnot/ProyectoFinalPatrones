package pd.fn.src;

import pd.fn.io.Salida;
import pd.fn.io.SalidaPantalla;

public class PublicacionComentario extends Publicacion{

    private String comentario;
    private final Salida out = new SalidaPantalla();


    public PublicacionComentario(Usuario usuario){super(usuario);}


    public PublicacionComentario(PublicacionComentario pc)
    {
        super(pc);
        if(pc!=null)
        {
            this.comentario= pc.comentario;
        }
    }
    @Override
    public void publicar() {
        out.salida("Se publico el comentarioo");
    }




    @Override
    public Publicacion clone() {
        return new PublicacionComentario(this);
    }
}
