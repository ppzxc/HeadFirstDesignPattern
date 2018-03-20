package head.first.design.pattern.rule.decorator.starbuzz;

import head.first.design.pattern.rule.decorator.starbuzz.impl.*;
import head.first.design.pattern.rule.decorator.starbuzz.dp.*;

/**
 *
 * 데코레이터 패턴
 *
 * 객체에 추가적인 요건을 동적으로 첨가한다.
 * 데코레이터는 서브 클래스를 만드는 것을 통해서
 * 기능을 유연하게 확장할 수 있는 방법을 제공한다.
 *
 * - 상속을 통해 확장을 할 수도 있지만, 디자인의 유연성 면에서 보면 별로 좋지 않습니다.
 * - 기존 코드를 수정하지 않고도 행동을 확장하는 방법이 필요합니다.
 * - 구성과 위임을 통해서 실행중에 새로운 행동을 추가할 수 있습니다.
 * - 상속 대신 데코레이터 패턴을 통해서 행동을 확장할 수 있습니다.
 * - 데코레이터 패턴에서는 구상 구성요소를 감싸주는 데코레이터들을 사용합니다.
 * - 데코레이터 클래스의 형식은 그 클래스가 감싸고 있는 클래스의 형식을 반영합니다. ( 상속 또는 인터페이스 구현을 통해서 자신이 감쌀 클래스와 같은 형식을 가지게 됩니다.)
 * - 데코레이터에서는 자기가 감싸고 있는 구성요소의 메소드를 호출한 결과에 새로운 기능을 더함으로써 행동을 확장합니다.
 * - 구성요소를 감싸는 데코레이터의 개수에는 제한이 없습니다.
 * - 구성요소의 클라이언트 입장에서는 데코레이터의 존재를 알 수 없습니다. 클라이언트에서 구성요소의 구체적인 형식에 의존하게 되는 경우는 예외 입니다.
 * - 데코레이터 패턴을 사용하면 자잘한 객체들이 매우 많이 추가될 수 있고, 데코레이터를 너무 많이 사용하면 코드가 필요 이상으로 복잡해질 수도 있습니다.
 */
public class StarbuzzCoffee {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage1 = new DarkRoast();
        beverage1 = new Soy(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Soy(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
    }
}
