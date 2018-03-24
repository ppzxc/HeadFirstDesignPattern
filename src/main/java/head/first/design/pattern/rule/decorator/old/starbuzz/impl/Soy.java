package head.first.design.pattern.rule.decorator.old.starbuzz.impl;

import head.first.design.pattern.rule.decorator.old.starbuzz.dp.Beverage;
import head.first.design.pattern.rule.decorator.old.starbuzz.dp.CondimentDecorator;

public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 두유";
    }

    @Override
    public double cost() {
        return .15 + beverage.cost();
    }
}
