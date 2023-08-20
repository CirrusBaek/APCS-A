
/**
 * Winter mountain terrain
 *
 * @author (
 * @version (3/16/23)
 */
public class WinterMountain extends Mountain
{
    private double temp;
    public WinterMountain(int l, int w,int m,double t)
    {
        super(l,w,m);
       temp=t;
    }
    
    public double getTemp(){
        return temp;
    }
}
