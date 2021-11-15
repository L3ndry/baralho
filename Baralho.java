import java.util.Random;

class Baralho {
    Random randomizar = new Random();

    private String nomeCarta;
    private int numeroCarta = randomizar.nextInt(13) + 1;
    private String nomeNaipe;
    private int numeroNaipe = randomizar.nextInt(4) + 2;
    private int pontuacaoRodada = numeroCarta * numeroNaipe;
    private String mao;

    private String getNomeCarta(){
        if(numeroCarta == 11){
            nomeCarta = "Valete";
        } else if(numeroCarta == 12){
            nomeCarta = "Dama";
        } else if(numeroCarta == 13){
            nomeCarta = "Rei";
        } else if(numeroCarta == 1){
            nomeCarta = "As";
        } else {
            nomeCarta = Integer.toString(numeroCarta);
        }
        return nomeCarta;
    }

    private String getNomeNaipe() {
        if(numeroNaipe == 2){
            nomeNaipe = "Paus";
        } else if(numeroNaipe == 3){
            nomeNaipe = "Ouros";
        } else if(numeroNaipe == 4){
            nomeNaipe = "Copas";
        } else if(numeroNaipe == 5){
            nomeNaipe = "Espadas";
        }
        return nomeNaipe;
    }

    public String getMao() {
        mao = getNomeCarta() + " de " + getNomeNaipe();
        return mao;
    }

    public int getPontuacaoRodada() {
        return pontuacaoRodada;
    }
}