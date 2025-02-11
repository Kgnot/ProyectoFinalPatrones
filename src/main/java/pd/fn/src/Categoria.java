package pd.fn.src;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Categoria implements ElementoCatalogo {

    private List<ElementoCatalogo> elementos;
    private String nombre;
    public Categoria() {
        elementos = new ArrayList<>();
    }
    @Override
    public void mostrar() {
        System.out.println(this.nombre + ": [");
        // Recorremos cada elemento de la categoría
        for (ElementoCatalogo elemento : elementos) {
            elemento.mostrar();
        }
        System.out.println("]");
    }
    @Override
    public boolean add(ElementoCatalogo cat) {
        return elementos.add(cat);
    }
    @Override
    public boolean delete(ElementoCatalogo cat) {
        return elementos.remove(cat);
    }
    @Override
    public ElementoCatalogo obtenerHijo(int index) {
        return elementos.get(index);
    }
}
