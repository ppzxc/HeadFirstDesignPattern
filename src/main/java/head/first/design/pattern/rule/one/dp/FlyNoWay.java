package head.first.design.pattern.rule.one.dp;

public class FlyNoWay implements FlyBehavior {

    /**
     * 날아 다니지 못하는 오리 구현
     */
    @Override
    public void Fly() {
        System.out.println("이 오리는 날아 다니지 못해요.");
    }
}
