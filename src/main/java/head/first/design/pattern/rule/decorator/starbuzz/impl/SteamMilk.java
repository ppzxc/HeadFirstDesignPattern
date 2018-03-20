package head.first.design.pattern.rule.decorator.starbuzz.impl;

import head.first.design.pattern.rule.decorator.starbuzz.dp.Beverage;
import head.first.design.pattern.rule.decorator.starbuzz.dp.CondimentDecorator;

public class SteamMilk extends CondimentDecorator {
    Beverage beverage;

    public SteamMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 스팀 우유";
    }

    @Override
    public double cost() {
        return .70 + beverage.cost();
    }
}
