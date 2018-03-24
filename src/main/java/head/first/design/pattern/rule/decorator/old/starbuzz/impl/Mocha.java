package head.first.design.pattern.rule.decorator.old.starbuzz.impl;

import head.first.design.pattern.rule.decorator.old.starbuzz.dp.Beverage;
import head.first.design.pattern.rule.decorator.old.starbuzz.dp.CondimentDecorator;

public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 모카";
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
