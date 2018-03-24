package head.first.design.pattern.rule.decorator.v1.abstandimpl;

/**
 * Created by cho_jeong_ha on 2018-03-24 오후 11:40
 * Blog : https://jungha-cho.github.io/
 * Github : https://github.com/JungHa-Cho
 * Email : ppzxc8487@gmail.com
 */
public class Espresso extends Beverage {

  public Espresso() {
    description = "에스프레소";
  }

  @Override
  public double cost() {
    return 1.99;
  }
}
