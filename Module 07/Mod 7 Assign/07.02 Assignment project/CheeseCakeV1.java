/**
 * @The purpose of this program is to print out the required measurement of ingredients for a variety of 
 * cheesecake flavors.
 *
 * @author 
 * @version 2/2/23
 *
 */
public class CheeseCakeV1
{
    private int myQuantity, myServings, myCreamCheese, myVanilla;
    private double mySugar;
    private String myFlavor;
//private variables    
   /**
    * Constructor for objects of type CheeseCakeV1
    * @param flavor
    * @param quantity
    */
    CheeseCakeV1(String flavor,int quantity)//constructor
    {
        myFlavor=flavor;
        myQuantity=quantity;
        mySugar=0.0;
        myServings=0;
        myCreamCheese=0;
        myVanilla=0;
    }

    /**
     * Mutator method to calculate the number of servings
     */
    public void calcTotalServings()
    {
        myServings=myQuantity*16;
    }

    /**
     * Mutator method to calculate the Cream Cheese Needed
     */
    public void calcCreamCheese()
    {
        myCreamCheese=32*myQuantity;
    }

    /**
     * Mutator method to calculate the Vanilla Needed
     */
    public void calcVanilla()
    {
       myVanilla=myQuantity;
    }

    /**
     * Mutator method to calculate the Sugar Needed
     */
    public void calcSugar()
    {
       mySugar=myQuantity *(1/3.0);
    }    

    /**
     * Getter method to return the number of cakes (no parameters)
     */
    public int getQuantity()
    {
        return myQuantity;
    }

    /**
     * Getter method to return flavor of the cake (no parameters)
     */
    public String getFlavor()
    {
        return myFlavor;
    }

    /**
     * Getter method to return amount of Sugar needed (no parameters)
     */
    public double getSugar()
    {
        return mySugar;
    }

    /**
     * Getter method to return amount of Cream Cheese needed (no parameters)
     */
    public int getCreamCheese()
    {
        return myCreamCheese;
    }

    /**
     * Getter method to return amount of Vanilla needed (no parameters)
     */
    public int getVanilla()
    {
        return myVanilla;
    }

    /**
     * Getter method to return number of Servings (no parameters)
     */
    public int getServings()
    {
        return myServings;
    }
    
    public String toString()
    {
        return String.format("        %-8d %-15s %3d %-11s %-7d %-5.2f%s      %-2d%4s%n",getQuantity(),getFlavor(),
        getCreamCheese(),"oz",getServings(),getSugar(),"cups",getVanilla(),"tsps");
    }
}