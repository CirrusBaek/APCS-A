
/**
 * @mountain terrain.
 *
 * @author (
 * @version (3/16/23)
 */
public class Mountain extends Terrain
{
    private int mountain;
    public Mountain(int l, int w, int m)
    {
        super(l,w);
       mountain=m;
    }
    
    public int getMountain(){
        return mountain;
    }
}
