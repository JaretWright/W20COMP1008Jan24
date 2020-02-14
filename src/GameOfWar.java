import java.util.ArrayList;

public class GameOfWar {
    private ArrayList<Card> p1Hand;
    private ArrayList<Card> p2Hand;

    public GameOfWar()
    {
        p1Hand = new ArrayList<>();
        p2Hand = new ArrayList<>();

        DeckOfCards deck = new DeckOfCards();
        deck.shuffle();
        dealCards(deck);
    }


    /**
     * This method will return the # of cards for player 1
     */
    public int getP1CardCount()
    {
        return p1Hand.size();
    }

    /**
     * This method will return the # of cards for player 2
     */
    public int getP2CardCount()
    {
        return p2Hand.size();
    }


    public void dealCards(DeckOfCards deck)
    {
        for (int i=1; i<=52; i++)
        {
            if (i%2==0)
                p2Hand.add(deck.dealTopCard());
            else
                p1Hand.add(deck.dealTopCard());
        }
    }


    /**
     * This method will return the top Card in the players' hand
     */
    public Card getP1TopCard()
    {
        if (p1Hand.size()>0)
            return p1Hand.get(0);
        else
            return null;
    }

    /**
     * This method will return the top Card in the players' hand
     */
    public Card getP2TopCard()
    {
        if (p2Hand.size()>0)
            return p2Hand.get(0);
        else
            return null;
    }
    /**
     * This method will simulate playing 1 (or more) hands in the GameOfWar
     */
    public void playHand(ArrayList<Card> pile)
    {
        if (p1Hand.size()>0 && p2Hand.size()>0) {
            Card p1Card = p1Hand.get(0);
            Card p2Card = p2Hand.get(0);

            pile.add(p1Hand.remove(0));
            pile.add(p2Hand.remove(0));

            if (p1Card.getFaceValue() > p2Card.getFaceValue())
                p1Hand.addAll(pile);

            else if (p2Card.getFaceValue() > p1Card.getFaceValue())
                p2Hand.addAll(pile);

            else {
                if (getP1CardCount() < 4)  //p1 doesn't have enough cards for War
                {
                    p2Hand.addAll(p1Hand);
                    p2Hand.addAll(pile);
                    p1Hand.clear();
                } else if (getP2CardCount() < 4) //p2 doesn't have enough cards for War
                {
                    p1Hand.addAll(p2Hand);
                    p1Hand.addAll(pile);
                    p2Hand.clear();
                } else {
                    for (int i = 1; i <= 3; i++) {
                        pile.add(p1Hand.remove(0));
                        pile.add(p2Hand.remove(0));
                    }
                    playHand(pile);
                }
            }
        }
    }
}
