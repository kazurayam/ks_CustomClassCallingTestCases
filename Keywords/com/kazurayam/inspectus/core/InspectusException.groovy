package com.kazurayam.inspectus.core

public class InspectusException extends Exception {

	public InspectusException(Throwable t) {
		super(t)
	}

	public InspectusException(String message) {
		super(message)
	}

	public InspectusException(Throwable t, String message) {
		super(t, message)
	}
}
