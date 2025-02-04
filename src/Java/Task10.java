package Java;

public class Task10 {

    public static void main(String[] args) {
        int[] mas = new int[]{2, 3, 4, 5};
        int sum = 0;

        for(int i = 0; i < mas.length; ++i) {
            sum += mas[i];
        }

        System.out.println(sum);
    }
}
