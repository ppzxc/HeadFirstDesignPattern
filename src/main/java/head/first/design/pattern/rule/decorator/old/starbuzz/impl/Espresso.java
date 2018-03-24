package head.first.design.pattern.rule.decorator.old.starbuzz.impl;

import head.first.design.pattern.rule.decorator.old.starbuzz.dp.Beverage;

public class Espresso extends Beverage {

    // Beverage로 부터 상속 받은 스트링 변수, 이름
    public Espresso() {
        description = "에스프레소";
    }

    // 에스프레소 기본 가격
    @Override
    public double cost() {
        return 1.99;
    }
}
