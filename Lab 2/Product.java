public class Product {
    private String id;
    private String name;
    private double price;
    private String brand;
    private String category;
    private double customerRating;

    Product(String id_, String name_, double price_, String brand_, String category_, double customerRating_) {
        this.id = id_;
        this.name = name_;
        this.price = price_;
        this.brand = brand_;
        this.category = category_;
        this.customerRating = customerRating_;
    }
    String getId() { return this.id; }
    String getName() { return this.name; }
    double getPrice() { return this.price; }
    String getBrand() { return this.brand; }
    String getCategory() { return this.category;}
    double getCustomerRating() { return this.customerRating; }
    void info() {
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Price: " + this.price);
        System.out.println("Brand: " + this.brand);
        System.out.println("Category: " + this.category);
        System.out.println("Rating: " + this.customerRating);
    }
}
