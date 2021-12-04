
/**
 * Simulates the dealer of Blackjack
 */
import java.util.ArrayList;
public class Dealer
{
    private int Bet;
    private ArrayList<Card> hand;
    //Constructor that sets the bet of the game.
    public Dealer(int B){
        this.Bet=B;
        this.hand=new ArrayList<Card>();
    }
    //Returns the Bet variable.
    public int getBet(){
        return this.Bet;
    }
    //Desc: Method that prints out the hand of the Dealer. 
    public void printHand(){
       for(Card c:this.hand){
           System.out.println("The Dealer has a " + c.getRank() + " of " + c.getSuitName());
       }
    }
    /*
     * Desc:Adds card to hand
     * @param C: The Card being added
     */
    public  void addCard(Card C){
        this.hand.add(C);
    }
    //Gets score of the hand.
    public int getScore(){
        int x=0;
        for(Card c:this.hand){
            x=x+c.getValue();
        }
        return x;
    }
    //Desc:Wipes the hand of the dealer
    public void wipeHand(){
        this.hand.clear();
    }
}
