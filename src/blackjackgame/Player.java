package blackjackgame;

/**
 * This class creates a type Player which handles the creation and management of player bets and chips
 *
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
    
   public void addChips(){
       chips=chips+bet;
   }
   public void minChips(){
       chips=chips-bet;
   }

    public Player() {
        chips = 200;
    }
}
