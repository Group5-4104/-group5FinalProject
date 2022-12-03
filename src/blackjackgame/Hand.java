

package blackjackgame;

/**
 *This class +++ Insert class description here+++
 * @author Tarick Wilson
 */
class Hand {
private static Card[] pHand = new Card[12];
private static int i=0;
    public static Card[] getpHand() {
        return pHand;
    }

    public static void setpHand(Card[] pHand) {
        Hand.pHand[i] = pHand[i];
        i++;
        
     /**  for(int i=0;i< Hand.i ;i++){
             System.out.printf("%s of %s\n",pHand[i].getValue(), pHand[i].getSuit());
         }**/
    }




}
