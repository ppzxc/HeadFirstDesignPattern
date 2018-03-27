/*
 * Copyright (c) 2018. JeongHa, Cho
 */

package head.first.design.pattern.rule.singleton.general;

/**
 * Created by cho_jeong_ha on 2018-03-27 오후 3:46
 * Blog : https://jungha-cho.github.io/
 * Github : https://github.com/JungHa-Cho
 * Email : ppzxc8487@gmail.com
 */
public class OldSingleton1 {
  /**
   * 생성자이지만 private으로 막혀있어서
   * 클래스 외부에서는 생성하지 못함.
   */
  private OldSingleton1(){ };

  /**
   * instance를 반환하는 함수로 객체를 얻어가게 강제함.
   * 하지만, new로 General을 생성해 반환하기 때문에,
   * Singleton이 아님
   *
   * @return the instance
   */
  public static OldSingleton1 getInstance() {
    return new OldSingleton1();
  }
}
