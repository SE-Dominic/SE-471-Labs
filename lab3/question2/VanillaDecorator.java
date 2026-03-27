class VanillaDecorator extends CondimentDecorator {
    public VanillaDecorator(CoffeeIF coffee) {
        super(coffee);
    }
    @Override public double getPrice() { return wrapped.getPrice() + 0.50; }
    @Override public String getName() { return wrapped.getName() + " + vanilla"; }
}