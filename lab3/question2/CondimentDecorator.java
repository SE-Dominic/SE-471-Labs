abstract class CondimentDecorator implements CoffeeIF {
    protected final CoffeeIF wrapped;
    protected CondimentDecorator(CoffeeIF coffee) {
        this.wrapped = coffee;
    }
    @Override
    public void makeCoffee(CMM machine) {
        wrapped.makeCoffee(machine);
    }
}