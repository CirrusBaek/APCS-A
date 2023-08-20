
/**
 * The purpose of this project is to calculate the surface gravity for any planet by using methods to display the info and
calculate the surface gravity.
 *
 * @author 
 * @version 10/10/22
 */
public class PlanetGravity
{
public static double planetGravity(double diameterkm,double masskg){
    double radiusMeters=(diameterkm*1000.0)/2;
    double planetGravity=(6.67*Math.pow(10,-11)*masskg)/(Math.pow(radiusMeters,2));
    return (int)( 100.0 * planetGravity )/100.0;
}

public static void layout(String name,double mass,double diameter,double planetGravity){
    String newMass=Double.toString(mass);
    String newMass1=newMass.replace("e","E");
    int massPos=newMass1.indexOf("E")+1;
    String newMass2=newMass1.substring(0,massPos);
    String newMass3=newMass1.substring(massPos);
    String finalMass=newMass2+"+"+newMass3;
    
    String layout=name+"\t\t"+diameter+"\t\t"+finalMass+"\t"+planetGravity;
    System.out.println(layout);
}
public static void header(){
    System.out.println("\t\t\tPlanetary Data");
    System.out.println("Planet\t\tDiameter(km)\tMass(kg)\tg(m/s^2)");
    System.out.println("--------------------------------------------------------------------");
    
    
}


    public static void main(String[]args){
        String name="Earth";
        double diameterkm=12756.3;
        double masskg=5.972e24;
        
        String name2="Venus";
        double mass2kg=4.869e24;
        double diameter2km= 12103.6;
        
        double gravEarth=planetGravity(diameterkm,masskg);
        double gravVenus=planetGravity(diameter2km,mass2kg);
        header();
        layout(name,masskg,diameterkm,gravEarth);
        layout(name2,mass2kg,diameter2km,gravVenus);
        
        
        
        
        
        
        
        
        
        
        
    }
}
