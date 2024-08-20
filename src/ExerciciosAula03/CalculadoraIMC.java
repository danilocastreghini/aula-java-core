package ExerciciosAula03;

import java.util.Scanner;

public class CalculadoraIMC {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o peso e a altura do usuário
        System.out.print("Informe o seu peso em kg: ");
        double peso = scanner.nextDouble();

        System.out.print("Informe a sua altura em metros: ");
        double altura = scanner.nextDouble();

        // Calcula o IMC
        double imc = peso / (altura * altura);

        // Formata o IMC com duas casas decimais
        String imcFormatado = String.format("%.2f", imc);

        // Determina a classificação e o grau de obesidade
        String classificacao;
        int grauObesidade;

        if (imc < 18.5) {
            classificacao = "Magreza";
            grauObesidade = 0;
        } else if (imc >= 18.5 && imc <= 24.9) {
            classificacao = "Normal";
            grauObesidade = 0;
        } else if (imc >= 25.0 && imc <= 29.9) {
            classificacao = "Sobrepeso";
            grauObesidade = 1;
        } else if (imc >= 30.0 && imc <= 39.9) {
            classificacao = "Obesidade";
            grauObesidade = 2;
        } else {
            classificacao = "Obesidade Grave";
            grauObesidade = 3;
        }
        // Exibe o resultado
        System.out.println("Seu IMC é: " + imcFormatado);
        System.out.println("Classificação: " + classificacao);
        System.out.println("Grau de Obesidade: " + grauObesidade);

        scanner.close();
    }
}
