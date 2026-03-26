package lab3.question2;
public class CMM {
    int isOn = 1; //1 = not running, 2 = running
    int grindingTime;
    int temperature;
    int waitTime;
    int powerLED;
    int typeLED;
    double price;

    public void coffeeMenu() {
        System.out.println("1. Regular $1.00");
        System.out.println("2. Mocha $2.00");
        System.out.println("3. Latte $3.00");
        System.out.println("4. Expresso $4/00");
        System.out.println("5. Cappuccino $5.00");
    }
    public void condimentsMenu() {
        System.out.println("1. Cream $0.25");
        System.out.println("2. Vanilla $0.50");
        System.out.println("3. Chocolate $1.00");
    }
    public setGrindingTime(int secs) {
        this.grindingTime = secs;
    }
    public void setTempterature(int degree) {
        this.temperature = degree;
    }
    public void holdTempterature(int seconds) {
        wait(seconds);
    }
    public void wait(int seconds) {
        System.out.println("Waiting " + seconds + " seconds...");
        return seconds;
    }
    public void setPowerLED(int num) {
        this.powerLED = num;
    }
    public setTypeLED(int num) {
        this.typeLED = num;
    }
    public void displayPrice(CoffeeIF cf) { }
}