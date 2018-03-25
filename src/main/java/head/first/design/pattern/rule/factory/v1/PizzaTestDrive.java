package head.first.design.pattern.rule.factory.v1;

/**
 * Created by cho_jeong_ha on 2018-03-25 오후 11:25
 * Blog : https://jungha-cho.github.io/
 * Github : https://github.com/JungHa-Cho
 * Email : ppzxc8487@gmail.com
 */
public class PizzaTestDrive {

  public static void main(String[] args) {
    PizzaStore nyStore = new NYPizzaStore();
    PizzaStore chicagoStore = new ChicagoPizzaStore();

    Pizza pizza = nyStore.orderPizza("cheese");
    System.out.println("Ethan ordered a " + pizza.getName() + "\n");

    Pizza pizza2 = chicagoStore.orderPizza("cheese");
    System.out.println("Joel ordered a " + pizza2.getName() + "\n");
  }
}
