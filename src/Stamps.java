/**
 * @Class Name: Stamps
 * @Author:Nazmun Nahar
 * @Version:1.0
 * @Date:2 February 2023
 * Description:A program designed to calculate the difference between the
 * collections of Jean and Susan
 */

public class Stamps {
    public static void main(String[] args){
        int SUSAN_STAMPS = 8;
        int JEAN_STAMPS = 40;
        int difference = JEAN_STAMPS - SUSAN_STAMPS;

        System.out.println("SUSAN_STAMPS: " + SUSAN_STAMPS);
        System.out.println("JEAN_STAMPS: " + JEAN_STAMPS);
        System.out.println("Jean has " + difference + " stamps more than Susan");
    }
}
