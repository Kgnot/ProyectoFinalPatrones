package pd.fn.src;

public class Procesador {
    private Comando comando;

        public void setComando(Comando comando)
    {
        this.comando = comando;
    }

    public void activar()
    {
        // Aqui ejecutamos el comando
        comando.ejecutar();
    }

}
