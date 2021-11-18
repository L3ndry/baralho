class Partida {

    private int quantidadeRodadas = 3;

    public void Partida() {

        System.out.println("O jogo está prestes a começar!");

        for (int contador = 1; contador <= quantidadeRodadas; contador++) {

            Rodada rodada = new Rodada();

        }

    }
}