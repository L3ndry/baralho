import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] nomes = new String[3]; // Array para armazenar os nomes dos jogadores.
        
        System.out.println("- Olá jogadores, registrem os seus nomes.\n");

        for (int contador = 0; contador < nomes.length; contador++) { // Loop para escrever vários nomes.

            System.out.printf("Jogador %d: ", contador + 1);
            nomes[contador] = input.nextLine();

        }

        Jogador j1 = new Jogador(nomes[0]); //
        Jogador j2 = new Jogador(nomes[1]); // Criação dos jogadores.
        Jogador j3 = new Jogador(nomes[2]); //

        System.out.printf("%s\n%s\n%s\n", j1.getNome(), j2.getNome(), j3.getNome());

        

        input.close();
    }
}