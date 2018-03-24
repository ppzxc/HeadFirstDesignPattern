package head.first.design.pattern.rule.decorator.v1.abstandimpl;

/**
 * Created by cho_jeong_ha on 2018-03-24 오후 11:42
 * Blog : https://jungha-cho.github.io/
 * Github : https://github.com/JungHa-Cho
 * Email : ppzxc8487@gmail.com
 */
public class HouseBlend extends Beverage {
  public HouseBlend() {
    description = "하우스블렌드";
  }

  @Override
  public double cost() {
    return .89;
  }
}
