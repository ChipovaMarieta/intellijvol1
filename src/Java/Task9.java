package Java;

public class Task9 {

    public static void main(String[] args) {
        int base = 6;
        int exponent = 4;
        int result = 1;

        for(int i = 1; i <= exponent; ++i) {
            result *= base;
            System.out.println(result);
        }

    }
}
