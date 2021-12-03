
/**
 * Write a description of class Deck here.
 * Represents the qualities of a card.
 */
public class Card
{
    private Rank rank;
    private Suit suit;
    public Card(Rank r, Suit s){
        rank=r;
        suit=s;
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
}
