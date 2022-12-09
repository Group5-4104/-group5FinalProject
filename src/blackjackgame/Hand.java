

package blackjackgame;

/**
 *This class +++ Insert class description here+++
 * @author Tarick Wilson
 */
class Hand {
private static Card[] pHand = new Card[12];
private static Card[] dHand = new Card[12];

private static int cPhand=0;
private static int cDhand=0;
    public static Card[] getpHand() {
        return pHand;
    }

    public static void setpHand(Card[] pHand,int no) {
        Hand.pHand[cPhand] = pHand[no];
       cPhand++;
    
       
          // System.out.printf("%s of %s\n",Hand.pHand[no].getValue(), Hand.pHand[no].getSuit());
       
               
              
         
    }


    public static Card[] getdHand() {
        return dHand;
    }

    public static void setdHand(Card[] dHand,int no) {
        Hand.dHand[cDhand] = dHand[no];
        cDhand++;
        //System.out.printf("%s of %s\n",Hand.dHand[no].getValue(), Hand.dHand[no].getSuit());
 
    }
    
    
    public static int calculateHandp(int hos){
        int j=0;
        int handValue=0;
        int aceCount=0;
        while (Hand.pHand[j] !=null){
            String o;
            o = Hand.pHand[j].getValue().toString();
            
           //System.out.println(o);
           
            switch(o){
                case "ACE":
                         handValue+=11;
                         System.out.println("11");
                       
                    break;
                    case "TWO":
                    System.out.println("2");
                    handValue+=2;
                    break;
                    case "THREE":
                    System.out.println("3");
                    handValue+=3;
                    break;
                    case "FOUR":
                    System.out.println("4");
                    handValue+=4;
                    break;
                    case "FIVE":
                    System.out.println("5");
                    handValue+=5;
                    break;
                    case "SIX":
                    System.out.println("6");
                    handValue+=6;
                    break;
                    case "SEVEN":
                    System.out.println("7");
                    handValue+=7;
                    break;
                    case "EIGHT":
                    System.out.println("8");
                    handValue+=8;
                    break;
                    case "NINE":
                    System.out.println("9");
                    handValue+=9;
                    break;
                    case "TEN":
                        System.out.println("10");
                    handValue+=10;
                    
                    break;
                    case "JACK":
                        System.out.println("10");
                    handValue+=10;
                    
                    break;
                    case "QUEEN":
                        System.out.println("10");
                    handValue+=10;
                    
                    break;
                    case "KING":
                    System.out.println("10");
                    handValue+=10;
                    
                    break;
                    
            }
            
            
           
            
            
            
           
            j++;
        }
          System.out.println(handValue);
          
          if(handValue==21){
          System.out.println("blackjack"); 
          System.exit(0);
        }
          
        if ( hos==0){
            System.out.println("standing");
            if(aceCount>=1){
                
            }
        }
      
        if(handValue>21){
          System.out.println("bust");  
          System.exit(0);
        }
      
        return handValue;
    }
    
    
    public static int calculateHandd(int hos){
        int j=0;
        int handValue=0;
        int aceCount=0;
        while (Hand.pHand[j] !=null){
            String o;
            o = Hand.pHand[j].getValue().toString();
            
           //System.out.println(o);
           
            switch(o){
                case "ACE":
                         handValue+=11;
                         System.out.println("11");
                       
                    break;
                    case "TWO":
                    System.out.println("2");
                    handValue+=2;
                    break;
                    case "THREE":
                    System.out.println("3");
                    handValue+=3;
                    break;
                    case "FOUR":
                    System.out.println("4");
                    handValue+=4;
                    break;
                    case "FIVE":
                    System.out.println("5");
                    handValue+=5;
                    break;
                    case "SIX":
                    System.out.println("6");
                    handValue+=6;
                    break;
                    case "SEVEN":
                    System.out.println("7");
                    handValue+=7;
                    break;
                    case "EIGHT":
                    System.out.println("8");
                    handValue+=8;
                    break;
                    case "NINE":
                    System.out.println("9");
                    handValue+=9;
                    break;
                    case "TEN":
                        System.out.println("10");
                    handValue+=10;
                    
                    break;
                    case "JACK":
                        System.out.println("10");
                    handValue+=10;
                    
                    break;
                    case "QUEEN":
                        System.out.println("10");
                    handValue+=10;
                    
                    break;
                    case "KING":
                    System.out.println("10");
                    handValue+=10;
                    
                    break;
                    
            }
            
            
           
            
            
            
           
            j++;
        }
          System.out.println(handValue);
          
          if(handValue==21){
          System.out.println("blackjack"); 
          System.exit(0);
          
        }
          
          else if ( hos==0){
            System.out.println("standing");
            if(handValue>=22){
          System.out.println("bust");  
          Runtime.getRuntime().halt(0);
        }
        }
      
          
      
        return handValue;
    }
    
    

}
