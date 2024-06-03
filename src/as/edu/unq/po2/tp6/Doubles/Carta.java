package as.edu.unq.po2.tp6.Doubles;

public class Carta {
    private CardValue valor;
    private String palo;

    public Carta(String valor) {
        this.valor = CardValue.fromSymbol(valor.substring(0, valor.length() - 1));
        this.palo = valor.substring(valor.length() - 1);
    }

    public String getValor() {
        return valor.name();
    }

    public String getPalo() {
        return palo;
    }

    public int getValorNumerico() {
        return valor.getValue();
    }
}