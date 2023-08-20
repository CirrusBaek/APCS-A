/**
 * @The purpose of this program is to print out thhe required measurement of ingredients for a variety of 
 * cheesecake flavors.
 *
 * @author 
 * @version 2/2/23
 *
 */
import java.util.ArrayList;

public class CheeseCakeTesterV1
{
    public static void main(String[] args)
    {
        //initializing and declareing an ArrayList and adding in objects as elements
        ArrayList<CheeseCakeV1> cake = new ArrayList<CheeseCakeV1>();
            // add CheeseCake to the ArrayList
        cake.add(new CheeseCakeV1("Blueberry", 5));
        cake.add(new CheeseCakeV1("Strawberry", 6));
        cake.add(new CheeseCakeV1("Cherry", 4));
        cake.add(new CheeseCakeV1("Jalapeno", 1));
        cake.add(new CheeseCakeV1("Melon", 3));
        cake.add(new CheeseCakeV1("Chocolate", 2));
        //calls several method for each object to perform calculations
        for(CheeseCakeV1 dataRecord : cake)
        {
            dataRecord.calcTotalServings();
            dataRecord.calcCreamCheese();
            dataRecord.calcVanilla();
            dataRecord.calcSugar();
            
        }
        
        //printing the format of the table
        System.out.println("|       Cheese Cake Data           |             Ingredient Calculations             |");
        System.out.println(" | Index | Quantity |  Flavor       | Cream Cheese | Servings |   Sugar   |  Vanilla  |");
        System.out.println(" |-------|----------|---------------|--------------|----------|-----------|-----------|");

        CheeseCakeV1 dataRecord;
        
        //using a for loop to print out the objects' data
        for(int index = 0; index < cake.size(); index ++)
        {
            System.out.printf("%5d %-1s",index,cake.get(index));
        }
    }
}
