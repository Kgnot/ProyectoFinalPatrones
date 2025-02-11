package pd.fn.src;

public interface Observable {
    void agregarObservador(Observador obs);
    void eliminarObservador(Observador obs);
    void notificar(String notify);
}
