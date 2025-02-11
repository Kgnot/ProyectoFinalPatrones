package pd.fn.io;

import java.util.Scanner;

public class EntradaTeclado implements  Entrada{

    private Scanner sc;

    public EntradaTeclado()
    {
        sc =new Scanner(System.in);
    }

    @Override
    public String capturar() {
        return sc.nextLine();
    }
}
