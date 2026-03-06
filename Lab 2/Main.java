import java.util.ArrayList;
class Main {
    public static void printList(ArrayList<Product> l) {
        for (int i = 0; i < l.size(); i++) {
            System.out.println("Name: " + l.get(i).getName());
        }
    }
    public static void main(String [] args) {
        System.out.println("Hi");
        Product p1 = new Product("123", "Soap", 4.99, "general", "lifestyle", 3);
        Product p2 = new Product("456", "Hair gel", 10.99, "costco", "lifestyle", 4);
        Product p3 = new Product("789", "Water", 3.99, "costco", "consumables", 2);
        Product p4 = new Product("652", "Soda", 1.99, "general", "consumables", 2);
        Product p5 = new Product("683", "Computer", 200.99, "best buy", "electronics", 2);
        Product p6 = new Product("139", "Shampoo", 8.99, "general", "lifestyle", 2);
        Product p7 = new Product("471", "Headphones", 57.99, "best buy", "electronics", 2);
        ArrayList<Product> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);
        list.add(p6);
        list.add(p7);
        
        FilterIF filter = new CombinedFilter();
        ArrayList<Product> filt_list = filter.meetCriteria(list);
        printList(filt_list);

    }
}