package head.first.design.pattern.rule.templateMethod.v2;

public abstract class CaffeineBeverage {
    /**
     * 프리페어 레시피는 템플릿 메소드이다.
     * 1. prepareRecipe는 메소드.
     * 2. 어떤 알고리즘에 대한 템플릿 역할을 함.
     * 3. 알고리즘의 각 단계는 메소드로 표현됨.
     */
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void brew();

    abstract void addCondiments();

    public void boilWater() {
        System.out.println("물 끓이는 중");
    }

    public void pourInCup() {
        System.out.println("컵에 따르는 중");
    }
}
