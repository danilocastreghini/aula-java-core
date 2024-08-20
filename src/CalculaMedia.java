import java.util.Scanner;

public class CalculaMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[3];
        double soma = 0;

        // Solicita as notas e armazena no array
        for (int i = 0; i < 3; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            soma += notas[i];
        }

        // Calcula a média aritmética
        double media = soma / 3;

        // Exibe o resultado
        System.out.printf("Média: %.2f%n", media);
        if (media >= 7) {
            System.out.println("Resultado: Aprovado");
        } else {
            System.out.println("Resultado: Reprovado");
        }

        scanner.close();
    }
}
