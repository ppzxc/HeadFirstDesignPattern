/*
 * Copyright (c) 2018. JeongHa, Cho
 */

package head.first.design.pattern.rule.command.v1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by cho_jeong_ha on 2018-03-27 오후 4:44
 * Blog : https://jungha-cho.github.io/
 * Github : https://github.com/JungHa-Cho
 * Email : ppzxc8487@gmail.com
 */
public class RemoteControlTest {

  @Test
  public void 리모컨으로_컴퓨터를_킨다() {
    // Given
    SimpleRemoteControl src = new SimpleRemoteControl();
    Computer light = new Computer();
    boolean beforeLight = light.power;
    src.setCommand(new ComputerOnCommand(light));

    // When
    src.buttonWasPressed();

    // Then
    assertFalse(beforeLight == light.power);
  }
}