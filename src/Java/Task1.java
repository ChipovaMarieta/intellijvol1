package Java;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in);
        System.out.println("Type a number:");
        int number1 = UserInput.nextInt();
        Scanner UserInput2 = new Scanner(System.in);
        System.out.println("Type a number:");
        int number2 = UserInput2.nextInt();
        Scanner UserInput3 = new Scanner(System.in);
        System.out.println("Type a number:");
        int number3 = UserInput3.nextInt();
        if (number1 >= number2 && number1 >= number3) {
            if (number2 >= number3) {
                System.out.println("chislata sa" + number1 + number2 + number3);
            } else {
                System.out.println("chislata sa" + number1 + number3 + number2);
            }
        } else if (number2 >= number1 && number2 >= number3) {
            if (number1 >= number3) {
                System.out.print("chislata sa" + number2 + number1 + number3);
            } else {
                System.out.println("chislata sa" + number2 + number3 + number1);
            }
        } else if (number1 >= number2) {
            System.out.println("chislata sa" + number3 + number1 + number2);
        } else {
            System.out.println("chislata sa" + number3 + number2 + number1);
        }

    }
}
