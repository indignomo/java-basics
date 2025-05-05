import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Calculadora calculadora = new Calculadora();
        double a;
        double b;
        double resultado;

        System.out.println("Calculadora básica. Insira o valor A:");
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        System.out.println("Valor computado. Insira o valor B:");
        b = input.nextInt();

        System.out.println("Valor computado.");
        System.out.println("Selecione a operação desejada:\n1. Soma\n2. Subtração\n3. Multiplicação\n4. Divisão");
        double resposta = input.nextInt();

        if(resposta == 1){
            resultado = calculadora.soma(a, b);
            System.out.println("O resultado é: " + resultado);

        } else if (resposta == 2){
            resultado = calculadora.subtracao(a, b);
            System.out.println("O resultado é: " + resultado);
        } else if (resposta == 3){
            resultado = calculadora.multiplicacao(a, b);
            System.out.println("O resultado é: " + resultado);
        } else if (resposta == 4){
            resultado = calculadora.divisao(a, b);
            System.out.println("O resultado é: " + resultado);
        } else {
            System.out.println("Opção inválida. Tente novamente.");
        }



    }
}
