package head.first.design.pattern.rule.one.impl;

import head.first.design.pattern.rule.one.dp.FlyNoWay;
import head.first.design.pattern.rule.one.dp.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.print("저는 모형 오리입니다.");
    }
}
