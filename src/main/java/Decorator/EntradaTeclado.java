package Decorator;
import java.util.Scanner;
// Clase para manejar la entrada de datos desde teclado
class EntradaTeclado extends Entrada {
    private Scanner scanner;

    public EntradaTeclado() {
        scanner = new Scanner(System.in);
    }

    @Override
    public int leerEntero() {
        return scanner.nextInt();
    }
}