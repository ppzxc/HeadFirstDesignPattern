package head.first.design.pattern.rule.templateMethod.v3;

public abstract class CaffeineBeverageWithHook {
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
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    abstract void brew();

    abstract void addCondiments();

    public void boilWater() {
        System.out.println("물 끓이는 중");
    }

    public void pourInCup() {
        System.out.println("컵에 따르는 중");
    }

    /**
     * 후크 활용을 위해서는 서브 클래스에서 오버라이드 해야한다.
     * 기본 true기 때문에 항상 첨가물을 넣음
     * @return
     */
    boolean customerWantsCondiments() {
        return true;
    }
}
