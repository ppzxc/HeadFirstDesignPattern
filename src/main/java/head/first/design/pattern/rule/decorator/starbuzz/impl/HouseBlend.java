package head.first.design.pattern.rule.decorator.starbuzz.impl;

import head.first.design.pattern.rule.decorator.starbuzz.dp.*;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "하우스 블렌드 커피";
    }

    @Override
    public double cost() {
        return 2.55;
    }
}
