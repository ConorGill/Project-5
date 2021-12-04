
/**
 * Write a description of class Deck here.
 * Represents the qualities of a card.
 */
public class Card
{
    private Rank rank;
    private Suit suit;
    private int Value;
    private String Suit;
    public Card(Rank r, Suit s){
        this.rank=r;
        this.suit=s;
        determineValue(this.rank);
        determineSuit(this.suit);
    }
    /*Desc: Get this Card's Rank
     * @param rank: rank of the card
     * return: the rank of the Card object
     */
    public Rank getRank(){
        return this.rank;
    }
    /*Desc: Get this Card's Type
     * @param type: Suit of the card
     * return: Suit of the card
     */
    public Suit getSuit(){
        return this.suit;
    }
    public String printInfo(){
        return this.rank + " of " + this.suit;
    }
    /*
     * Desc: Determines the value of a card
     * @param r: Rank of the current card
     * TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,TEN,JACK,QUEEN,KING,ACE
     */
    public void determineValue(Rank r){
        int x=0;
        switch(r){
            case ACE: x=1;
            break;
            case TWO: x=2;
            break;
            case THREE: x=3;
            break;
            case FOUR: x=4;
            break;
            case FIVE: x=5;
            break;
            case SIX: x=6;
            break;
            case SEVEN: x=7;
            break;
            case EIGHT: x=8;
            break;
            case NINE: x=9;
            break;
            case TEN: x=10;
            break;
            case JACK: x=10;
            break;
            case QUEEN: x=10;
            break;
            case KING: x=10;
            break;
            case ACEE: x=11;
        }
        this.Value=x;
    }
    //Desc: Returns the current Card's value
    public int getValue(){
        return this.Value;
    }
    /* Desc: Sets a string variable with the same name as the suit
     * @param s: Suit of the current Card
     * CLUBS,SPADES,DIAMONDS,HEARTS
     */
    public void determineSuit(Suit s){
        String x="";
        switch(s){
            case CLUBS: x="Clubs";
            break;
            case SPADES: x="Spades";
            break;
            case DIAMONDS: x="Diamonds";
            break;
            case HEARTS: x="Hearts";
            break;
        }
        this.Suit=x;
    }
    //Changes the value of an Ace card
    public void changeAce(int x){
        if(x==1){
        this.rank=Rank.ACE;
        }else{
        this.rank=Rank.ACEE;
        }
    }
    //Desc: Returns the name of the Suit
    public String getSuitName(){
        return this.Suit;
    }
}
