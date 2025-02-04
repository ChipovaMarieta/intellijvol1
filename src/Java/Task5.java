package Java;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        Scanner NewInput = new Scanner(System.in);
        System.out.println("Type a number:");
        int n = NewInput.nextInt();
        long result = 0L;

        for(int i = 1; i <= n; ++i) {
            result += (long)i;
        }

        System.out.println("The result is " + result);
    }
}
