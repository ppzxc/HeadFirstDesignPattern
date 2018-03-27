/*
 * Copyright (c) 2018. JeongHa, Cho
 */

package head.first.design.pattern.rule.command.v1;

import java.text.SimpleDateFormat;

/**
 * Created by cho_jeong_ha on 2018-03-27 오후 4:40
 * Blog : https://jungha-cho.github.io/
 * Github : https://github.com/JungHa-Cho
 * Email : ppzxc8487@gmail.com
 */
public class SimpleRemoteControl {
  /**
   * 커맨드 패턴의 캡슐화 주체
   */
  Command slot;

  /**
   * 생성자
   */
  public SimpleRemoteControl() { }

  /**
   * Command 인터페이스를 구현한 클래스를 받아서
   * 커맨드로 등록한다.
   * 즉, SimpleRemoteControl이 중계자 역할이며,
   * SimepleRemoteControl에서 모든 동작이 캡슐화 된다.
   *
   * @param command the command
   */
  public void setCommand(Command command) {
    slot = command;
  }

  /**
   * 버튼을 누르면 Command 패턴으로 캡슐화된
   * 특정 로직을 실행한다.
   */
  public void buttonWasPressed() {
    slot.execute();
  }
}
