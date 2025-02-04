package Java;

import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in);
        System.out.println("Type a number:");
        int number = UserInput.nextInt();
        Scanner UserInput2 = new Scanner(System.in);
        System.out.println("Type another number:");
        int number2 = UserInput2.nextInt();
        Scanner UserInput3 = new Scanner(System.in);
        System.out.println("Type number 3:");
        int number3 = UserInput3.nextInt();
        if (number3 > number && number3 < number2) {
            System.out.println("" + number3 + " is between " + number + " and " + number2);
        } else {
            System.out.println("number 3 is not between number and number2");
        }

    }
}
