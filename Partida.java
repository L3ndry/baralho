class Partida {

    final int quantidadeRodadas = 3;
    final int pontosPrimeiro = 3;
    final int pontosSegundo = 2;
    final int pontosTerceiro = 1;
    String primeiroRank;
    String segundoRank;
    String terceiroRank;
    private int jogador1Pontuacao = 0;
    private int jogador2Pontuacao = 0;
    private int jogador3Pontuacao = 0;
    private int Rank1=0;
    private int Rank2=0;
    private int Rank3=0;

    public Partida(String jogador1, String jogador2, String jogador3){
        for(int contador = 1; contador <= quantidadeRodadas; contador++) {
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
                primeiroRank = jogador1;
                segundoRank = jogador2;
                terceiroRank = jogador3;

            } else if(jogador1Rodada > jogador3Rodada && jogador3Rodada > jogador2Rodada){ // 1 3 2

                jogador1Pontuacao += pontosPrimeiro;
                jogador3Pontuacao += pontosSegundo;
                jogador2Pontuacao += pontosTerceiro;
                primeiroRank = jogador1;
                segundoRank = jogador3;
                terceiroRank = jogador2;

            } else if(jogador2Rodada > jogador1Rodada && jogador1Rodada > jogador3Rodada){ // 2 1 3

                jogador2Pontuacao += pontosPrimeiro;
                jogador1Pontuacao += pontosSegundo;
                jogador3Pontuacao += pontosTerceiro;
                primeiroRank = jogador2;
                segundoRank = jogador1;
                terceiroRank = jogador3;

            } else if (jogador2Rodada > jogador3Rodada && jogador3Rodada > jogador1Rodada){ // 2 3 1

                jogador2Pontuacao += pontosPrimeiro;
                jogador3Pontuacao += pontosSegundo;
                jogador1Pontuacao += pontosTerceiro;
                primeiroRank = jogador2;
                segundoRank = jogador3;
                terceiroRank = jogador1;

            } else if(jogador3Rodada > jogador1Rodada && jogador1Rodada > jogador2Rodada){ // 3 1 2

                jogador3Pontuacao += pontosPrimeiro;
                jogador1Pontuacao += pontosSegundo;
                jogador2Pontuacao += pontosTerceiro;
                primeiroRank = jogador3;
                segundoRank = jogador1;
                terceiroRank = jogador2;

            } else if (jogador3Rodada > jogador2Rodada && jogador2Rodada > jogador1Rodada){ // 3 2 1

                jogador3Pontuacao += pontosPrimeiro;
                jogador2Pontuacao += pontosSegundo;
                jogador1Pontuacao += pontosTerceiro;
                primeiroRank = jogador3;
                segundoRank = jogador2;
                terceiroRank = jogador1;
            }

            if(primeiroRank == jogador1){
                Rank1 = jogador1Pontuacao;
            } else if(primeiroRank == jogador2){
                Rank1 = jogador2Pontuacao;
            } else if (primeiroRank == jogador3){
                Rank1 = jogador3Pontuacao;
            }

            if(segundoRank == jogador1){
                Rank2 = jogador1Pontuacao;
            } else if(segundoRank == jogador2){
                Rank2 = jogador2Pontuacao;
            } else if(segundoRank == jogador3){
                Rank2 = jogador3Pontuacao;
            }

            if(terceiroRank == jogador1){
                Rank3 = jogador1Pontuacao;
            } else if(terceiroRank == jogador2){
                Rank3 = jogador2Pontuacao;
            } else if (terceiroRank == jogador3){
                Rank3 = jogador3Pontuacao;
            }
            

            System.out.println("\nNesta rodada:\n");

            System.out.printf("O jogador %s ganhou %d pontos\n", primeiroRank, pontosPrimeiro);
            System.out.printf("O jogador %s agora possui %d pontos no total.\n\n", primeiroRank, Rank1);

            System.out.printf("O jogador %s ganhou %d pontos\n", segundoRank, pontosSegundo);
            System.out.printf("O jogador %s agora possui %d pontos no total.\n\n", segundoRank, Rank2);

            System.out.printf("O jogador %s ganhou %d pontos\n", terceiroRank, pontosTerceiro);
            System.out.printf("O jogador %s agora possui %d pontos no total.\n\n", terceiroRank, Rank3);
        }
    }
} 