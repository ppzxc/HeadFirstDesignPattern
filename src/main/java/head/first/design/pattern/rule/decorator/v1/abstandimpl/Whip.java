package head.first.design.pattern.rule.decorator.v1.abstandimpl;

public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 휘핑";
    }

    @Override
    public double cost() {
        return .5 + beverage.cost();
    }
}
