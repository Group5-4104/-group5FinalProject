

package blackjackgame;

import java.util.Random;

/**
 *This class +++ Insert class description here+++
 * @author Tarick Wilson
 */
public class Deck {

    
  static  Card[] deck = new Card[52];
    
    public static Card[] generateDeck(){
         Random random = new Random();
        for(int i =0; i<deck.length; i++){
               int numValues= Card.Value.values().length;
               Card.Value value=Card.Value.values()[random.nextInt(numValues)];
           
            int numSuits= Card.Suit.values().length;
               Card.Suit suit=Card.Suit.values()[random.nextInt(numSuits)];
           
           Card card = new Card(value, suit);
           deck[i]=card;
           }
        return deck;
    }
}
