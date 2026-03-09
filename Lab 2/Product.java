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
        this.brand = brand_; /* costco, best buy, general */
        this.category = category_; /* consumables, lifestyle, electronics */
        this.customerRating = customerRating_; //out of 5
    }
    String getId() { return this.id; }
    String getName() { return this.name; }
    double getPrice() { return this.price; }
    String getBrand() { return this.brand; }
    String getCategory() { return this.category;}
    double getCustomerRating() { return this.customerRating; }
    void info() {
        System.out.println("ID: " + this.id + ", " + this.name + ", " + this.price + ", " + this.brand + ", " + this.category + ", " + this.customerRating);
    }
}
