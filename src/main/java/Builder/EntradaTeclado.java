package Builder;

// Implementación de entrada por teclado
import java.util.Scanner;
class EntradaTeclado extends Entrada {
    private Scanner scanner = new Scanner(System.in);
    
    public String leerTexto() {
        return scanner.nextLine();
    }
    
    public double leerNumero() {
        return scanner.nextDouble();
    }
}