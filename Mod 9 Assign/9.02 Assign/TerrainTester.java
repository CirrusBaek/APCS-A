
/**
 * This program 
 * creates different hierarchies of terrains using inheritance(extends) and super calls in constructors.
 *
 * @author (
 * @version (3/16/23)
 */
public class TerrainTester
{

   public static void main(String[]args){
        Desert d=new Desert(100,100,56);
        Tundra t=new Tundra(399,285,5,12.3,10);
        Terrain t1 = new Terrain(150, 240);
        Forest f1 = new Forest(400, 400, 180);
        Mountain m1 = new Mountain(600, 200, 12);
        WinterMountain wM = new WinterMountain(500, 500, 30, 12.34);
        System.out.println(t1.getTerrainSize()+"\n");
        System.out.println("Forest " + f1.getTerrainSize() + " and has " + f1.getTrees() + " trees.\n");
        System.out.println("Mountain " + m1.getTerrainSize() + " and has " + m1.getMountain() + " mountains.\n");
        System.out.println("Forest " + wM.getTerrainSize() + " and has " + m1.getMountain() + " mountains and has temperature " +wM.getTemp()+ " degrees\n");
        System.out.println("Desert " + d.getTerrainSize() + " and has "+d.getCacti()+" cacti\n");
        System.out.println("Tundra " + t.getTerrainSize() + " and has " + t.getMountain() + " mountains and has temperature " +t.getTemp()+" and "+t.getSnow()+" inches of snow");
   }
}
