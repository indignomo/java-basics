import java.util.Scanner;

public class CalculadoraAreaCirculo {
    float pi = 3.14f;
    double raio;

    Scanner input = new Scanner(System.in);

    public void calcularArea(){

        System.out.println("Insira o raio da circunferência: ");

        this.raio = input.nextInt();
        double area = pi * (raio * raio);
        System.out.println("A área da circunferência é de: " + area);
    }

}
