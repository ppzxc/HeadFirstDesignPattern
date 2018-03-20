package head.first.design.pattern.rule.strategy.dp;

public class Quack implements QuackBehavior {

    /**
     * 소리를 낼수 있는 오리 구현
     */
    @Override
    public void Qauck() {
        System.out.println("꽥꽥!!");
    }
}
