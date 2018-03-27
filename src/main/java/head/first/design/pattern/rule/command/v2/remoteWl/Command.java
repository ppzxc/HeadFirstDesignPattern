/*
 * Copyright (c) 2018. JeongHa, Cho
 */

package head.first.design.pattern.rule.command.v2.remoteWl;

/**
 * Created by cho_jeong_ha on 2018-03-27 오후 4:36
 * Blog : https://jungha-cho.github.io/
 * Github : https://github.com/JungHa-Cho
 * Email : ppzxc8487@gmail.com
 */
public interface Command {
  /**
   * Execute.
   * 커맨드 패턴은 보통 execute 메소드 하나만 가진다.
   */
  void execute();
  //void undo();
}
