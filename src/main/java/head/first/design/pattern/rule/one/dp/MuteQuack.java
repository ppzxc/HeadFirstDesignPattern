package head.first.design.pattern.rule.one.dp;

public class MuteQuack implements QuackBehavior {
    @Override
    public void Qauck() {
        System.out.println("무음 오리!! 소리가 나지 않는다!!");
    }
}
