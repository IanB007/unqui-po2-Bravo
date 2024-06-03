package as.edu.unq.po2.tp6.Doubles;


public enum CardValue {
    ONE("1", 1), TWO("2", 2), THREE("3", 3), FOUR("4", 4), FIVE("5", 5),
    SIX("6", 6), SEVEN("7", 7), EIGHT("8", 8), NINE("9", 9), TEN("10", 10),
    JACK("J", 11), QUEEN("Q", 12), KING("K", 13);

    private final String symbol;
    private final int value;

    CardValue(String symbol, int value) {
        this.symbol = symbol;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static CardValue fromSymbol(String symbol) {
        for (CardValue cardValue : values()) {
            if (cardValue.symbol.equals(symbol)) {
                return cardValue;
            }
        }
        throw new IllegalArgumentException("Símbolo de carta inválido: " + symbol);
    }
}