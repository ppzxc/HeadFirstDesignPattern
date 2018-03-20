package head.first.design.pattern.rule.strategy.dp;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void Fly() {
        System.out.println("저는 로켓 추진으로 날아가요.");
    }
}
