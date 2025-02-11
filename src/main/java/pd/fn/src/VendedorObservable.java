package pd.fn.src;

import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class VendedorObservable implements Observable {
    @Setter
    private String nombre;
    private List<Observador> observadores;
    public VendedorObservable()
    {
        this.observadores = new ArrayList<>();
    }

    @Override
    public void agregarObservador(Observador obs) {
        observadores.add(obs);
    }

    @Override
    public void eliminarObservador(Observador obs) {
    observadores.remove(obs);
    }

    @Override
    public void notificar(String mensaje) {
        for(var ob : observadores)
        {
            ob.actualizar(mensaje);
        }
    }

    public void subirPublicacion(Publicacion publicacion)
    {
        // aca habria un lugar donde se guarden las publicaciones:
        // luego de ser guardada:
        notificar("Se ha generado una nueva publicacion de "+nombre+" sobre "+publicacion.getTitulo());
    }

}
