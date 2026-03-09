import java.util.ArrayList;
class Main {
    public static void printList(ArrayList<Product> l) {
        for (int i = 0; i < l.size(); i++) {
            l.get(i).info();
        }
    }
    public static void main(String [] args) {
        Product p1 = new Product("123", "Soap", 14.99, "general", "lifestyle", 3);
        Product p2 = new Product("456", "Hair gel", 30.00, "costco", "lifestyle", 4);
        Product p3 = new Product("789", "Water", 3.99, "costco", "consumables", 4);
        Product p4 = new Product("652", "Soda", 1.99, "general", "consumables", 2);
        Product p5 = new Product("683", "Computer", 200.99, "best buy", "electronics", 4);
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
        
        System.out.println("Filter Single Use:");
        FilterIF filter = new PriceFilter();
        ArrayList<Product> priceFilter = filter.meetCriteria(list);
        printList(priceFilter);
        filter = new RatingFilter();
        ArrayList<Product> filt_list = filter.meetCriteria(list);
        printList(filt_list);

        System.out.println("Combined Filter Use:");
        filter = new CombinedFilter();
        ArrayList<Product> combinedFilter = filter.meetCriteria(list);
        printList(combinedFilter);
    }
}