package head.first.design.pattern.rule.decorator.v1.abstandimpl;

/**
 * Created by cho_jeong_ha on 2018-03-24 오후 11:38
 * Blog : https://jungha-cho.github.io/
 * Github : https://github.com/JungHa-Cho
 * Email : ppzxc8487@gmail.com
 */
public abstract class Beverage {
  String description = "음료";

  public String getDescription() {
    return description;
  }

  public abstract double cost();
}
