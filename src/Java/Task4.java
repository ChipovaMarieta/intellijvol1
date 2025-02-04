package Java;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Въведете n: ");
        int n = scanner.nextInt();

        for(int i = 1; i <= n; ++i) {
            for(int j = 0; j < n; ++j) {
                System.out.print(i);
            }

            System.out.println();
        }

    }
}
