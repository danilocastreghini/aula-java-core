//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static int max_value = 100;
    private static String FUNCTION_NAME = "Main Function";

    // Exemplo de chamada de metodo nao estatico
    public static void main(String[] args) {
        System.out.printf("Hello World");
        //instanciando objetos do tipo MinhaCalculadora
        var objetoCalculadora = new MinhaCalculadora();
        MinhaCalculadora objetoCalculadora2 = new MinhaCalculadora();

        //Acessando metodo dentro dos objetos
        var somatorio = objetoCalculadora.soma(2, 4);
        int subtracao = objetoCalculadora2.subtrair(4, 5);
        System.out.printf("O somatorio é: " + somatorio);
        System.out.printf("A subtracao é: "+ subtracao);
    }



}