package head.first.design.pattern.rule.templateMethod.v1;

public class Coffee extends CaffeineBeverage {
    void prepareRecipe() {
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addSugarAndMilk();
    }

    /*public void boilWater() {
        System.out.println("물 끓이는 중");
    }*/

    public void brewCoffeeGrinds() {
        System.out.println("필터를 통해 커피를 우려 내는 중");
    }

    /*public void pourInCup() {
        System.out.println("컵에 따르는 중");
    }*/

    public void addSugarAndMilk() {
        System.out.println("설탕과 우유를 추가 하는 중");
    }
}
