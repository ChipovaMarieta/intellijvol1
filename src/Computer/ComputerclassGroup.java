package Computer;

public class ComputerclassGroup {

    String computerclassBrand;
    Computerclass[] computers;
    int itemsOutOfStockCounter;
    int itemsInStockCounter;

    public ComputerclassGroup() {
        this.itemsInStockCounter = 4;
        this.computers = new Computerclass[10];
    }

    public ComputerclassGroup(String computerclassBrand) {
        this();
        this.computerclassBrand = computerclassBrand;
    }

    public String getComputerclassBrand() {
        return this.computerclassBrand;
    }

    public void setComputerclassBrand(String computerclassBrand) {
        this.computerclassBrand = computerclassBrand;
    }

    public Computerclass[] getComputers() {
        return this.computers;
    }

    public void setComputers(Computerclass[] computers) {
        this.computers = computers;
    }

    public int getItemsInStockCounter() {
        return this.itemsInStockCounter;
    }

    public void setItemsInStockCounter(int itemsInStockCounter) {
        this.itemsInStockCounter = itemsInStockCounter;
    }

    public int getItemsOutOfStockCounter() {
        return this.itemsOutOfStockCounter;
    }

    public void setItemsOutOfStockCounter(int itemsOutOfStockCounter) {
        this.itemsOutOfStockCounter = itemsOutOfStockCounter;
    }

    public int setComputersInStore() {
        int computersInStore = this.itemsInStockCounter + this.itemsOutOfStockCounter;
        return computersInStore;
    }

    public void checkInStockStatus() {
        Computerclass[] var1 = this.computers;
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            Computerclass computer = var1[var3];
            if (computer != null) {
                ++this.itemsInStockCounter;
            } else {
                ++this.itemsOutOfStockCounter;
            }
        }

        System.out.println("Computers in stock: " + this.itemsInStockCounter);
        System.out.println("Computers out of stock: " + this.itemsOutOfStockCounter);
    }

    void addComputerForSell(Computerclass computerToAdd) {
        if (this.getComputerclassBrand().equals(this.computerclassBrand) && this.computers.length > this.setComputersInStore()) {
            for(int i = 0; i < this.computers.length; ++i) {
                if (this.computers[i] == null) {
                    this.computers[i] = computerToAdd;
                    int computersInStore = this.itemsInStockCounter + this.itemsOutOfStockCounter;
                    ++computersInStore;
                    System.out.println("Another computer available for selling");
                }
            }
        } else {
            System.out.println("There are no availability in the store.");
        }

    }

    public void addComputerOutOfStock(Computerclass computersOutOfStock) {
        int i = 0;
        if (i < this.computers.length) {
            if (this.computers[i] != null) {
            }

            this.computers[i] = null;
            --this.itemsInStockCounter;
            --this.itemsOutOfStockCounter;
            System.out.println("The computer is out of stock");
        }

    }
}
