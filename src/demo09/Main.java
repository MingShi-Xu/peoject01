package demo09;

public class Main {
    public static void main(String[] args) {
        Card card = new Card();
        Card[] cards = card.createCards();
        card.clearCard(cards);
        card.dealCard(cards);
    }
}
