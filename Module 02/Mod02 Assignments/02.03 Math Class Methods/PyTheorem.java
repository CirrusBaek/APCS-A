
/**
 * The goal of this program is to generate a random number from 5-23 for 2 sides of the triangle using the math.random class.
 * I am also supposed to use the math class to calculate the value of the hypotenuse.
 *
 * @author 
 * @version (9/4/22)
 */
public class PyTheorem
{
    public static void main(String[]args){
        int triangleOneSide1= (int)(Math.random()*18)+5;
        int triangleOneSide2= (int)(Math.random()*18)+5;
        
        int triangleTwoSide1= (int)(Math.random()*18)+5;
        int triangleTwoSide2= (int)(Math.random()*18)+5;
        
        double hypotenuse1= Math.sqrt(Math.pow(triangleOneSide1,2)+Math.pow(triangleOneSide2,2));
        double hypotenuse2= Math.sqrt(Math.pow(triangleTwoSide1,2)+Math.pow(triangleTwoSide2,2));        
    
        System.out.println("Triangle 1"+"\t"+"Side 1: "+triangleOneSide1+"\t"+ "Side 2: " +triangleOneSide2+"\t"+ " Hypotenuse 1: "+hypotenuse1);
        System.out.println("Triangle 2" +"\t"+"Side 2: "+triangleTwoSide1+ "\t"+"Side 2: "+triangleTwoSide2 +"\t"+" Hypotenuse 2: "+hypotenuse2);
        
        
    
        
        
    }
}
