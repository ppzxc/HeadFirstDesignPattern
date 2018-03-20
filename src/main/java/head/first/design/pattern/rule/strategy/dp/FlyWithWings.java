package head.first.design.pattern.rule.strategy.dp;

public class FlyWithWings implements FlyBehavior {

    /**
     * 인터페이스의 세부 내용을 구현한다.
     *
     * 이 클래스는 날수 있는 오리를 만들기 위한 클래스 임으로
     * 나는 행동을 구현하면 된다.
     */
    @Override
    public void Fly() {
        System.out.println("이 오리는 날아 다닌다.");
    }
}
