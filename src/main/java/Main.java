public class Main {
    public static void main(String[] args) {
        // TODO: Create and shuffle a deck.
        Deck deck = new Deck();
        deck.shuffle();
        // TODO: Create a dealer and deal exactly two starting cards.
        Dealer dealer = new Dealer();
        dealer.receiveCard(deck.dealCard());
        dealer.receiveCard(deck.dealCard());
        // TODO: Print the starting hand and total.
        System.out.println("Dealer's hand: " + dealer.getHand());
        System.out.println("Dealer total: " + dealer.getHandTotal());
        // TODO: Let the dealer play. Print "Dealer hits..." before each additional card.
        dealer.playTurn(deck);
        // TODO: Print the updated hand and total after every hit.
        System.out.println("Dealer stands.");
    }
}
