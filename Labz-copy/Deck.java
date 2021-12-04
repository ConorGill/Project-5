/**
 * Class meant to simulate the deck of a game of Blackjack
 */
import java.util.ArrayList;
import java.util.Random;
public class Deck
{
    private ArrayList<Card> deck;
    private ArrayList<Integer> Deck;
    private int Counter;
    public Deck(){
        this.deck=new ArrayList<Card>();
        addDeck();
        this.Deck=new ArrayList<Integer>();
        makeDeck();
    }
    /*Desc: Deck the private variable is meant to represent a card that has been called so if the card at index 10
     * is drawn then the int at index 10 in Deck will also be 1 so it can mark which cards have been called.
     */
    public void makeDeck(){
        for(int c=0;c<this.deck.size()-1;c++){
            this.Deck.add(0);
        }
    }
    //Desc: Method that will be called in Shuffle to reset the Deck arraylist.
    public void resetDeck(){
        for(int c=0;c<this.Deck.size();c++){
            this.Deck.set(c,0);
        }
        this.Counter=0;
    }
    //Returns the arraylist with the card objects
    public ArrayList<Card> getDeck(){
        return this.deck;
    }
    //Returns the arraylist with the integers
    public ArrayList<Integer> getDDeck(){
        return this.Deck;
    }
    //Returns how many cards have currently been drawn
    public int getCounter(){
        return this.Counter;
    }
    /*Desc: Method that will call a random card in the deck.
     */
    public Card drawCard(){
        Random r= new Random();
        int upperbound=this.deck.size()-1;
        int card= r.nextInt(upperbound);
        while(this.Deck.get(card)!=0){
            card=r.nextInt(upperbound);
        }
        Card c= this.deck.get(card);
        this.Deck.set(card,1);
        this.Counter=this.Counter+1;
        System.out.println("A " + c.printInfo()+" has been drawn");
        return c;
    }
    // Desc: Adds a standard deck of cards to the list.   
    public void addDeck(){
        Card DAce = new Card(Rank.ACE,Suit.DIAMONDS);
        this.deck.add(DAce);
        Card DTWO = new Card(Rank.TWO,Suit.DIAMONDS);
        this.deck.add(DTWO);
        Card DTHREE = new Card(Rank.THREE,Suit.DIAMONDS);
        this.deck.add(DTHREE);
        Card DFOUR = new Card(Rank.FOUR,Suit.DIAMONDS);
        this.deck.add(DFOUR);
        Card DFIVE = new Card(Rank.FIVE,Suit.DIAMONDS);
        this.deck.add(DFIVE);
        Card DSIX = new Card(Rank.SIX,Suit.DIAMONDS);
        this.deck.add(DSIX);
        Card DSEVEN = new Card(Rank.SEVEN,Suit.DIAMONDS);
        this.deck.add(DSEVEN);
        Card DEIGHT = new Card(Rank.EIGHT,Suit.DIAMONDS);
        this.deck.add(DEIGHT);
        Card DNINE = new Card(Rank.NINE,Suit.DIAMONDS);
        this.deck.add(DNINE);
        Card DTEN = new Card(Rank.TEN,Suit.DIAMONDS);
        this.deck.add(DTEN);
        Card DJACK = new Card(Rank.JACK,Suit.DIAMONDS);
        this.deck.add(DJACK);
        Card DQUEEN = new Card(Rank.QUEEN,Suit.DIAMONDS);
        this.deck.add(DQUEEN);
        Card DKING = new Card(Rank.KING,Suit.DIAMONDS);
        this.deck.add(DKING);
        Card CAce = new Card(Rank.ACE,Suit.CLUBS);
        this.deck.add(CAce);
        Card CTWO = new Card(Rank.TWO,Suit.CLUBS);
        this.deck.add(CTWO);
        Card CTHREE = new Card(Rank.THREE,Suit.CLUBS);
        this.deck.add(CTHREE);
        Card CFOUR = new Card(Rank.FOUR,Suit.CLUBS);
        this.deck.add(CFOUR);
        Card CFIVE = new Card(Rank.FIVE,Suit.CLUBS);
        this.deck.add(CFIVE);
        Card CSIX = new Card(Rank.SIX,Suit.CLUBS);
        this.deck.add(CSIX);
        Card CSEVEN = new Card(Rank.SEVEN,Suit.CLUBS);
        this.deck.add(CSEVEN);
        Card CEIGHT = new Card(Rank.EIGHT,Suit.CLUBS);
        this.deck.add(CEIGHT);
        Card CNINE = new Card(Rank.NINE,Suit.CLUBS);
        this.deck.add(CNINE);
        Card CTEN = new Card(Rank.TEN,Suit.CLUBS);
        this.deck.add(CTEN);
        Card CJACK = new Card(Rank.JACK,Suit.CLUBS);
        this.deck.add(CJACK);
        Card CQUEEN = new Card(Rank.QUEEN,Suit.CLUBS);
        this.deck.add(CQUEEN);
        Card CKING = new Card(Rank.KING,Suit.CLUBS);
        this.deck.add(CKING);
        Card SAce = new Card(Rank.ACE,Suit.SPADES);
        this.deck.add(SAce);
        Card STWO = new Card(Rank.TWO,Suit.SPADES);
        this.deck.add(STWO);
        Card STHREE = new Card(Rank.THREE,Suit.SPADES);
        this.deck.add(STHREE);
        Card SFOUR = new Card(Rank.FOUR,Suit.SPADES);
        this.deck.add(SFOUR);
        Card SFIVE = new Card(Rank.FIVE,Suit.SPADES);
        this.deck.add(SFIVE);
        Card SSIX = new Card(Rank.SIX,Suit.SPADES);
        this.deck.add(SSIX);
        Card SSEVEN = new Card(Rank.SEVEN,Suit.SPADES);
        this.deck.add(SSEVEN);
        Card SEIGHT = new Card(Rank.EIGHT,Suit.SPADES);
        this.deck.add(SEIGHT);
        Card SNINE = new Card(Rank.NINE,Suit.SPADES);
        this.deck.add(SNINE);
        Card STEN = new Card(Rank.TEN,Suit.SPADES);
        this.deck.add(STEN);
        Card SJACK = new Card(Rank.JACK,Suit.SPADES);
        this.deck.add(SJACK);
        Card SQUEEN = new Card(Rank.QUEEN,Suit.SPADES);
        this.deck.add(SQUEEN);
        Card SKING = new Card(Rank.KING,Suit.SPADES);
        this.deck.add(SKING);
        Card HAce = new Card(Rank.ACE,Suit.HEARTS);
        this.deck.add(HAce);
        Card HTWO = new Card(Rank.TWO,Suit.HEARTS);
        this.deck.add(HTWO);
        Card HTHREE = new Card(Rank.THREE,Suit.HEARTS);
        this.deck.add(HTHREE);
        Card HFOUR = new Card(Rank.FOUR,Suit.HEARTS);
        this.deck.add(HFOUR);
        Card HFIVE = new Card(Rank.FIVE,Suit.HEARTS);
        this.deck.add(HFIVE);
        Card HSIX = new Card(Rank.SIX,Suit.HEARTS);
        this.deck.add(HSIX);
        Card HSEVEN = new Card(Rank.SEVEN,Suit.HEARTS);
        this.deck.add(HSEVEN);
        Card HEIGHT = new Card(Rank.EIGHT,Suit.HEARTS);
        this.deck.add(HEIGHT);
        Card HNINE = new Card(Rank.NINE,Suit.HEARTS);
        this.deck.add(HNINE);
        Card HTEN = new Card(Rank.TEN,Suit.HEARTS);
        this.deck.add(HTEN);
        Card HJACK = new Card(Rank.JACK,Suit.HEARTS);
        this.deck.add(HJACK);
        Card HQUEEN = new Card(Rank.QUEEN,Suit.HEARTS);
        this.deck.add(HQUEEN);
        Card HKING = new Card(Rank.KING,Suit.HEARTS);
        this.deck.add(HKING);
    }
}
