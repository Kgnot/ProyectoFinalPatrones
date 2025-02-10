package pd.fn.src;

public abstract class Publicacion {

    private Usuario usuario;

    public Publicacion(Usuario usuario){ this.usuario = usuario;}

    // este apartado es el que ayuda a clonar
    public Publicacion(Publicacion pub)
    {
        if(pub!=null)
        {
            this.usuario = pub.usuario;
        }
    }
    public abstract void publicar();
    public abstract Publicacion clone();

}
