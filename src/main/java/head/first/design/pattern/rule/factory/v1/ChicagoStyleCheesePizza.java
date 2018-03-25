package head.first.design.pattern.rule.factory.v1;

/**
 * Created by cho_jeong_ha on 2018-03-25 오후 11:23
 * Blog : https://jungha-cho.github.io/
 * Github : https://github.com/JungHa-Cho
 * Email : ppzxc8487@gmail.com
 */
public class ChicagoStyleCheesePizza extends Pizza {
  public ChicagoStyleCheesePizza() {
    name = "Chicago Style Deep Dish Cheese Pizza";
    dough = "Extra Thick Crust Dough";
    sauce = "Plum Tomato Sauce";

    toopings.add("Shredded Mozzarella Cheese");
  }

  @Override
  void cut() {
    // 오버라이드 할껀 오버라이드 해서, 각자 클래스에 맞게 구현한다.
    System.out.println("Cutting The Pizza Into Square Slices");
  }
}
