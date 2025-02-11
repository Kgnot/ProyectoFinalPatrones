package pd.fn.src;

import java.util.HashMap;
import java.util.Map;

public class ImagenProxy implements Imagen {
    private final String url;
    private static Map<String, ImagenReal> cache;

    public ImagenProxy(String url) {
        this.url = url;
        cache = new HashMap<>();
    }

    @Override
    public void mostrar() {
        if (!cache.containsKey(url)) {
            cache.put(url, new ImagenReal(url)); // Carga solo si no está en caché
        }
        cache.get(url).mostrar();
    }
}
