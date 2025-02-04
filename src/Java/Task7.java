package Java;

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in);
        System.out.println("Type a number:");
        int n1 = UserInput.nextInt();
        System.out.println("Type a number 2:");
        int n2 = UserInput.nextInt();
        int sum;
        if (n1 > n2) {
            sum = n1;
            n1 = n2;
            n2 = sum;
        }

        sum = 0;

        for(int i = n1; i < n2; ++i) {
            if (i % 3 != 0) {
                System.out.printf(i * i + ", ");
                sum += i * i;
            } else {
                System.out.printf("skip " + i + " ,");
            }

            if (sum > 200) {
                break;
            }
        }
}}
