package pd.fn;

import pd.fn.src.Buscador;
import pd.fn.src.BuscarAPI;
import pd.fn.src.BuscarBaseDatos;
import pd.fn.src.BuscarRedis;

public class Main {
    public static void main(String[] args) {

        Buscador buscador = new Buscador();

        // Si se va a usar para buscar un usuario seria a la base de datos
        buscador.setEstrategia(new BuscarBaseDatos());
        buscador.buscar("Usuario1");
        // O si queremos buscar algun producto previamente cargado , posiblemente:
        buscador.setEstrategia(new BuscarRedis());
        buscador.buscar("producto Leche");
        // O si deseamos buscar en una base de datos ajena con un API como el clima
        buscador.setEstrategia(new BuscarAPI());
        buscador.buscar("Bogotá");
    }
}