package TemplateMethod;
import java.util.Scanner;

class EntradaTeclado extends Entrada{
    private Scanner scanner;

    public EntradaTeclado() {
        scanner = new Scanner(System.in);
    }
    @Override
    public double leerDouble() {
        return scanner.nextDouble();
    }
    @Override
    public int leerInt() {
        return scanner.nextInt();
    }
}