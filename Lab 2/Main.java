import java.util.ArrayList;
class Main {
    public static void printList(ArrayList<Product> l) {
        for (int i = 0; i < l.size(); i++) {
            System.out.println("Name: " + l.get(i).getName());
        }
    }
    public static void main(String [] args) {
        System.out.println("Hi");
        Product p1 = new Product("123", "soap", 4.99, "Dove", "Bathroom", 4);
        Product p2 = new Product("456", "hair gel", 10.99, "Frisca", "Self Care", 8);
        Product p3 = new Product("789", "Water", 2.99, "Dasani", "Health", 10);
        ArrayList<Product> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        
        FilterIF filter = new PriceFilter();
        ArrayList<Product> filt_list = filter.meetCriteria(list);
        printList(filt_list);

    }
}