package head.first.design.pattern.rule.templateMethod.v2;

public class Coffee extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("필터를 통해 커피를 우려 내는 중");
    }

    @Override
    void addCondiments() {
        System.out.println("설탕과 우유를 추가 하는 중");
    }
}
