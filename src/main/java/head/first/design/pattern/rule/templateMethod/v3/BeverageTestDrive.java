package head.first.design.pattern.rule.templateMethod.v3;

public class BeverageTestDrive {
    public static void main(String[] args) {
        CoffeeWithHook coffeeWithHook = new CoffeeWithHook();

        System.out.println("커피 준비중..");
        coffeeWithHook.prepareRecipe();
    }
}
