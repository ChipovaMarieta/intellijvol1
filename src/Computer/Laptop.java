package Computer;

public class Laptop extends Computerclass{

    String brand;
    String model;
    double weight;
    int laptopCounter;

    private Laptop(boolean isNotebook, String operationSystem, String brand, String model) {
        super(isNotebook, operationSystem);
        this.brand = brand;
        this.model = model;
    }

    public void changeCurrentSystem(String operationSystem) {
        super.changeCurrentSystem(operationSystem);
        System.out.println("The operation system is changed.");
    }
}
