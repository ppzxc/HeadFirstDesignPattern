/*
 * Copyright (c) 2018. JeongHa, Cho
 */

package head.first.design.pattern.rule.command.v3.remoteWl;

public class GarageDoorDownCommand implements Command {
	GarageDoor garageDoor;

	public GarageDoorDownCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	public void execute() {
		garageDoor.up();
	}

	public void undo() { garageDoor.down(); }
}
