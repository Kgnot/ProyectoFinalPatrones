package pd.fn;

import pd.fn.src.CompradorObservador;
import pd.fn.src.Observable;
import pd.fn.src.Publicacion;
import pd.fn.src.VendedorObservable;

public class Main {
    public static void main(String[] args) {

        // aqui dentro deel test haremos:
        // Crearemos el observabel y los observadores:
        VendedorObservable vendor1 = new VendedorObservable();
        vendor1.setNombre("Daniel");

        // ahora los observadores
        CompradorObservador comprador1 = new CompradorObservador();
        comprador1.setNombre("Luis");

        CompradorObservador comprador3 = new CompradorObservador();
        comprador3.setNombre("Carlos");
        CompradorObservador comprador2 = new CompradorObservador();
        comprador2.setNombre("Pedro");

        // Ahora aqui lo que hacemos es suscribrirlos
        vendor1.agregarObservador(comprador1);
        vendor1.agregarObservador(comprador2);
        // y aqui publicamos
        vendor1.subirPublicacion(new Publicacion("COMPUTADOR ASUS", "Es un computador que si lo miras se mueve", 500000));


    }
}