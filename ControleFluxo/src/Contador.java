import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        int numeroUm = 0;
        int numeroDois = 0;
        try {
            numeroUm = terminal.nextInt();
        } catch (InputMismatchException e) {
            System.err.println("Entrada inválida para o primeiro número. Digite um número inteiro.");
            terminal.next(); 
            return; 
        }

        System.out.println("Digite o segundo número:");
        try {
            numeroDois = terminal.nextInt();
        } catch (InputMismatchException e) {
            System.err.println("Entrada inválida para o segundo número. Digite um número inteiro.");
            terminal.next(); 
            return; 
        }

        try {
            contar(numeroUm, numeroDois);
        } catch (NumeroInvalidosException e) {
            System.err.println(e.getMessage());
        } finally {
            terminal.close(); 
        }
    }

    static void contar(int numeroUm, int numeroDois) throws NumeroInvalidosException {
        if (numeroUm >= numeroDois) {
            throw new NumeroInvalidosException("O segundo número deve ser maior que o primeiro.");
        }

        for (int i = numeroUm + 1; i < numeroDois; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
