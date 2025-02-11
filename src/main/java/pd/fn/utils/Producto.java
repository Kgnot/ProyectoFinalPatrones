package pd.fn.utils;

public class Producto {
    private String nombre;
    private boolean favorito = false;

    public Producto(String nombre)
    {
        this.nombre = nombre;
    }

    public void marcarFavorito() {
        favorito = true;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean getValor() {
        return this.favorito;
    }
}
