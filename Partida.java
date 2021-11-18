import java.util.Scanner;

class Partida {

    private Scanner input = new Scanner(System.in);
    
    private int maxJogadores = 3;
    private String[] nomes = new String[maxJogadores]; // Array para armazenar os nomes dos jogadores.
    private int quantidadeRodadas = 3;

    public void Partida() {

        for (int contador = 0; contador < nomes.length; contador++) { // Loop para escrever três nomes.

            if (contador == 0) {

                System.out.println("- Olá jogadores, registrem os seus nomes.\n");
            }

            System.out.printf("Jogador %d: ", contador + 1);
            nomes[contador] = input.nextLine();

        }

        for (int contador = 1; contador <= quantidadeRodadas; contador++) {

            System.out.printf("Rodada %d:", contador);

            Jogador j1 = new Jogador(nomes[0]); //

            System.out.printf("%s:", );

        }

        public void Jogar() {

            
        }

    }
}