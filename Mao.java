import java.util.Random;

public class Mao {

    Random random = new Random();
    
    private int cartaPontuacao = random.nextInt(13) + 1;
    private int naipePontuacao = random.nextInt(4) + 2; 
    private int maoPontuacao = cartaPontuacao * naipePontuacao;
    private String nomeMao;

    public int getCartaPontuacao() {
        return cartaPontuacao;
    }

    public int getNaipePontuacao() {
        return naipePontuacao;
    }

    public int getMaoPontuacao() {
        return maoPontuacao;
    }
}
