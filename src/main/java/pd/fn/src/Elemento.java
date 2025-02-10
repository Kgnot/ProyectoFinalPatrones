package pd.fn.src;

import lombok.Data;
import pd.fn.utils.User;

import java.io.File;

@Data
public class Elemento implements ElementoCatalogo{
    // cada uno de los elementos, es decir, de compra, deben tener ciertas cosas:
    private String titulo;
    private String descripcion;
    private File imagen;
    private User usuario;
    private  float valor;


    @Override
    public void mostrar() {
        String json = String.format(
                "{\n" +
                        "  \"titulo\": \"%s\",\n" +
                        "  \"descripcion\": \"%s\",\n" +
                        "  \"usuario\": {\n" +
                        "    \"username\": \"%s\",\n" +
                        "    \"email\": \"%s\"\n" +
                        "  },\n" +
                        "  \"valor\": %.2f\n" +
                        "}",
                this.titulo,
                this.descripcion,
                this.usuario.getNombre(),
                this.usuario.getCorreo(),
                this.valor
        );

        System.out.println(json);
    }

    @Override
    @Deprecated
    public boolean add(ElementoCatalogo cat) {
        System.out.println("No se puede eañadir elementos a una hoja");
        return false;
    }

    @Override
    @Deprecated
    public boolean delete(ElementoCatalogo cat) {
        return false;
    }

    @Override
    @Deprecated
    public ElementoCatalogo obtenerHijo(int index) {
        return null;
    }
}
