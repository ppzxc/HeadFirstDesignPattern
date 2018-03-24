package head.first.design.pattern.rule.decorator.v1.abstandimpl;

/**
 * Created by cho_jeong_ha on 2018-03-24 오후 11:43
 * Blog : https://jungha-cho.github.io/
 * Github : https://github.com/JungHa-Cho
 * Email : ppzxc8487@gmail.com
 */
public class Mocha extends CondimentDecorator {
  Beverage beverage;

  Mocha(final Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", 모카";
  }

  @Override
  public double cost() {
    return .20 + beverage.cost();
  }
}
