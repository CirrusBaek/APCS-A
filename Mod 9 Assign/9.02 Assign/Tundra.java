
/**
 * @ this is the tundra terrain
 * @author 
 * @version (3/1623)
 */
public class Tundra extends WinterMountain
{
    private double snow;
    public Tundra(int l, int w,int m,double t,double s)
    {
        super(l,w,m,t);
       snow=s;
    }
    
    public double getSnow(){
        return snow;
    }
}
