package Bridge;
import java.util.Scanner;

public class EntradaTeclado extends Entrada {
    private Scanner scanner;

    public EntradaTeclado() {
        scanner = new Scanner(System.in);
    }

    @Override
    public String leerTexto() {
        return scanner.nextLine();
    }

    @Override
    public double leerDouble() {
        return scanner.nextDouble();
    }
}
