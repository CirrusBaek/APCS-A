/**
 * This is a class that tests the Card class.
 *
 *  
 *  < 4/23/23>
 */

public class CardTester
{
   /**
    * The main method in this class checks the Card operations for consistency.
    * @param args is not used.
    */
   public static void main(String[] args) {

      /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */

      // Establish new cards
      Card aceHearts = new Card("Ace", "Hearts", 1);
      Card kingSpades = new Card("King", "Spades",10);
      Card aceHearts2 = new Card("Ace", "Hearts", 1);

      // Test card 1 and methods
      System.out.println("**** Tests Card 1: ace of hearts ****");
      System.out.println("  rank: " + aceHearts.rank());
      System.out.println("  suit: " + aceHearts.suit());
      System.out.println("  pointValue: " + aceHearts.pointValue());
      System.out.println("  toString: " + aceHearts.toString());
      System.out.println("One matches three? " + aceHearts.matches(aceHearts2));
      System.out.println();
      
      System.out.println("**** Tests Card 2: king of spades ****");
      System.out.println("  rank: " + kingSpades.rank());
      System.out.println("  suit: " + kingSpades.suit());
      System.out.println("  pointValue: " + kingSpades.pointValue());
      System.out.println("  toString: " + kingSpades.toString());
      System.out.println("Two matches one? " + kingSpades.matches(aceHearts));
      System.out.println();

      
       System.out.println("**** Tests Card 3: ace of hearts ****");
      System.out.println("  rank: " + aceHearts2.rank());
      System.out.println("  suit: " + aceHearts2.suit());
      System.out.println("  pointValue: " + aceHearts2.pointValue());
      System.out.println("  toString: " + aceHearts2.toString());
      System.out.println("Three matches two? " + aceHearts2.matches(kingSpades));
      System.out.println();


      

   }
}
