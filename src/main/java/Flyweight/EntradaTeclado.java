package Flyweight;

import java.util.Scanner;

class EntradaTeclado extends Entrada {
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public String leerDato() {
        return scanner.nextLine();
    }
}



