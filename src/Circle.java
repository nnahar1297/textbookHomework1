/**
 * @Class Name: Circle
 * @Author: Nazmun Nahar
 * @Version: 1.0
 * @Date:2 February 2023
 * Description:A program designed to calculate area and perimeter
 */
public class Circle {
    public static void main(String[] args){
        double r = 9.5;
        double area = r * r * Math.PI;
        double perimeter = 2 * r * Math.PI;

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}
