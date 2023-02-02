/**
 * @Class Name: MaleStudent
 * @Author:Nazmun Nahar
 * @Version:1.0
 * @Date:2 February 2023
 * Description:A program designed to calculate the number of Male students
 */

public class MaleStudent {
    public static void main(String[] args){
        int numberOfStudents = 389;
        int numberOfFemaleStudents = 175;
        int nuberOfMaleStudents = numberOfStudents - numberOfFemaleStudents;

        System.out.println("Number of Male students: " + nuberOfMaleStudents);
    }
}
