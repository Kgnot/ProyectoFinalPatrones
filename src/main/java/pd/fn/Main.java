package pd.fn;

import pd.fn.io.Salida;
import pd.fn.io.SalidaPantalla;
import pd.fn.src.PublicacionProducto;
import pd.fn.src.Usuario;

public class Main {
    private static final Salida out = new SalidaPantalla();
    public static void main(String[] args) {
      //supongamos que aqui tenemos un usuario, entonces lo creamos rapido:
        Usuario user = new Usuario();
        user.setNombre("Luis");
        user.setNickName("Kgnot");
        // Ahora crearemos su primera publicacion -- posiblemente si usamos algun framework lo toma automaticamente
        // pero aqui le pondre el usuario
        PublicacionProducto pubProducto = new PublicacionProducto(user);
        pubProducto.setTitle("Moto N1");
        pubProducto.setDesc("Una moto muy bonita color rojo");
        pubProducto.setDetails("viene conmigo");
        pubProducto.publicar();
        // Ahora despues de creada y publicada necesitamos hacer algo diferente:
        PublicacionProducto pubProducto2 = (PublicacionProducto) pubProducto.clone();

        // Ahora despues de clonada vamos a cambiar una cosa que el señor luis quiere
        pubProducto2.setTitle("Moto P12");

        // Ahora:
       out.salida(pubProducto.toString());
       out.salida(pubProducto2.toString());

    }
}