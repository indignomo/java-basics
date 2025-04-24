import java.util.Scanner;

public class Cumprimentar {

    String nome;
    Scanner input = new Scanner(System.in);
    public void cumprimentarVoce(){
        System.out.println("Olá! Qual é seu nome?");
        String nome = input.nextLine();
        System.out.println("Bem-vindo, "+ nome + "! É um prazer conhecê-lo.");
    }

}
