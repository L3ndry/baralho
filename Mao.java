import java.util.Random;

public class Mao {

    Random random = new Random();
    
    int cartaPontuacao = random.nextInt(13) + 1;
    int naipePontuacao = random.nextInt(4) + 2; 
    int maoPontuacao = cartaPontuacao * naipePontuacao;
    String nomeMao;

    public int getMaoPontuacao() {
        return this.maoPontuacao;
    }

    public int getCartaPontuacao() {
        return cartaPontuacao;
    }

    public int getNaipePontuacao() {
        return naipePontuacao;
    }

    public void Status() {
        System.out.printf("Mao: %d * %d = %d", this.getCartaPontuacao(), this.getNaipePontuacao(), this.getMaoPontuacao());
    }
}
