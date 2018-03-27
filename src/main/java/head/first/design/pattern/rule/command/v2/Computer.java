/*
 * Copyright (c) 2018. JeongHa, Cho
 */

package head.first.design.pattern.rule.command.v2;

/**
 * Created by cho_jeong_ha on 2018-03-27 오후 4:37
 * Blog : https://jungha-cho.github.io/
 * Github : https://github.com/JungHa-Cho
 * Email : ppzxc8487@gmail.com
 */
public class Computer {
  /**
   * 컴퓨터 객체
   * false = 꺼짐
   * true = 켜짐
   */
  boolean power = false;

  /**
   * 킬때
   */
  void on() {
    power = true;
  }

  /**
   * 끌때
   */
  void off() {
    power = false;
  }
}
