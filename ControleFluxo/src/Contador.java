import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = 0;
        int parametroDois = 0;
        try {
            parametroUm = terminal.nextInt();
        } catch (InputMismatchException e) {
            System.err.println("Entrada inválida para o primeiro parâmetro. Digite um número inteiro.");
            terminal.next(); 
            return; 
        }
        System.out.println("Digite o segundo parâmetro:");
        try {
            parametroDois = terminal.nextInt();
        } catch (InputMismatchException e) {
            System.err.println("Entrada inválida para o segundo parâmetro. Digite um número inteiro.");
            terminal.next(); 
            return; 
        }

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.err.println(e.getMessage());
        }
        terminal.close();
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        }

        for (int i = parametroUm + 1; i < parametroDois; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}


    }
}
