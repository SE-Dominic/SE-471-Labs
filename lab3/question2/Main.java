public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world.");
        
        CMM cmm = new CMM();
        cmm.showMenu();

        System.out.println("\n Order 1: Mocha + Chocolate");
        cmm.selectProgram(2);       // load Mocha from flash
        cmm.addCondiments("X");     // one Chocolate
        cmm.brew();

        System.out.println("\n>>> Order 2: Espresso + Cream + Vanilla + Chocolate + Chocolate");
        cmm.selectProgram(4);       // load Espresso from flash
        cmm.addCondiments("CVXX");  // Cream, Vanilla, two Chocolates
        cmm.brew();
 
        cmm.printSalesReport();
    }
}
