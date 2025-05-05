import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        MaiorNumero maiorNumero = new MaiorNumero();

        System.out.println("Verificador do maior número. Insira o número A.");
        int a = input.nextInt();
        System.out.println("Verificador do maior número. Insira o número B.");
        int b = input.nextInt();


        maiorNumero.verificaMaior(a, b);

    }
}
