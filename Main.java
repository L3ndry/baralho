import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        Util inpput = new Util();

        System.out.println("Digite o nome.");
        System.out.print("Jogador 1: ");
        String jogador1 = input.nextLine();
        System.out.print("Jogador 2: ");
        String jogador2 = input.nextLine();
        System.out.print("Jogador 3: ");
        String jogador3 = input.nextLine();


        System.out.printf("j1: %s\nj2: %s\nj3: %s", jogador1, jogador2, jogador3);
        

    }
}