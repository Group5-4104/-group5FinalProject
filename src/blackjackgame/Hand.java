package blackjackgame;

import static blackjackgame.BlackJackGame.bet;
import static blackjackgame.BlackJackGame.player;
import java.util.Scanner;

/**
 *This class creates a type hand and will handle the generation or both user and dealer hand
 * it will also calculate the values of both the user and dealer hands
 *
 * @author Tarick Wilson
 */
class Hand {

    private static Card[] pHand = new Card[12];
    private static Card[] dHand = new Card[12];
    static Scanner input = new Scanner(System.in);
    private static int cPhand = 0;
    private static int cDhand = 0;

    public static Card[] getpHand() {
        return pHand;
    }

    public static void setpHand(Card[] pHand, int no) {
        Hand.pHand[cPhand] = pHand[no];
        cPhand++;
    }

    public static Card[] getdHand() {
        return dHand;
    }

    public static void setdHand(Card[] dHand, int no) {
        Hand.dHand[cDhand] = dHand[no];
        cDhand++;

    }

    public static int calculateHandp() {
        int j = 0;
        int handValue = 0;
        while (Hand.pHand[j] != null) {
            String o;
            o = Hand.pHand[j].getValue().toString();
            switch (o) {
                case "ACE":
                    handValue += 11;

                    break;
                case "TWO":
                    handValue += 2;
                    break;
                case "THREE":
                    handValue += 3;
                    break;
                case "FOUR":
                    handValue += 4;
                    break;
                case "FIVE":
                    handValue += 5;
                    break;
                case "SIX":
                    handValue += 6;
                    break;
                case "SEVEN":
                    handValue += 7;
                    break;
                case "EIGHT":
                    handValue += 8;
                    break;
                case "NINE":
                    handValue += 9;
                    break;
                case "TEN":
                    handValue += 10;

                    break;
                case "JACK":
                    handValue += 10;

                    break;
                case "QUEEN":
                    handValue += 10;

                    break;
                case "KING":
                    handValue += 10;

                    break;

            }

            j++;
        }
        return handValue;
    }

    public static int calculateHandd() {
        int j = 0;
        int handValue = 0;
        while (Hand.dHand[j] != null) {
            String o;
            o = Hand.dHand[j].getValue().toString();

            switch (o) {
                case "ACE":
                    handValue += 11;
                    break;
                case "TWO":
                    handValue += 2;
                    break;
                case "THREE":
                    handValue += 3;
                    break;
                case "FOUR":
                    handValue += 4;
                    break;
                case "FIVE":
                    handValue += 5;
                    break;
                case "SIX":
                    handValue += 6;
                    break;
                case "SEVEN":
                    handValue += 7;
                    break;
                case "EIGHT":
                    handValue += 8;
                    break;
                case "NINE":
                    handValue += 9;
                    break;
                case "TEN":
                    handValue += 10;

                    break;
                case "JACK":
                    handValue += 10;

                    break;
                case "QUEEN":
                    handValue += 10;

                    break;
                case "KING":
                    handValue += 10;

                    break;

            }

            j++;
        }

        return handValue;
    }

    public static void restart() {
        cPhand = 0;
        cDhand = 0;
    }

}
