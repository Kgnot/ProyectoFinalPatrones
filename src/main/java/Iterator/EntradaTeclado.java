package Iterator;
// Implementación simplificada de EntradaTeclado

import java.util.Scanner;

class EntradaTeclado extends Entrada {
    private static Scanner scanner = new Scanner(System.in);
    
    @Override
    public String leerTexto() {
        return scanner.nextLine();
    }

    @Override
    public double leerNumero() {
        return scanner.nextDouble();
    }
}
