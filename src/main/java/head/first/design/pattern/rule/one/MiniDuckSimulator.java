package head.first.design.pattern.rule.one;

import head.first.design.pattern.rule.one.dp.FlyRocketPowered;
import head.first.design.pattern.rule.one.impl.Duck;
import head.first.design.pattern.rule.one.impl.MallardDuck;
import head.first.design.pattern.rule.one.impl.ModelDuck;
import head.first.design.pattern.rule.one.impl.RubberDuck;

/*
 * Strategy Pattern *( 스트래티지 패턴 )*
 *
 * 헤드 퍼스트, 디자인 패턴 원칙 1번
 * - 애플리케이션에서 달라지는 부분을 찾아내고, 달라지지 않는 부분으로부터 분리시킨다.
 *
 * "바뀌는 부분은 따로 뽑아서 캡슐화 시킨다.
 * 그렇게 하면 나중에 바뀌지 않는 부분에는 영향을 미치지 않은 채로 그 부분만 고치거나 확장할 수 있다."
 *
 * 헤드 퍼스트, 디자인 패턴 원칙 2번
 * - 구현이 아닌 인터페이스에 맞춰서 프로그래밍 한다.
 * "각 행동은 인터페이스로 표현하고 행동을 구현할 때 이런 인터페이스를 구현하도록 하겠습니다.
 *
 * 헤드 퍼스트, 디자인 패턴 원칙 3번
 * - 상속보다는 구성을 활용한다.
 * "두 클래스를 "A에는 B가 있다" 관계로 합치는 것을 구성(Composition)을 이용하는 것이라 부릅니다.
 * 여기에 나와있는 오리 클래스에서는 행동을 상속받는 대신, 올바른 행동 객체로 구성됨으로써 행동을 부여받게 됩니다."
 *
 * 이러한 일련의 행동이 구성(Composition)을 이용하는 방법이며, FlyBehavior 알고리즘 군, QuackBehavior 알고리즘 군
 * 실제로 Duck을 구현하는 클라이언트 알고리즘 군으로 나누어 구분할수 있다.
 * */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        // Design Pattern이 적용된 인터페이스 및 날아가는 행동, 꽥꽥 소리를 내는 행동은 캡슐화 되어있음
        // 실제 구현부에서는 모름

        // 오리 종 전체는 추상화된 클래스로 날아다니는 행동과 꽥꽥 행동을 구현하지만, 행동은 인터페이스를 통해 위임함
        // 멀러드덕 구현 클래스가 모든 행동을 포함하며, 아래 처럼 표현시 MallardDuck에서 구현한 속성들이 동작함

        /**
         * 객체 지향의 기초
         * - 추상화
         * - 캡슐화
         * - 다형성
         * - 상속
         *
         * 객체 지향 원칙
         * - 바뀌는 부분은 캡슐화 한다.
         * - 상속보다는 구성을 활용한다.
         * - 구현이 아닌 인터페이스에 맞춰서 프로그래밍한다.
         *
         * 객체 지향 패턴
         * - 스트래티지 패턴 : 알고리즘군을 정의하고 각각을 캡슐화하여 바꿔 쓸 수 있게 만듭니다.
         * 스트래티지 패턴을 이용하면 알고리즘을 활용하는 클라이언트와 독립적으로 알고리즘을 변경할 수 있습니다.
         */

        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.swim();
        mallard.PerformFly();
        mallard.PerformQuack();

        System.out.println("");

        Duck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.swim();
        rubberDuck.PerformFly();
        rubberDuck.PerformQuack();

        System.out.println("");

        // 이미 구현된 인스턴스의 행동을 RunTime에서 변경 할수 있습니다.
        // 아래 방법으로요.
        Duck model = new ModelDuck();
        model.PerformFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.PerformFly();

        model.PerformQuack();
        model.swim();
        model.display();
    }
}
