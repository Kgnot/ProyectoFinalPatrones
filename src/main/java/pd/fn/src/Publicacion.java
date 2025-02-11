package pd.fn.src;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Publicacion {
    private String titulo;
    private String desc;
    private double valor;
}
