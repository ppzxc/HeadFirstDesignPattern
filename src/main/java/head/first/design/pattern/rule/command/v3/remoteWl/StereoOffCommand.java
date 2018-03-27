/*
 * Copyright (c) 2018. JeongHa, Cho
 */

package head.first.design.pattern.rule.command.v3.remoteWl;

public class StereoOffCommand implements Command {
	Stereo stereo;

	public StereoOffCommand(Stereo stereo) {
		this.stereo = stereo;
	}
 
	public void execute() {
		stereo.off();
	}

	@Override
	public void undo() {
		stereo.on();
	}
}
