/**
 * Write a description of class Player here.
 * An object meant to simulate a Player with their name and current balance
 */
import java.util.ArrayList;
public class Player
{
    private String name;
    private int balance;
    private ArrayList<Card> hand;
    /*Desc: Deafult Constructor for the player
     */
    public Player()
    {
        this.name="John Doe";
        this.balance=5000;
        this.hand=new ArrayList<Card>();
    }
    /*Desc: Constructor that inputs the values for the name of the player and their balance.
     * @param Name: name of the player
     * @param Balance: Balance of the player
     */
    public Player(String Name,int Balance){
        this.name=Name;
        this.balance=Balance;
        this.hand=new ArrayList<Card>();
    }
    /*
     * Desc:Gets the balance of the player
     */
    public int getBalance(){
        return this.balance;
    }
    /*
     * Desc:Gets the name of the player.
     */
    public String getName(){
        return this.name;
    }
    /*
     * Desc:Adds card to hand
     * @param C: The Card being added
     */
    public void addCard(Card C){
        this.hand.add(C);
    }
    //Desc: Method that prints out the hand of the player. 
    public void printHand(){
       for(Card c:this.hand){
           System.out.println("You have a " + c.getRank() + " of " + c.getSuitName());
       }
    }
}
