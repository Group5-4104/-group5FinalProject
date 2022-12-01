

package blackjackgame;

/**
 *This class +++ Insert class description here+++
 * @author Tarick Wilson
 */
public class Player {

    private int chips;
    private int bet;

    public int getChips() {
        return chips;
    }

    public void setChips(int chips) {
        this.chips = chips;
    }

    public int getBet() {
        return bet;
    }

    public void setBet(int bet) {
        this.bet = bet;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }
    private Hand hand;
    
    
    public Player(){
        chips=200;
        hand= new Hand();
    }
}
