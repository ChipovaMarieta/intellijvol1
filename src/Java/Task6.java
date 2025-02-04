package Java;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in);
        System.out.println("Type number:");
        int n = UserInput.nextInt();

        for(int i = 3; i < n; ++i) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }

    }
}
