package Computer;

import java.util.Scanner;

public class Computerclass {
    private static int computerCount = 0;
    private int computerID;
    private static int year;
    private static double price;
    public static boolean isNotebook;
    private static int hardDiskMemory;
    private static double currentFreeMemory;
    String operationSystem;
    private static String brand;
    private static String model;
    private static int quantiti;

    public Computerclass(boolean isNotebook, String operationSystem) {
        Computerclass.isNotebook = isNotebook;
        this.operationSystem = operationSystem;
        this.incrementCount();
    }

    Computerclass(boolean isNotebook, String operationSystem, int year, double price, int hardDiskMemory, double currentFreeMemory) {
        this(isNotebook, operationSystem);
        Computerclass.price = price;
        Computerclass.hardDiskMemory = hardDiskMemory;
        Computerclass.currentFreeMemory = currentFreeMemory;
    }

    public Computerclass() {
    }

    private void incrementCount() {
        ++computerCount;
        this.computerID = computerCount;
    }

    public String getOperationSystem() {
        return this.operationSystem;
    }

    public int getComputerID() {
        return this.computerID;
    }

    public void setComputerID(int computerID) {
        this.computerID = computerID;
    }

    public static int getComputercount() {
        return computerCount;
    }

    public static void setComputercount(int computercount) {
    }

    public double getCurrentFreeMemory() {
        return currentFreeMemory;
    }

    public void setCurrentFreeMemory(double currentFreeMemory) {
        Computerclass.currentFreeMemory = currentFreeMemory;
    }

    public int getHardDiskMemory() {
        return hardDiskMemory;
    }

    public void setHardDiskMemory(int hardDiskMemory) {
        Computerclass.hardDiskMemory = hardDiskMemory;
    }

    public boolean isNotebook() {
        return isNotebook;
    }

    public void setNotebook(boolean notebook) {
        isNotebook = notebook;
    }

    public String getOperationSystem(String getLaptopOS) {
        return this.operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        Computerclass.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        Computerclass.year = year;
    }

    public void printOperationSystemName(String operationSystem) {
        if (!operationSystem.equals("Windows") && !operationSystem.equals("Linux")) {
            System.out.println("The new operation system is " + operationSystem);
        } else {
            System.out.println("the computer OS is Windows or Linux ");
        }

    }

    public void changeCurrentSystem(String operationSystem) {
        if (operationSystem.equals("MAC")) {
            operationSystem = "Linux";
            System.out.println("Change it with " + operationSystem);
        } else if (operationSystem.equals("Windows")) {
            operationSystem = "Linux";
            System.out.println("Change it with " + operationSystem);
        } else if (operationSystem.equals("Linux")) {
            operationSystem = "Windows";
            System.out.println("Change it with " + operationSystem);
        } else {
            operationSystem = "MAC";
            System.out.println("Change it with " + operationSystem);
        }

    }

    public void useMemory(double memory) {
        if (currentFreeMemory > memory) {
            currentFreeMemory -= memory;
            System.out.println("The free memory is " + currentFreeMemory);
        } else {
            System.out.println("Not enough free memory");
        }

    }

    public static int comparePrice(double computerPrice1, double computerPrice2) {
        if (computerPrice1 > computerPrice2) {
            return -1;
        } else {
            return computerPrice1 < computerPrice2 ? 1 : 0;
        }
    }

    public String toString() {
        return "Computer {computerID " + this.computerID + " isNotebook " + isNotebook + ", operationsystem ='" + this.operationSystem + "' , price = " + price + " harddiskmemory ='" + hardDiskMemory + " freememory = " + currentFreeMemory + "}";
    }

    public static Computerclass createComputer(Scanner myScanner) {
        System.out.println("Is the computer a notebook (true or false): ");
        boolean isNotebook = myScanner.nextBoolean();
        myScanner.nextLine();
        System.out.println("What OS has it got?");
        String operationSystem = myScanner.nextLine();
        System.out.println("Do you want additional information? (yes = 1 or no = 0) ");
        int reply = myScanner.nextInt();
        if (reply == 1) {
            System.out.println("What is the year of manufacture?");
            int year = myScanner.nextInt();
            System.out.println("How much is the price of the computer?");
            double price = myScanner.nextDouble();
            System.out.println("How much hard disk memory does it have?");
            int hardDiskMemory = myScanner.nextInt();
            System.out.println("How much current free memory does it have?");
            double currentFreeMemory = myScanner.nextDouble();
            myScanner.nextLine();
            return new Computerclass(isNotebook, operationSystem, year, price, hardDiskMemory, currentFreeMemory);
        } else {
            return new Computerclass(isNotebook, operationSystem);
        }
    }
}
