

package blackjackgame;

import static blackjackgame.Card.Suit.*;
import java.util.Random;

/**
 *This class +++ Insert class description here+++
 * @author Tarick Wilson
 */
public class Deck {

    
    static Card[] deck = new Card[52];
    
    //generates deck, all cards are in order by suit and value
    public static  Card[] generateDeck(){
        
        int j=0;
        for(int i =0; i<13; i++){
               
           Card card = new Card(Card.Value.values()[i], HEARTS);
           deck[j]=card;
           j++;
           }
        for(int i =0; i<13; i++){
               
           Card card = new Card(Card.Value.values()[i], SPADES);
           deck[j]=card;
           j++;
           }
        for(int i =0; i<13; i++){
               
           Card card = new Card(Card.Value.values()[i], DIAMONDS);
           deck[j]=card;
           j++;
           }
        for(int i =0; i<13; i++){
               
           Card card = new Card(Card.Value.values()[i], CLUBS);
           deck[j]=card;
           j++;
           }
        
        
        return deck;
    }
    
    
    // shuffles deck once
    public static Card[] shuffleDeck(Card[] deck){
     
        
        Random rand = new Random();
        for(int i=0; i<deck.length;i++){
            int randomIndexToSwap= rand.nextInt(deck.length);
        Card d= deck[randomIndexToSwap];
        deck[randomIndexToSwap]=deck[i];
        deck[i]=d;
        }
        
     
        return deck;
    }
    
   
 
        
}
