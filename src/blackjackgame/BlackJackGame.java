/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package blackjackgame;

import blackjackgame.Deck.*;
import java.util.Scanner;

/**
 *
 * @author Will C-S
 */
public class BlackJackGame {

    static Card[] deck;
    static int count1 = 0;
    static int dcount = 0;
   static int bet=0;
    static Player player=new Player();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
       
        startGame();
        init();
        game();

    }

    //runs at the beginning of a new game and displays the rules of the game
    //only runs once per game
    public static void startGame() {
        System.out.println("***********************");
        System.out.println("*Welcome to BLACKJACK*");
        System.out.println("***********************");
        System.out.println("");
        System.out.println("");
        System.out.println(" RULES: ");
        System.out.println("* You will be dealt 2 cards. The dealer is dealt 2 cards with one face-up and one face-down.");
        System.out.println("* Face cards are worth 10, an ace is worth 11 and cards are their value.");
        System.out.println("* Cards are added up for their total.");
        System.out.println("* To obtain another card from the deck, players must \"Hit.\" To maintain their current card total, players must \"Stay.\"");
        System.out.println("* Dealer \"Hits\" till they reach 17 or more.");
        System.out.println("* The objective is to get a higher total than the dealer while staying under 21.");
        System.out.println("* If the dealer and player's total is the same then it is a\"push\" and the hand ends");
        System.out.println("* The player wins the bet if the total is highe than the dealer. the player will get 2x their bet if the player gets 21.");
        System.out.println("");
        System.out.println("");
         System.out.println("");
        bets();

    }

    // initializes the game, shuffles the deck and deals the shoe
    public static void init() {
         
        deck = Deck.shuffleDeck(Deck.generateDeck());
        shoe();
    }

    //handles and runs most of the game mechanics
    public static void game() {
        int hos = 5;

        
        
        
        
        System.out.println("To Stand Enter 0 to Hit enter 1");

        hos = input.nextInt();
        System.out.println("");

        if (hos == 0) {
            if (count1 >= 1) {
                count1 = 0;
            }
            System.out.println("Dealer's Cards");
            System.out.printf("%s of %s\n", Hand.getdHand()[count1].getValue(), Hand.getdHand()[count1].getSuit());

            count1++;
            System.out.printf("%s of %s\n", Hand.getdHand()[count1].getValue(), Hand.getdHand()[count1].getSuit());
            count1++;
            hos = 0;

            while (Hand.calculateHandd() < 17) {

                setDealerHand();

                System.out.printf("%s of %s\n", Hand.getdHand()[count1].getValue(), Hand.getdHand()[count1].getSuit());
                count1++;

            }
            System.out.println("");
            
            if (Hand.calculateHandd() > 21) {
            player.addChips();
            System.out.println("Dealer Bust, Player Wins");;
            BlackJackGame.restart();
            }else if (Hand.calculateHandd() > 21) {
            player.minChips();
            System.out.println("Player bust, Dealer wins");
            BlackJackGame.restart();
        }else if (Hand.calculateHandd() == 21) {
            player.addChips();
            System.out.println("Player Hit blackjack");
            BlackJackGame.restart();
        }else if (Hand.calculateHandp() == 21) {
            player.minChips();
            System.out.println("Dealer hit blackjack");
            BlackJackGame.restart();
            
        }else if (Hand.calculateHandd() > Hand.calculateHandp()) {
                System.out.println("Dealer Wins");
                player.minChips();
                BlackJackGame.restart();

            }  else if (Hand.calculateHandd() < Hand.calculateHandp()) {
                System.out.println("Player wins");
                player.addChips();
                BlackJackGame.restart();

            }
        }
        if (hos == 1) {
            hos = 1;
            Hand.setpHand(deck, dcount);
            dcount++;
            System.out.printf("%s of %s\n", Hand.getpHand()[count1].getValue(), Hand.getpHand()[count1].getSuit());
            count1++;
            game();

        }
    }

    //deals the shoe for each hand
    public static void shoe() {
        for (int i = 0; i < 2; i++) {
            setPlayerHand();
        }

        for (int i = 2; i < 4; i++) {
            setDealerHand();

        }
        System.out.println("Player's Shoe:");
        System.out.printf("%s of %s\n", Hand.getpHand()[0].getValue(), Hand.getpHand()[0].getSuit());
        System.out.printf("%s of %s\n", Hand.getpHand()[1].getValue(), Hand.getpHand()[1].getSuit());
        System.out.println("");
        if (Hand.calculateHandp() == 21) {
            System.out.println("Player Hit Blackjack");
            player.addChips();
            BlackJackGame.restart();
        }

        System.out.println("Dealers's Shoe:");
        System.out.printf("%s of %s\n", Hand.getdHand()[0].getValue(), Hand.getdHand()[0].getSuit());
        System.out.println("Second Card Hidden");
        System.out.println("");
        count1++;
        count1++;
    }

    //adds cards to the dealer's hand after the shoe
    public static void setDealerHand() {
        Hand.setdHand(deck, dcount);
        dcount++;

    }
 //adds cards to the dealer's hand after the shoe
    public static void setPlayerHand() {
        Hand.setpHand(deck, dcount);
        dcount++;
    }
//resttarts the game after the end of each hand
    public static void restart() {
          if (!(player.getChips()==0)){         
        Hand.restart();
        dcount = 0;
        count1 = 0;
         System.out.println();
            System.out.println("Press Enter to play another Hand");
                 System.out.println();
                input.nextLine();
                input.nextLine();
                
                bets();
                
                
        System.out.println();
        System.out.println("**********");
        System.out.println("*New Hand*");
        System.out.println("**********");
        System.out.println();
        init();
        game();}
          else{
              System.out.println("You have"+player.getChips()+"Chips");
              System.out.println("Please start a new game to get more chips");
          }

    }
    //handles capturing the user's bets
    public static void bets(){
        System.out.println("You have "+player.getChips()+" Chips");
        System.out.println();
         System.out.print("What is your bet?");
        bet = input.nextInt();
        
        if (bet<=0){
            System.out.print("Invalid bet. ");
           bets(); 
        }
        if (bet>player.getChips()){
            System.out.print("Not enough Chips for this bet.  ");
           bets(); 
        }
        player.setBet(bet);
    

}
}
