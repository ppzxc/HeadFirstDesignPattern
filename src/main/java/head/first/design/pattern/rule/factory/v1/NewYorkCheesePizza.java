package head.first.design.pattern.rule.factory.v1;

/**
 * Created by cho_jeong_ha on 2018-03-25 오후 11:21
 * Blog : https://jungha-cho.github.io/
 * Github : https://github.com/JungHa-Cho
 * Email : ppzxc8487@gmail.com
 */
public class NewYorkCheesePizza extends Pizza {
  public NewYorkCheesePizza() {
    name = "NY STYLE Sauce and Cheese Pizza";
    dough = "Thin Crust Dough";
    sauce = "Marinara Sauce";

    toopings.add("Grated Reggiano Cheese");
  }
}
