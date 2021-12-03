/**
 * Write a description of class Project5 here.
 * Simulates a game of Blackjack
 */
import java.util.Scanner;
public class Project5
{
   public static void main(String[]args){
       Card c = new Card(Rank.ACE,Suit.DIAMONDS);
       Card C = new Card(Rank.ACE,Suit.DIAMONDS);
       Player playah = new Player("John",5000);
       playah.addCard(c);
       playah.addCard(C);
       playah.printHand();
   }
}
