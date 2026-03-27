interface CoffeeIF {
    double getPrice();
    String getName();
    void makeCoffee(CMM machine);
}

class RegularCoffee implements CoffeeIF {
    @Override public double getPrice() { return 1.00; }
    @Override public String getName() { return "Regular"; }
    @Override 
    public void makeCoffee(CMM machine) {
        machine.setPowerLED(0);
        machine.setTypeLED(1);
        machine.setGrindingTime(8);
        machine.setTemperature(150);
        machine.holdTemperature(2);
        machine.wait(15);
        machine.setPowerLED(1);
        machine.displayPrice(this);
    }
}

class MochaCoffee implements CoffeeIF {
    @Override public double getPrice() { return 2.0; }
    @Override public String getName() { return "Mocha"; }
    @Override
    public void makeCoffee(CMM machine) {
        machine.setPowerLED(0);
        machine.setTypeLED(2);
        machine.setGrindingTime(5);
        machine.setTemperature(200);
        machine.holdTemperature(5);
        System.out.println("Adding cream and vanilla (1x)");
        machine.wait(15);
        machine.setPowerLED(1);
    }
}

class LatteCoffee implements CoffeeIF {
    @Override public double getPrice() { return 3.00; }
    @Override public String getName()  { return "Latte"; }
 
    @Override
    public void makeCoffee(CMM machine) {
        machine.setPowerLED(0);
        machine.setTypeLED(3);
        machine.setGrindingTime(6);
        machine.setTemperature(180);
        machine.holdTemperature(3);
        System.out.println("(Latte) Steaming milk...");
        machine.wait(12);
        machine.setPowerLED(1);
    }
}
 
class EspressoCoffee implements CoffeeIF {
    @Override public double getPrice() { return 4.00; }
    @Override public String getName()  { return "Espresso"; }
 
    @Override
    public void makeCoffee(CMM machine) {
        machine.setPowerLED(0);
        machine.setTypeLED(4);
        machine.setGrindingTime(10);
        machine.setTemperature(200);
        machine.holdTemperature(1);
        System.out.println("(Espresso) Applying 9-bar pressure...");
        machine.wait(8);
        machine.setPowerLED(1);
    }
}

class CappuccinoCoffee implements CoffeeIF {
    @Override public double getPrice() { return 5.00; }
    @Override public String getName()  { return "Cappuccino"; }
 
    @Override
    public void makeCoffee(CMM machine) {
        machine.setPowerLED(0);
        machine.setTypeLED(5);
        machine.setGrindingTime(7);
        machine.setTemperature(195);
        machine.holdTemperature(2);
        System.out.println("(Cappuccino) Frothing milk to 140 °F...");
        System.out.println("(Cappuccino) Layering espresso, steamed milk, foam...");
        machine.wait(18);
        machine.setPowerLED(1);
    }
}
 

 
