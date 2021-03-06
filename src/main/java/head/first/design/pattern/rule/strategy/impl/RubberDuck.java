package head.first.design.pattern.rule.strategy.impl;

import head.first.design.pattern.rule.strategy.dp.FlyNoWay;
import head.first.design.pattern.rule.strategy.dp.Squeak;

/**
 * 헤드 퍼스트, 디자인 패턴 원칙 1번
 * - 애플리케이션에서 달라지는 부분을 찾아내고, 달라지지 않는 부분으로부터 분리시킨다.
 *
 * "바뀌는 부분은 따로 뽑아서 캡슐화 시킨다.
 * 그렇게 하면 나중에 바뀌지 않는 부분에는 영향을 미치지 않은 채로 그 부분만 고치거나 확장할 수 있다."
 *
 * 헤드 퍼스트, 디자인 패턴 원칙 2번
 * - 구현이 아닌 인터페이스에 맞춰서 프로그래밍 한다.
 * "각 행동은 인터페이스로 표현하고 행동을 구현할 때 이런 인터페이스를 구현하도록 하겠습니다.
 */
public class RubberDuck extends Duck {

    /**
     * 러버덕 객체 생성
     */
    public RubberDuck() {
        // 유연함은 여기서
        // 실제 행동 구현과 사용 부분이 분리됨으로써 유지보수가 쉬워진다.
        quackBehavior = new Squeak();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("러버덕 고무 오리가 표현됩니다!!");
    }
}
