/**
 * purpose:calculates the range of a projectile with a given angle and velocity.
 *
 * @author 
 * @version 3/8/23
 */
public class CatapultTester{

    public static void main(String[] args) {
        int[] speedArray={25,30,35,40,45,50,55};
        int[] angleArray={20,25,30,35,40,45};
            
        Catapult[][] catapults = new Catapult[6][7];
        int speed;

        for(int row = 0; row < catapults.length; row++) {
            for(int column = 0; column <catapults.length; column++)
            {
                
                catapults[row][column] = new Catapult(speedArray[row], angleArray[column]);
            }
        }
        System.out.println("                     Projectile Distance (meters)                      ");
        System.out.println("MPH   20 Deg   25 Deg   30 Deg   35 Deg   40 Deg   45 Deg   ");
        System.out.println("====================================================================");

        for (Catapult[] catapult : catapults) {
            System.out.printf("%2.0f ", catapult[0].getSpeed());
            for (int column = 0; column < catapults.length; column++) {
                catapult[column].calcDistance();
                System.out.printf("%8.1f ", catapult[column].getDistance());
            }
            System.out.printf("\n");
        }
    }

}