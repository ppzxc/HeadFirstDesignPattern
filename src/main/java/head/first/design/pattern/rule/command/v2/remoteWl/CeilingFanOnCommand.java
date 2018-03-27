/*
 * Copyright (c) 2018. JeongHa, Cho
 */

package head.first.design.pattern.rule.command.v2.remoteWl;

public class CeilingFanOnCommand implements Command {
	CeilingFan ceilingFan;

	public CeilingFanOnCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	public void execute() {
		ceilingFan.high();
	}
}
