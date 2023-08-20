
 /**
 * This class is a desrt terrain.
 *
 * @author 
 * @version (3/16/23)
 */

public class Desert extends Terrain
{
    private int cacti;
    public Desert(int l, int w,int c)
    {
        super(l,w);
        cacti=c;
    }

    public int getCacti()
    {
        return cacti;
           }
}