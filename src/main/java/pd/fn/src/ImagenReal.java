package pd.fn.src;

import pd.fn.io.Salida;
import pd.fn.io.SalidaPantalla;

public class ImagenReal implements Imagen {
    private String url;
    private Salida out;

    public ImagenReal(String url) {
        this.url = url;
        this.out = new SalidaPantalla();
        cargandoImagen();
    }

    private void cargandoImagen() {
        //aqui deberia haber una forma en la cual puedo cargar las imagenes y subirla a un File o o buffer para leerla :d
        out.imprimir("Se procesa la imagen");
    }

    @Override
    public void mostrar() {
        // Aqui puede ir una funcion que comunica con la interfaz, enviandole la imagen
        out.imprimir("Mostrando imagen");
    }
}
