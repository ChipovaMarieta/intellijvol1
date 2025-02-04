package Java;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in);
        System.out.println("Insert a number:");
        int number1 = UserInput.nextInt();
        Scanner UserInput2 = new Scanner(System.in);
        System.out.println("Insert a number 2:");
        int number2 = UserInput2.nextInt();
        int numbersbor = number1 + number2;
        System.out.println(" Sbora na chislo 1 i chislo 2 e " + numbersbor);
    }
}
