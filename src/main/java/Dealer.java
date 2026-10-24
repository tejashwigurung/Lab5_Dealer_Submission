import java.util.ArrayList;

public class Dealer {
    // TODO: Declare a private final ArrayList<Card> named hand.
    private final ArrayList<Card> hand;

    public Dealer() {
        // TODO: Initialize the dealer's empty hand.
        hand = null;
    }

    public void receiveCard(Card card) {
        // TODO: Add a non-null card to the dealer's hand.
    }

    public ArrayList<Card> getHand() {
        // TODO: Return the dealer's hand.
        return null;
    }

    public int getHandTotal() {
        // TODO: Add Blackjack values for all cards.
        // Number cards use their number; Jack, Queen, and King are 10.
        // Count each Ace as 11, then change Aces to 1 as needed to avoid a bust.
        return 0;
    }

    public void playTurn(Deck deck) {
        // TODO: While the hand total is below 17, deal one card from the deck.
        // Stop if the deck is empty. The dealer stands on soft or hard 17.
    }
}
