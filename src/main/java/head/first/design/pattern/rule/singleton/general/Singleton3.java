/*
 * Copyright (c) 2018. JeongHa, Cho
 */

package head.first.design.pattern.rule.singleton.general;

/**
 * Created by cho_jeong_ha on 2018-03-27 오후 4:07
 * Blog : https://jungha-cho.github.io/
 * Github : https://github.com/JungHa-Cho
 * Email : ppzxc8487@gmail.com
 */
public class Singleton3 {
  /**
   * 인스턴스 사용 중 getInstance가 성능 저하가 없다면,
   * 실행 중 수시로 체크하는 부분이 복잡하거나 성가실때,
   * 처음부터 만들어 버린다.
   */
  private static Singleton3 uniqueInstance = new Singleton3();

  private Singleton3() { }

  public static Singleton3 getInstance() {
    return uniqueInstance;
  }
}
