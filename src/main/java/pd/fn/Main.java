package pd.fn;

import pd.fn.src.Imagen;
import pd.fn.src.ImagenProxy;

public class Main {
    public static void main(String[] args) {
        Imagen img1 = new ImagenProxy("https://mercadolibre.com/producto1.jpg");
        Imagen img2 = new ImagenProxy("https://mercadolibre.com/producto2.jpg");

        // Mostrar imágenes (se cargan por primera vez)
        img1.mostrar();
        img2.mostrar();

        // Mostrar la misma imagen nuevamente (se usa caché)
        System.out.println("\nVolviendo a mostrar imágenes:");
        img1.mostrar();
        img2.mostrar();
    }
}