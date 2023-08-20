
/**
 * This class demonstrates polymorphism with
 * object declarations and the static method
 * to print the centers of different circle like shapes.
 *
 * @author 
 * @version 3/20/23
 */
import java.util.ArrayList;
public class PolyTester
{
    public static void showCenter(ArrayList<Circle2> r)
    {
        for(Circle2 c: r){
        System.out.println("For " + c.getName() +c.getCenter()+"\n");
        
    }
}

    public static void main (String []args)
    {
        ArrayList<Circle2> a=new ArrayList<Circle2>();
        a.add(new Circle2(2,4,1));
        a.add(new Oval2(5,6,9,10));
        a.add(new Cylinder2(4,4,1,8));
        a.add(new OvalCylinder2(4,2,5,7,3));
        
        showCenter(a);
       

    }
}
