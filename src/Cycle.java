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
