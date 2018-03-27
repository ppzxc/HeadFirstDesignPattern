/*
 * Copyright (c) 2018. JeongHa, Cho
 */

package head.first.design.pattern.rule.command.v3;

import head.first.design.pattern.rule.command.v3.remoteWl.Command;

/**
 * Created by cho_jeong_ha on 2018-03-27 오후 4:37
 * Blog : https://jungha-cho.github.io/
 * Github : https://github.com/JungHa-Cho
 * Email : ppzxc8487@gmail.com
 */
public class ComputerOffCommand implements Command {
  /**
   * 컴퓨터의 동작 객체
   */
  Computer computer;

  /**
   * 생성자로 컴퓨터 객체를 받아온다
   * 해당 객체는 이 클래스에서 동작을 정의하는데
   * 해당 동작은 Command 패턴을 적용해 캡슐화 한다.
   *
   * @param Computer the computer
   */
  public ComputerOffCommand(Computer Computer) {
    this.computer = Computer;
  }

  @Override
  public void execute() {
    computer.off();
  }

  public void undo() {
    
  }
}
