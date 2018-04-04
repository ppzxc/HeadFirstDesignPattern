package head.first.design.pattern.rule.templateMethod.v1;

public abstract class CaffeineBeverage {
    abstract void prepareRecipe();

    public void boilWater() {
        System.out.println("물 끓이는 중");
    }

    public void pourInCup() {
        System.out.println("컵에 따르는 중");
    }
}
