/*
 * Copyright (c) 2018. JeongHa, Cho
 */

package head.first.design.pattern.rule.command.v4.party;

public class TVOffCommand implements Command {
	TV tv;

	public TVOffCommand(TV tv) {
		this.tv= tv;
	}

	public void execute() {
		tv.off();
	}

	public void undo() {
		tv.on();
	}
}
