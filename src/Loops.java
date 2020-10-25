//This Program is made for loop intro
// Packages
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        //Scanner Object - User Input
        Scanner scObj = new Scanner(System.in);
        System.out.println("Enter Any Number : ");
        int number = scObj.nextInt();

        int i = 0;
        System.out.println("Display output of WHILE loop");
        while (i < number) {
            System.out.println(i);
            i++;
        }
        System.out.println("End of WHILE loop");
        System.out.println("---------------------------------");

        System.out.println("Display output of DO..WHILE loop");
        i=0;
        do {
            System.out.println(i);
            i++;
        }
        while (i < number);
        System.out.println("End of DO..WHILE loop");
        System.out.println("---------------------------------");

        System.out.println("Display output of FOR loop");
        for (i=0; i< number; i++) {
            System.out.println(i);
        }
        System.out.println("End of FOR loop");
        System.out.println("---------------------------------");
    }
}
