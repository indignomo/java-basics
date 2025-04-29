import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Calculadora calculadora = new Calculadora();
        int a;
        int b;

        System.out.println("Calculadora básica. Insira o valor A:");
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        System.out.println("Valor computado. Insira o valor B:");
        b = input.nextInt();

        System.out.println("Valor computado.");
        System.out.println("Selecione a operação desejada: \n 1. Soma\n2. Subtração\n3. Multiplicaçãon\n4.Divisão");
        int resposta = input.nextInt();

   


    }
}
