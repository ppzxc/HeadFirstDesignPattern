/*
 * Copyright (c) 2018. JeongHa, Cho
 */

package head.first.design.pattern.rule.singleton.general;

/**
 * Created by cho_jeong_ha on 2018-03-27 오후 3:49
 * Blog : https://jungha-cho.github.io/
 * Github : https://github.com/JungHa-Cho
 * Email : ppzxc8487@gmail.com
 */
public class OldSingleton2 {
  /**
   * static으로 선언되 전역 변수로 사용될 인스턴스
   */
  private static OldSingleton2 uniqueInstance;

  /**
   * Singleton을 위해 private으로 외부 생성을 막음
   */
  private OldSingleton2() { }

  /**
   * 고전 singleton의 getInstance
   *
   * @return 유일무이 객체
   */
  public static OldSingleton2 getInstance() {
    // static 변수만 있을뿐, 객체 할당 검사
    if (uniqueInstance == null) {
      uniqueInstance = new OldSingleton2();
    }
    return uniqueInstance;
  }
}
