class Partida {

    final int quantidadeRodadas = 3;
    final int pontosPrimeiro = 3;
    final int pontosSegundo = 2;
    final int pontosTerceiro = 1;
    private int jogador1Pontuacao = 0;
    private int jogador2Pontuacao = 0;
    private int jogador3Pontuacao = 0;


    public Partida(String jogador1, String jogador2, String jogador3){

        for(int contador = 1; contador <= quantidadeRodadas; contador++){
            Baralho baralho1 = new Baralho();
            String jogador1Mao = baralho1.getMao();
            int jogador1Rodada = baralho1.getPontuacaoRodada();

            Baralho baralho2 = new Baralho();    
            String jogador2Mao = baralho2.getMao();
            int jogador2Rodada = baralho2.getPontuacaoRodada();

            Baralho baralho3 = new Baralho();
            String jogador3Mao = baralho3.getMao();
            int jogador3Rodada = baralho3.getPontuacaoRodada();

            System.out.printf("\nRodada %d:\n\n", contador);

            System.out.printf("- %s -\nCarta: %s\nResultado: %d\n\n", jogador1, jogador1Mao, jogador1Rodada);

            System.out.printf("- %s -\nCarta: %s\nResultado: %d\n\n", jogador2, jogador2Mao, jogador2Rodada);

            System.out.printf("- %s -\nCarta: %s\nResultado: %d\n", jogador3, jogador3Mao, jogador3Rodada);

            if(jogador1Rodada > jogador2Rodada && jogador2Rodada > jogador3Rodada){ // 1 2 3

                jogador1Pontuacao += pontosPrimeiro;
                jogador2Pontuacao += pontosSegundo;
                jogador3Pontuacao += pontosTerceiro;

            } else if(jogador1Rodada > jogador3Rodada && jogador3Rodada > jogador2Rodada){ // 1 3 2

                jogador1Pontuacao += pontosPrimeiro;
                jogador3Pontuacao += pontosSegundo;
                jogador2Pontuacao += pontosTerceiro;

            } else if(jogador2Rodada > jogador1Rodada && jogador1Rodada > jogador3Rodada){ // 2 1 3

                jogador2Pontuacao += pontosPrimeiro;
                jogador1Pontuacao += pontosSegundo;
                jogador3Pontuacao += pontosTerceiro;

            } else if (jogador2Rodada > jogador3Rodada && jogador1Rodada > jogador3Rodada){ // 2 3 1

                jogador2Pontuacao += pontosPrimeiro;
                jogador3Pontuacao += pontosSegundo;
                jogador1Pontuacao += pontosTerceiro;

            } else if(jogador3Rodada > jogador1Rodada && jogador1Rodada > jogador2Rodada){ // 3 1 2

                jogador3Pontuacao += pontosPrimeiro;
                jogador1Pontuacao += pontosSegundo;
                jogador2Pontuacao += pontosTerceiro;

            }
        }
    }
}