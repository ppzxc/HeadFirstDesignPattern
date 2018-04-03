package head.first.design.pattern.rule.adapter.v1;

public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("골골골");
    }

    @Override
    public void fly() {
        System.out.println("짧은 거리만 날아다닐수 있어요");
    }
}
