package head.first.design.pattern.rule.strategy.impl;

import head.first.design.pattern.rule.strategy.dp.FlyBehavior;
import head.first.design.pattern.rule.strategy.dp.QuackBehavior;

/**
 * Duck, 오리를 표현하는 구상 클래스
 * Duck 구상 클래스를 상속받아 실제 오리를 구현한다.
 */
public abstract class Duck {

    /**
     * Duck의 세부 속성을 구현하는 행동 인터페이스 구현
     */
    FlyBehavior flyBehavior;
    /**
     * Duck의 세부 속성을 구현하는 행동 인터페이스 구현
     */
    QuackBehavior quackBehavior;

    /**
     * 생성자
     */
    public Duck() { }

    /**
     * 동적으로 행동을 지정하는 방법.
     * FlyBehavior 인터페이스를 인스턴스 변수화 했기 때문에
     * FlyBehavior를 구현한 모든 클래스를 행동으로 받아들일 수 있다.
     *
     * @param fb the fb
     */
    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    /**
     * 동적으로 행동을 지정하는 방법.
     * QuackBehavior 인터페이스를 인스턴스 변수화 했기 때문에
     * QuackBehavior를 구현한 모든 클래스를 행동으로 받아들일 수 있다.
     *
     * @param qb the qb
     */
    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }


    /**
     * 나는 행동을 직접 구현하는 대신
     * 나는 행동 인터페이스에 참조되는 객체에 그 행동을 위임
     * flyBehavior를 구현한 모든 클래스는 fly 메소드를 오버라이드
     * 했음으로 해당 메소드를 불러온다
     */
    public void PerformFly() {
        flyBehavior.Fly();
    }

    /**
     * 나는 행동을 직접 구현하는 대신
     * 나는 행동 인터페이스에 참조되는 객체에 그 행동을 위임
     * QuackBehavior를 구현한 모든 클래스는 fly 메소드를 오버라이드
     * 했음으로 해당 메소드를 불러온다
     */
    public void PerformQuack() {
        quackBehavior.Qauck();
    }

    /**
     * 오리의 외부 형체를 표시함.
     * 이 또한 오리마다 다름
     */
    public abstract void display();

    /**
     * Swim.
     */
    public void swim() {
        System.out.println("모든 오리는 물에 뜹니다. 가짜 오리도 물에 떠요.");
    }
}
