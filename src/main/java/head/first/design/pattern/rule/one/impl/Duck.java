package head.first.design.pattern.rule.one.impl;

import head.first.design.pattern.rule.one.dp.FlyBehavior;
import head.first.design.pattern.rule.one.dp.QuackBehavior;

public abstract class Duck {
    // Duck의 세부 속성을 구현하는 행동 인터페이스 구현
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {

    }

    // 동적으로 행동을 지정하는 방법
    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    // 동적으로 행동을 지정하는 방법
    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

    public abstract void display();

    // 나는 행동을 직접 구현하는 대신 나는 행동 인터페이스에 참조되는 객체에 그 행동을 위임
    public void PerformFly() {
        flyBehavior.Fly();
    }

    // 꽥 오리 소리를 내는 행동을 직접 구현하는 대신 인터페이스에 참조되는 객체에 그 행동을 위임
    public void PerformQuack() {
        quackBehavior.Qauck();
    }

    public void swim() {
        System.out.println("모든 오리는 물에 뜹니다. 가짜 오리도 물에 떠요.");
    }
}
