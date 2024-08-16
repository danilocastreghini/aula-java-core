import java.util.Scanner;

public class Main {
    // Exemplo de chamada de metodo nao estatico
    public static void main(String[] args) {
        System.out.println("Bem vindo a calculadora");
        System.out.println("Qual tipo de calculo voce quer fazer?");
        System.out.println("1. Somar");
        System.out.println("2. Subtrair");

        //Pego o numero digitado no teclado
        Scanner scanner = new Scanner(System.in);
        Integer opcao = scanner.nextInt();
        if (opcao == 1) {
            System.out.println("Soma Escolhida");
        } else if (opcao == 2) {
            System.out.println("Subtracao Escolhida");
        } else {
            System.out.println("Opcao Invalida, por favor digite novamente");
        }



        // validar o numero

        //Decisao. Se numero = 1
            //somar
        //Se numero = 2
            //subtrair
        // Se nenhuma das alternativas
            //Dizer ao usuario que nao entendeu
            // pedir o numero novamente





        //instanciando objetos do tipo MinhaCalculadora
//        var objetoCalculadora = new MinhaCalculadora();
//        MinhaCalculadora objetoCalculadora2 = new MinhaCalculadora();
//
//        //Acessando metodo dentro dos objetos
//        var somatorio = objetoCalculadora.soma(2, 4);
//        int subtracao = objetoCalculadora2.subtrair(4, 5);
//
//        System.out.println("O somatorio é: " + somatorio);
//        System.out.println("A subtracao é: "+ subtracao);
    }



}