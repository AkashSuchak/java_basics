import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        Scanner scObj = new Scanner(System.in);

        System.out.println("Enter Value of A : ");
        int a = Integer.parseInt(scObj.nextLine());

        System.out.println("Enter Value of B : ");
        int b = Integer.parseInt(scObj.nextLine());

        if (a > b) {
            System.out.println(" A is greater than B " + a);
        } else if(a < b ) {
            System.out.println(" B is greater than A " + b);
        } else {
            System.out.println(" A "+ a +" is equal to B " + b);
        }

    }
}
