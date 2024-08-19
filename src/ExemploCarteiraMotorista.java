import java.util.Scanner;

public class ExemploCarteiraMotorista {
    public static void main(String[] args){
     Scanner entrada = new Scanner(System.in);
     System.out.println("Qual a sua idade? ");
     int idade = entrada.nextInt();
        System.out.println("Voce possui carteira de motorista? ");
        boolean possuiCarteira = entrada.nextBoolean();
        System.out.println("Voce esta bebado? ");
        boolean estaBebado = entrada.nextBoolean();
        //operacao logica
        if (idade >= 18 && possuiCarteira && !estaBebado) {
            System.out.println("Voce pode dirigir");
        } else {
                System.out.println("Voce nao pode dirigir");
            }
        entrada.close();
        }
    }

