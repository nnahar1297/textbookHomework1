/**
 * @Class Name: SpeedLight
 * @Author: Nazmun Nahar
 * @Version: 1.0
 * @Date: 2 February 2023
 * Description: A program designed to calculate the speed of light
 */


public class SpeedLight {
    public static void main(String[] args){
        int SPEED_OF_SOUND = 340; //this is the value of sound in meter
        int timeElapsed = 5;
        int distance = SPEED_OF_SOUND * timeElapsed;
        System.out.println("Speed of sound: " + SPEED_OF_SOUND);
        System.out.println("Time Elapsed: " + timeElapsed);
        System.out.println("Distance: " + distance);
    }
}
