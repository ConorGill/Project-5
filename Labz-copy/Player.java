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
    public Player(String Name,int Balance)throws UserError{
        this.name=Name;
        this.balance=Balance;
        this.hand=new ArrayList<Card>();
        
    }
    //Gets score of the hand.
    public int getScore(){
        int x=0;
        for(Card c:this.hand){
            x=x+c.getValue();
        }
        return x;
    }
    //Gets the hand of the player.
    public ArrayList<Card> getHand(){
        return this.hand;
    }
    /*
     * Desc:Gets the balance of the player
     */
    public int getBalance(){
        return this.balance;
    }
    //Set balance to appropiate amount
    public void setBalance(int x)throws UserError{
        if(x<1){
               if(x==0){
                   throw new UserError("You have to actually bet something you know");
               }else{
                   throw new UserError("You can't bet negative money.");   
               }
           }
        this.balance=x;
    }
    /*
     * Desc:Gets the name of the player.
     */
    public String getName(){
        return this.name;
    }
    //Desc: Sets the name of the player
    public void setName(String x){
        this.name=(x);
    }
    /*
     * Desc:Adds card to hand
     * @param C: The Card being added
     */
    public void addCard(Card C){
        this.hand.add(C);
    }
    //Desc:Wipes the hand of the player
    public void wipeHand(){
        this.hand.clear();
    }
    //Desc: Method that prints out the hand of the player. 
    public void printHand(){
       for(Card c:this.hand){
           System.out.println("You have a " + c.getRank() + " of " + c.getSuitName());
       }
    }
}
