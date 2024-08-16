//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static int max_value = 100;
    private static String FUNCTION_NAME = "Main Function";

    // Exemplo de chamada de metodo estatico
    public static void main(String[] args) {
        System.out.printf("Hello World");
        var somatorio = Main.soma(2, 4);
        int subtracao = Main.subtrair(4, 5);
        System.out.printf("O somatorio é: " + somatorio);
        System.out.printf("A subtracao é: "+ subtracao);
    }

    public static int soma(int a, int b) {
        return a + b;
    }

    public static int subtrair(int a, int b){
        return a - b;
    }

}