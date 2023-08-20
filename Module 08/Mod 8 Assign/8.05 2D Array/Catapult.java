/**
 * purpose :client class
 *
 * @author 
 * @version 3/8/23
 */
public class Catapult {

    private double speed;
     private double degrees;
      private double distance;

    public Catapult(double s, double deg) {
        speed = s;
        degrees = deg;
    }

    public double getSpeed(){
        return speed;
    }

    public double getDegrees(){
        return degrees;
    }

    public double getDistance(){
        return distance;
    }

    public void calcDistance(){
        distance = (Math.pow(speed*0.44704, 2) * Math.sin( 2 * Math.toRadians(degrees)) /9.8);
    }

}