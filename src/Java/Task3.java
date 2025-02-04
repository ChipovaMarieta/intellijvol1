package Java;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in);
        System.out.println("Type a number:");
        int number1 = UserInput.nextInt();
        Scanner UserInput2 = new Scanner(System.in);
        System.out.println("Type a number:");
        int number2 = UserInput2.nextInt();
        int temp = number1;
        number1 = number2;
        number2 = temp;
        System.out.println("First number is" + number1 + "second number is" + number2);
    }
}
