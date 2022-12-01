/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package blackjackgame;

import blackjackgame.Deck;
/**
 *
 * @author Will C-S
 */
public class BlackJackGame {

 
    public static void main(String[] args) {
       startGame();
         Card[] hand = Deck.generateDeck();
        System.out.println("Here are the cards in the hand");
         for(Card card:hand){
             System.out.printf("%s of %s\n",card.getValue(), card.getSuit());
         }
    }
    
    public static void startGame(){
        System.out.println("***********************");
        System.out.println("*Welcome to BLACKJACK*");
        System.out.println("***********************");
   		System.out.println("");
		System.out.println("");
    System.out.println(" RULES: ");
		System.out.println("* You will be dealt 2 cards. The dealer is dealt 2 cards with one face-up and one face-down.");
		System.out.println("* Face cards are worth 10, an ace is worth 1 or 11 and cards are their value.");
		System.out.println("* Cards are added up for their total.");
		System.out.println("* To obtain another card from the deck, players must \"Hit.\" To maintain their current card total, players must \"Stay.\"");
		System.out.println("* Dealer \"Hits\" till they reach 17 or more.");
		System.out.println("* The objective is to get a higher total than the dealer while staying under 21.");
		System.out.println("* If the dealer and player's total is the same then it is a\"push\" and the hand ends"); 
		System.out.println("* The player wins the bet if the total is highe than the dealer. the player will get 2x their bet if the player gets 21.");
		System.out.println("");
		System.out.println("");
    }
    
}
