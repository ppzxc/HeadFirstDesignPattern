package head.first.design.pattern.rule.factory.v1;

import java.util.ArrayList;

/**
 * Created by cho_jeong_ha on 2018-03-25 오후 11:16
 * Blog : https://jungha-cho.github.io/
 * Github : https://github.com/JungHa-Cho
 * Email : ppzxc8487@gmail.com
 */
public abstract class Pizza {
  String name;
  String dough;
  String sauce;
  ArrayList toopings = new ArrayList();

  void prepare() {
    System.out.println("Preparing " + name);
    System.out.println("Tossing dough...");
    System.out.println("Adding suace...");
    System.out.println("Adding toppings : ");
    for (int i = 0; i < toopings.size(); i++) {
      System.out.println("   " + toopings.get(i));
    }
  }

  void bake() {
    System.out.println("Bake for 25 minutes at 350");
  }

  void cut() {
    System.out.println("Cutting the pizza into diagonal slices");
  }

  void box() {
    System.out.println("Place pizza in official PizzaStore box");
  }

  public String getName() {
    return name;
  }
}
