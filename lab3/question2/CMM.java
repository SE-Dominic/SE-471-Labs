import java.util.ArrayList;

public class CMM {
    int powerLED;
    int typeLED;
    private final ArrayList<CoffeeIF> saleRecords = new ArrayList<>();
    private CoffeeIF currentProgram = null;

    public void setGrindingTime(int secs) {
        System.out.println("(CMM) Grinding for " + secs + " seconds.");
    }
    public void setTemperature(int degree) {
        System.out.println("(CMM) Setting temperature to " + degree + " degrees.");
    }
    public void holdTemperature(int seconds) {
        System.out.println("(CMM) Holding temperature for " + seconds + " seconds.");
    }
    public void wait(int seconds) {
        System.out.println("Waiting " + seconds + " seconds...");
    }
    public void selectProgram(int selection) {
    if (selection == 1) {
        currentProgram = new RegularCoffee();
    } else if (selection == 2) {
        currentProgram = new MochaCoffee();
    } else if (selection == 3) {
        currentProgram = new LatteCoffee();
    } else if (selection == 4) {
        currentProgram = new EspressoCoffee();
    } else if (selection == 5) {
        currentProgram = new CappuccinoCoffee();
    } else {
        System.out.println("(CMM) Invalid selection. No program loaded.");
}

}
    public void setPowerLED(int num) {
        if (num != 1 && num != 0) {
            System.out.println("Internal code error.");
        } else {
            this.powerLED = num;
            if (this.powerLED == 0) {
                System.out.println("(CMM) RUNNING");
            } else {
                System.out.println("(CMM) NOT RUNNING");
            }
        }
    }
    public void setTypeLED(int num) {
        this.typeLED = num;
        System.out.println("(CMM) Type LED --> " + num);
    }
    public void displayPrice(CoffeeIF cf) { 
        System.out.println("\n---------------CMM----------------\n");
        System.out.println("Order: " + cf.getName());
        System.out.println("Total: " + cf.getPrice());
        System.out.println("\n----------------------------------\n");
    }
    public void showMenu() {
        System.out.println();
        System.out.println("       Coffee Making Machine – Menu       ");
        System.out.println("  1. Regular       $1.00/cup              ");
        System.out.println("  2. Mocha         $2.00/cup              ");
        System.out.println("  3. Latte         $3.00/cup              ");
        System.out.println("  4. Espresso      $4.00/cup              ");
        System.out.println("  5. Cappuccino    $5.00/cup              ");
        System.out.println("  Condiments (add after selection):       ");
        System.out.println("   C = Cream      +$0.25                  ");
        System.out.println("   V = Vanilla    +$0.50                  ");
        System.out.println("   X = Chocolate  +$1.00                  ");
    }

    public void addCondiments(String condiments) {
        if (currentProgram == null) {
            System.out.println("(CMM) No program selected.");
            return;
        }
        for (char c : condiments.toUpperCase().toCharArray()) {
            switch (c) {
                case 'C':
                    currentProgram = new CreamDecorator(currentProgram);
                    System.out.println("(CMM) Condiment added: Cream (+$0.25)");
                    break;
                case 'V':
                    currentProgram = new VanillaDecorator(currentProgram);
                    System.out.println("(CMM) Condiment added: Vanilla (+$0.50)");
                    break;
                case 'X':
                    currentProgram = new ChocolateDecorator(currentProgram);
                    System.out.println("(CMM) Condiment added: Chocolate (+$1.00)");
                    break;
                default:
                    System.out.println("(CMM) Unknown condiment code: " + c);
            }
        }
    }
    public void brew() {
        if (currentProgram == null) {
            System.out.println("(CMM) No program loaded. Please select a coffee type first.");
            return;
        }
        System.out.println("  Brewing: " + currentProgram.getName());
        currentProgram.makeCoffee(this);
        displayPrice(currentProgram);
        System.out.println("(CMM) Coffee ready! Enjoy your " + currentProgram.getName() + ".");
        currentProgram = null;  // unload from RAM after use
    }

    public void printSalesReport() {
        System.out.println();
        System.out.println("-------------Sales Report--------------");
        if (saleRecords.isEmpty()) {
            System.out.println("No sales recorded.");
        } else {
            double total = 0;
            int idx = 1;
            for (CoffeeIF sale : saleRecords) {
                System.out.println(idx + ". " + sale.getName() + ", $" + String.format("%.2f", sale.getPrice()));
                total += sale.getPrice();
                idx++;
            }
            System.out.printf("Total revenue:\n " + total);
        }
    }
 
}