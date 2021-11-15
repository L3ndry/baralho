import java.util.Scanner;

class Main {
    public static void main(String[] args){
        
        // Linha 45 Partida.java

        Scanner input = new Scanner(System.in);

        System.out.println("- Olá jogadores, digitem seus nomes!\n");

        System.out.print("Jogador 1: ");
        String jogador1 = input.nextLine();
        System.out.print("Jogador 2: ");
        String jogador2 = input.nextLine();
        System.out.print("Jogador 3: ");
        String jogador3 = input.nextLine();
        System.out.println("\nJogadores registrados! \n\n- O jogo começou!");
        Partida partida = new Partida(jogador1, jogador2, jogador3);

        input.close();
    }
}