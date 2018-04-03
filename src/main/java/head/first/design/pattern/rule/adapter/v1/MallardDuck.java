package head.first.design.pattern.rule.adapter.v1;

public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("오리 꽥꽥");
    }

    @Override
    public void fly() {
        System.out.println("날아 다닌다!");
    }
}
