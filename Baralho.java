import java.util.Random;

class Baralho {

    Random random = new Random();

    private String nomeCarta;
    private int numeroCarta = random.nextInt(13) + 1;
    private String nomeNaipe;
    private int numeroNaipe = random.nextInt(4) + 2;
    
    private String mao;
    private int pontuacao = numeroCarta * numeroNaipe;

    private String getNomeCarta() {

        if (this.numeroCarta == 11) {
            this.nomeCarta = "Valete";
        } else if (this.numeroCarta == 12) {
            this.nomeCarta = "Dama";
        } else if (this.numeroCarta == 13) {
            this.nomeCarta = "Rei";
        } else if (this.numeroCarta == 1) {
            this.nomeCarta = "As";
        } else {
            this.nomeCarta = Integer.toString(numeroCarta);
        }

        return nomeCarta;
    }

    private String getNomeNaipe() {

        if (numeroNaipe == 2) {
            nomeNaipe = "Paus";
        } else if (numeroNaipe == 3) {
            nomeNaipe = "Ouros";
        } else if (numeroNaipe == 4) {
            nomeNaipe = "Copas";
        } else if (numeroNaipe == 5) {
            nomeNaipe = "Espadas";
        }

        return nomeNaipe;
    }

    public String getMao() {

        mao = getNomeCarta() + " de " + getNomeNaipe();
        return mao;
    }

    public int getPontuacao() {
        return pontuacao;
    }
}