class ChocolateDecorator extends CondimentDecorator {
    public ChocolateDecorator(CoffeeIF coffee) {
        super(coffee); 
    }
 
    @Override public double getPrice() { return wrapped.getPrice() + 1.00; }
    @Override public String getName()  { return wrapped.getName() + " + Chocolate"; }
}
