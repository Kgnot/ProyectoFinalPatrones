package pd.fn.io;

import java.util.Scanner;

public class EntradaEscritorio implements Entrada{

    private final Scanner sc;

    public EntradaEscritorio()
    {
        sc = new Scanner(System.in);
    }

    @Override
    public String capturar() {
        return sc.nextLine();
    }
}
