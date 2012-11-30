package org.jvnet.hudson.plugins.m2release;

import hudson.model.Cause;

public class ReleaseFailedCause extends Cause {

	@Override
	public String getShortDescription() {
		return Messages.ReleasedFailedCause_ShortDescription();
	}

}
