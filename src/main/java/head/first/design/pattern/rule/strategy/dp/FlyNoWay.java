package head.first.design.pattern.rule.strategy.dp;

/**
 * 날아다니지 못하는 행위
 */
public class FlyNoWay implements FlyBehavior {

    /**
     * 인터페이스에 맞춰서 오버라이드한 메소드이지만,
     * 내용은 FlyNoWay, 즉 나는 행동을 날지 못하는 속성으로 구현했다.
     */
    @Override
    public void Fly() {
        System.out.println("이 오리는 날아 다니지 못해요.");
    }
}
