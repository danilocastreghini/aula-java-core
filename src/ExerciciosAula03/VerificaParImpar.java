package ExerciciosAula03;

import java.util.Scanner;

public class VerificaParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que informe um número
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        // Verifica se o número é par ou ímpar
        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par.");
        } else {
            System.out.println("O número " + numero + " é ímpar.");
        }

        scanner.close();
    }
}
