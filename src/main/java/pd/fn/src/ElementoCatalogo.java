package pd.fn.src;

public interface ElementoCatalogo {

    void mostrar();
    boolean add(ElementoCatalogo cat);
    boolean delete(ElementoCatalogo cat);
    ElementoCatalogo obtenerHijo(int index);
}
