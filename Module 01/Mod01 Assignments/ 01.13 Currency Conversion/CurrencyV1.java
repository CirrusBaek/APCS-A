/**
 * The Currency class converts an amount of money from a specific
 * country into the equivalent currency of another country given 
 * the current exchange rate.
 *
 * @author 
 * @version 
 */
public class CurrencyV1
{
    public static void main(String [] args)
    {
        //Declare and initialize local variables
           // starting US Dollars
        double startingUsDollars = 6500.00;  
        double pesosSpent = 7210.25;            // Mexican Pesos spent
        double pesoExchangeRate = 20.17105;   
        double dollarsSpentInMexico = 0.0;
        double totalUsDollarsMexico=0.0;
        double totalUsDollars=0.0;
        
        // Germany
        double totalUsDollarsGermany=0.0;
        double eurosSpent= 1895;
        double euroExchangeRate= 0.999469;
        double dollarsSpentInGermany=0.0;
         // India
        double totalUsDollarsIndia=0.0;
        double rupeesSpent= 4000;
        double rupeeExchangeRate= 79.56382;
        double dollarsSpentInIndia=0.0;

        // Message to user stating purpose
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("This program converts an amount of money");
        System.out.println("from a specific country into the equivalent");
        System.out.println("currency of another country given the current");
        System.out.println("exchange rate.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();

        // Conversion
      
        dollarsSpentInMexico=(pesosSpent/pesoExchangeRate);
        totalUsDollarsMexico= (startingUsDollars- dollarsSpentInMexico);
        
        dollarsSpentInGermany=(eurosSpent/euroExchangeRate);
        totalUsDollarsGermany=( totalUsDollarsMexico-dollarsSpentInGermany);
        
        dollarsSpentInIndia=(rupeesSpent/rupeeExchangeRate);
        totalUsDollarsIndia=(totalUsDollarsGermany-dollarsSpentInIndia);
        totalUsDollars=totalUsDollarsIndia;
        
        System.out.println("Starting US Dollars: "+ "\t"+"\t"+ startingUsDollars);
        System.out.println();
        System.out.println("Mexico:" +"\t"+"\t");
        System.out.println("Pesos Spent: "+"\t"+"\t"+"\t"+ pesosSpent);
        System.out.println("US Dollar Equivalent: " +"\t"+"\t"+ dollarsSpentInMexico);
        System.out.println("US Dollars Remaining: "+"\t"+"\t" + totalUsDollarsMexico);
        System.out.println();
        
        System.out.println("Germany:");
        System.out.println("Euros Spent: "+"\t"+"\t"+"\t"+ eurosSpent);
        System.out.println("US Dollar Equivalent: "+"\t"+"\t" + dollarsSpentInGermany);
        System.out.println("US Dollars Remaining: "+"\t"+"\t" + totalUsDollarsGermany);
        System.out.println();
        
        System.out.println("India:");
        System.out.println("Rupees Spent: "+"\t"+"\t"+"\t"+ rupeesSpent);
        System.out.println("US Dollar Equivalent: "+"\t"+"\t" + dollarsSpentInIndia);
        System.out.println("US Dollars Remaining: "+"\t"+"\t" + totalUsDollarsIndia);
        System.out.println();
        
        System.out.println("----------------------------------------------------");
        System.out.println("----------------------------------------------------");
        System.out.println("Total US Dollars Remaining:" +"\t"+ totalUsDollars);
        System.out.println();
        
        
    
        // Complete the code below for Souvenir Purchases
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Souvenir Purchases");
        System.out.println(" (all values in US Dollars) ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //Calculations for Souvenir #1
        int costItem1 = 12;                          //cost per item of first souvenir
        int budget1 = 100;                           //budget for first item
        int totalItems1 = 0;         //how many items can be purchased
        int fundsRemaining1 = 0; //how much of the budget is left
        
        totalItems1=(budget1/costItem1);
        fundsRemaining1=(budget1%costItem1);

        System.out.println("Item 1");
        System.out.println("   Cost per item: $" + costItem1 );
        System.out.println("   Budget: $"+ budget1);
        System.out.println("   Total items purchased: " +  totalItems1);
        System.out.println("   Funds remaining: $"  +  fundsRemaining1);
        System.out.println();

        //Calculations for Souvenir #2
        double costItem2 = 29.99;                          //cost per item of second souvenir
        int budget2 = 500;                               //budget for second item
        int totalItems2 = 0;     //how many items can be purchased
        double fundsRemaining2 = 0.0;      //how much of the budget is left
        
      
        totalItems2 = (int)(budget2/(double)costItem2);
        fundsRemaining2=500%29.99;
      

        System.out.println("Item 2");
        System.out.println("   Cost per item: $" + costItem2 );
        System.out.println("   Budget: $"+ budget2);
        System.out.println("   Total items purchased: " +  totalItems2);
        System.out.println("   Funds remaining: $"  +  fundsRemaining2);

    } // end of main method
} // end of class

