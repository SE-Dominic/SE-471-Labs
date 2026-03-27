class CreamDecorator extends CondimentDecorator {
    public CreamDecorator(CoffeeIF coffee) {
        super(coffee);
    }
    @Override public double getPrice() { return wrapped.getPrice() + 0.25; }
    @Override public String getName() { return wrapped.getName() + " + cream"; }
}