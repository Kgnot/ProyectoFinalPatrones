package pd.fn.src;

import java.util.ArrayList;
import java.util.List;

public class Categoria implements ElementoCatalogo{

    private List<ElementoCatalogo> elementos;

    public Categoria()
    {
        elementos = new ArrayList<>();
    }

    @Override
    public void mostrar() {
        StringBuilder json = new StringBuilder("{\n");
        json.append("  \"categoria\": {\n");
        json.append("    \"elementos\": [\n");

        // Recorremos cada elemento de la categoría
        for (ElementoCatalogo elemento : elementos) {
               elemento.mostrar();
        }

        json.append("    ]\n");
        json.append("  }\n");
        json.append("}");
        System.out.println(json);
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
