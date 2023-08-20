
/**
 * Write a description of class TerrainTester here.
 *
 * @author 
 * @version (3/15/23)
 */
public class Forest extends Terrain
{
    private int tree;
    public Forest(int l, int w, int trees)
    {
        super(l,w);
        tree=trees;
    }
    
    public int getTrees(){
        return tree;
    }
}
