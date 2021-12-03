
/**
 * Write a description of class Player here.
 * An object meant to simulate a Player with their name and current balance
 */
public class Player
{
    private String name;
    private int balance;
    
    public Player()
    {
        name="John Doe";
        balance=5000;
    }
    public Player(String Name,int Balance){
        name=Name;
        balance=Balance;
    }
    public int getBalance(){
        return this.balance;
    }
    public String getName(){
        return this.name;
    }
}
