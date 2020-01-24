import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DeckOfCards {
    private ArrayList<Card> deck;

    //1. define the class name
    //2. define the instance variables
    //3. define the constructor
    //4. define the get/set methods
    //5. any custom methods

    public DeckOfCards()
    {
        deck = new ArrayList<Card>();
        List<String> suits = Card.getValidSuits();
        List<String> faceNames = Card.getValidFaceNames();

        for (String suit : suits)
        {
            for (String faceName: faceNames)
                deck.add(new Card(faceName, suit));
        }
    }

    /**
     * This method will shuffle the deck of cards
     */
    public void shuffle()
    {
        Collections.shuffle(deck);
    }

    /**
     * This method will display the card objects to the console
     *
     */
    public void displayDeck()
    {
        for (Card card:deck)
            System.out.println(card);
    }

    /**
     * This method will return the top Card from the deck
     */
    public Card dealTopCard()
    {
        if (deck.size()>0)
            return deck.remove(0);
        else
            return null;
    }
}
