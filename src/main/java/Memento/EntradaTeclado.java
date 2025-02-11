package Memento;
// EntradaTeclado: Captura datos desde el teclado

import java.util.Scanner;

class EntradaTeclado extends Entrada {
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public String leerTexto() {
        return scanner.nextLine();
    }
}



