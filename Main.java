import java.util.Scanner;

class Main{
    public static void main(String[] args){

        Scanner input=new Scanner(System.in);
        String nomeJogador1;
        String nomeJogador2;

        System.out.print("Digite o nome do primeiro jogador: ");
        nomeJogador1=input.nextLine();
        System.out.print("Agora, digite o nome do segundo jogador: ");
        nomeJogador2=input.nextLine();

        Partida partida=new Partida(nomeJogador1, nomeJogador2);

    }
}