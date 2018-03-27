/*
 * Copyright (c) 2018. JeongHa, Cho
 */

package head.first.design.pattern.rule.command.v1;

/**
 * Created by cho_jeong_ha on 2018-03-27 오후 4:42
 * Blog : https://jungha-cho.github.io/
 * Github : https://github.com/JungHa-Cho
 * Email : ppzxc8487@gmail.com
 */
public class RemoteControlTest {
  public static void main(String[] args) {
    SimpleRemoteControl remote = new SimpleRemoteControl();
    Computer computer = new Computer();
    ComputerOnCommand computerOn = new ComputerOnCommand(computer);

    remote.setCommand(computerOn);
    remote.buttonWasPressed();
  }
}
