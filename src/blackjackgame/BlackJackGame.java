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
 static int i=0;
 static Scanner input = new Scanner (System.in);
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        
       startGame();
       game();
        
    }
    
    public static void startGame(){
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
                
                  deck = Deck.shuffleDeck(Deck.generateDeck());
                  shoe();
       /** System.out.println("Here are the cards in the hand");
        for(Card card:deck){
            System.out.printf("%s of %s\n",card.getValue(), card.getSuit());
        }**/
    }
    
    
    public static void game(){
      int hos=5;
       
       
      
       
       System.out.println("To Stand Enter 0 to Hit enter 1");
      
      hos = input.nextInt();
       
      if(hos==0){
         
        hos=0; 
        Hand.calculateHandp(hos);
      }
      if(hos==1){
          hos=1;
          Hand.setpHand(deck,BlackJackGame.i);
          System.out.printf("%s of %s\n",Hand.getpHand()[0].getValue(), Hand.getpHand()[0].getSuit());
          Hand.setdHand(deck,BlackJackGame.i);
       BlackJackGame.i++; 
       Hand.calculateHandp(hos);
       game();
       
       
      }
      
      
     
      
      
       System.out.printf("%s of %s\n",Hand.getpHand()[0].getValue(), Hand.getpHand()[0].getSuit());
       //System.out.printf("%s of %s\n",d[0].getValue(), d[0].getSuit());
        //System.out.printf("%s of %s\n",c[2].getValue(), c[2].getSuit());
       //System.out.printf("%s of %s\n",d[1].getValue(), d[1].getSuit());
       
      
    }
    
    public static void shoe(){
         int hos=1;
        for (int i=0; i<2;i++){
            Hand.setpHand(deck,BlackJackGame.i);
       BlackJackGame.i++;
          //Hand.setdHand(deck,BlackJackGame.i);
       //BlackJackGame.i++;
       
        } 
        
        System.out.printf("%s of %s\n",Hand.getpHand()[0].getValue(), Hand.getpHand()[0].getSuit());
        System.out.printf("%s of %s\n",Hand.getpHand()[1].getValue(), Hand.getpHand()[1].getSuit());
        
        
    }
    
   
    
}
