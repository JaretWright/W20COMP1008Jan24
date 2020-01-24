import java.util.Arrays;
import java.util.List;

public class Card {
    
    //These are the instance variables.  These are set for each Card object.  
    //They are marked as private so that ONLY the card class can control how they are
    //set
    private String faceName, suit;

    /**
     * This is the constructor.  It's goal is to validate the arguments and set
     * valid values in the instance variables
     * @param faceName - 2,3,4,5,6,7,8,9,10,jack,queen,king or ace
     * @param suit - hearts, spades, diamonds, clubs
     */
    public Card(String faceName, String suit) {
        setFaceName(faceName);
        setSuit(suit);
    }

    public String getFaceName() {
        return faceName;
    }

    /**
     * This is the list of valid face names
     * @return a list of String objects with the valid face names
     */
    public static List<String> getValidFaceNames()
    {
        return Arrays.asList("2","3","4","5","6","7","8","9","10",
                "jack","queen","king","ace");
    }

    /**
     * This method will return the numeric value of a Card
     */
    public int getFaceValue()
    {
        List<String> faceNames = getValidFaceNames();
        return faceNames.indexOf(faceName)+2;
    }

    /**
     * This will validate the faceName and set the instance variable
     * @param faceName 2,3,4,5,6,7,8,9,10,jack,queen,king,ace
     */
    public void setFaceName(String faceName) {
        List<String> validFaceNames = getValidFaceNames();
        if (validFaceNames.contains(faceName))
            this.faceName = faceName;
        else
            throw new IllegalArgumentException("Valid face names are: "+validFaceNames);
    }

    public String getSuit() {
        return suit;
    }


    public static List<String> getValidSuits()
    {
        return Arrays.asList("spades","clubs","hearts","diamonds");
    }
    /**
     * This method will validate that the suitName is spades, clubs, hearts or diamonds
     * and set the instance variable
     * @param suitName spades, clubs, hearts or diamonds
     */
    public void setSuit(String suitName) {
        List<String> validSuits = Arrays.asList("spades","clubs","hearts","diamonds");
        if (validSuits.contains(suitName))
            this.suit = suitName;
        else
            throw new IllegalArgumentException("Valid suits are: spades, clubs, hearts, diamonds");
    }

    /**
     * This toString() method will return the Card as "faceName of suit"
     */
    public String toString()
    {
        return String.format("%s of %s", faceName, suit);
    }
}
