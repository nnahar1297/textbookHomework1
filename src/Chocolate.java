/**
 * @Class Name: Chocolate
 * @Author: Nazmun Nahar
 * @Version: 1.0
 * @Date: 2 February 2023
 * Description: A program designed to calculate the minimum number of bags
 */


public class Chocolate {
    public static void main(String[] args){
        int ChocolateBag = 9;
        int ChocolateBar = ChocolateBag * 2;
        int minimumBag = ChocolateBar/3;

        System.out.println("ChocolateBag: " + ChocolateBag);
        System.out.println("ChocolateBar: " + ChocolateBar);
        System.out.println("ChocolateBag needed: " + minimumBag);
    }
}
