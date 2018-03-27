/*
 * Copyright (c) 2018. JeongHa, Cho
 */

package head.first.design.pattern.rule.command.v4.party;

public class TVOnCommand implements Command {
	TV tv;

	public TVOnCommand(TV tv) {
		this.tv= tv;
	}

	public void execute() {
		tv.on();
		tv.setInputChannel();
	}

	public void undo() {
		tv.off();
	}
}
