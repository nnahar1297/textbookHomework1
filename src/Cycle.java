/**
 * @Class Name: Cycle
 * @Author:Nazmun Nahar
 * @Version:1.0
 * @Date:2 February 2023
 * Description:A program designed to calculate the number of Tricycles
 */
public class Cycle {
    public static void main(String[] args){
        int numberOfWheel = 47;
        int numberOfBicycle = 10;
        int BICYCLE_WHEEL = numberOfBicycle * 2;
        int TRYCYCLE_WHEEL = numberOfWheel - BICYCLE_WHEEL;
        int numberOfTrycycle = TRYCYCLE_WHEEL/3;

        System.out.println("numberOfTrycycle: " + numberOfTrycycle);
    }
}
