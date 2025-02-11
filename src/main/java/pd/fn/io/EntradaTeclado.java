package pd.fn.io;

import java.util.Scanner;

public class EntradaTeclado implements Entrada{

    private final Scanner sc = new Scanner(System.in);
    @Override
    public String capturar() {
        return sc.nextLine();
    }
}
