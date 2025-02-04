package Computer;

import java.util.Scanner;

public class ComputerDemo {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        boolean continueCreating = true;

        while(continueCreating) {
            Computerclass myComputer = Computerclass.createComputer(myScanner);
            System.out.println(myComputer);
            System.out.println("Do u want to create new computer? ");
            String replyUser = myScanner.nextLine();
            if (!replyUser.equalsIgnoreCase("yes")) {
                continueCreating = false;
            }
        }

        System.out.println("Total computers created:" + Computerclass.getComputercount());
    }
}
