package Chain_of_Responsibility;

import java.util.Scanner;

class EntradaTeclado extends Entrada {
    private static Scanner scanner = new Scanner(System.in);
    
    public double leerMonto() {
        return scanner.nextDouble();
    }
}





