package head.first.design.pattern.rule.decorator.v1.abstandimpl;

/**
 * Created by cho_jeong_ha on 2018-03-24 오후 11:46
 * Blog : https://jungha-cho.github.io/
 * Github : https://github.com/JungHa-Cho
 * Email : ppzxc8487@gmail.com
 */
public class StarbuzzCoffee {
  public static void main(String[] args) {
    Beverage beverage = new Espresso();
    System.out.println(beverage.getDescription() + " $" + beverage.cost());

    Beverage beverage1 = new DarkRoast();
    beverage1 = new Mocha(beverage1);
    beverage1 = new Mocha(beverage1);
    beverage1 = new Whip(beverage1);

    System.out.println("\r\n " + beverage1.getDescription() + ", $" + beverage1.cost());
  }
}
