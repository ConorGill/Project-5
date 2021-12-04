/**
 * Write a description of class Project5 here.
 * Simulates a game of Blackjack
 */
import java.util.Scanner;
import java.util.Random;
public class Project5
{
   public static void main(String[]args) throws UserError {
       Player player = new Player();
       Deck deck = new Deck();
       Scanner input = new Scanner(System.in);
       System.out.println("Hello user would you like to enter in your data? 0 for no 1 for yes");
       int YN=input.nextInt();
       if(YN==1){
           try{
           System.out.println("What is your name?");
           input.next();
           String PlayerName=input.nextLine();
           System.out.println("How much money would you like to bet?");
           int Bet= input.nextInt();
           player.setName(PlayerName);
           player.setBalance(Bet);
            }catch(UserError e){
                System.err.println("User Error: " + e.getMessage());
            }
       }
       String PN=player.getName();
       int option=99;
       System.out.println("Enter in the standard bet.");
       int bet=input.nextInt();
       Dealer dealer=new Dealer(bet);
       dealer.addCard(deck.drawCard());
       //while(dealer.getScore()<=17){
       //    dealer.addCard(deck.drawCard());
       //}
       player.addCard(deck.drawCard());
       player.addCard(deck.drawCard());
       boolean broke=false;
       while(option!=-1){
       if(player.getBalance()<0){
           System.out.println("Sorry " + PN + " you don't have enough money to bet.");
           broke=true;
           option=-1;
       }
       if(deck.getCounter()>40){
           deck.resetDeck();
           System.out.println("The Deck has been shuffled.");
       }
       if(option==3){
           while(dealer.getScore()<=17){
           dealer.addCard(deck.drawCard());
           }
           if(dealer.getScore()>21){
           System.out.println("Congratulations you've won $" + bet);
           player.setBalance(player.getBalance()+bet);
           }else if(dealer.getScore()<player.getScore()){
           System.out.println("Congratulations you've won $" + bet);
           player.setBalance(player.getBalance()+bet);
           }else if(dealer.getScore()>player.getScore()){
           System.out.println("Sorry you lost $" + bet);
           player.setBalance(player.getBalance()-bet);
           }
           player.wipeHand();
           dealer.wipeHand();
           dealer.addCard(deck.drawCard());
           player.addCard(deck.drawCard());
           player.addCard(deck.drawCard());
       }
       if(option==1){
           player.addCard(deck.drawCard());
           if(player.getScore()>21){
               System.out.println("Sorry you are over 21.  You lose $" + bet);
               player.setBalance(player.getBalance()-bet);
               player.wipeHand();
               dealer.wipeHand();
               dealer.addCard(deck.drawCard());
               player.addCard(deck.drawCard());
               player.addCard(deck.drawCard());
           }
           
       }
       if(option==2){
           player.addCard(deck.drawCard());
           while(dealer.getScore()<=17){
           dealer.addCard(deck.drawCard());
           }
           if(dealer.getScore()>21){
           System.out.println("Congratulations you've won $" + 2*bet);
           player.setBalance(player.getBalance()+bet);
           }
           if(dealer.getScore()<player.getScore()){
           System.out.println("Congratulations you've won $" + bet*2);
           player.setBalance(player.getBalance()+bet);
           }
           if(dealer.getScore()>player.getScore()){
           System.out.println("Sorry you lost $" + bet*2);
           player.setBalance(player.getBalance()-bet*2);
           }
           player.wipeHand();
           dealer.wipeHand();
           dealer.addCard(deck.drawCard());
           player.addCard(deck.drawCard());
           player.addCard(deck.drawCard());
       }
       if(!broke){
       for(Card c:player.getHand()){
           if(c.getRank()==Rank.ACE){
               System.out.println("You have a " + c.printInfo() + " since that is an an ace would you want to take it as one point or eleven points?");
               System.out.println("You have a score of " + player.getScore());
               System.out.println("Enter in 1 for 1 point and 2 for 11");
               int CH=input.nextInt();
               c.changeAce(CH);
           }
       }
       System.out.println("Hello " + PN + " you currently have " + player.getBalance());
       player.printHand();
       dealer.printHand();
       System.out.println("You have a score of: " + player.getScore());
       System.out.println("The Dealer has a score of " + dealer.getScore());
       System.out.println("What do you want to do?");
       System.out.println("-1.Quit");
       System.out.println("1.Hit");
       System.out.println("2.Double Down");
       System.out.println("3.Stand");
       option=input.nextInt();
       }
       }
       System.out.println("Have a good Day!" + PN);
   }
}
