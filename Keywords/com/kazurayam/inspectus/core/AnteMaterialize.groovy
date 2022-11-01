package com.kazurayam.inspectus.core

public class AnteMaterialize implements AnteFestum {

	@Override
	public void preprocess(Map<String, Object> parameters) throws InspectusException {
		println "Hello, from " + this.getClass().getSimpleName()+ "!"
	}
}
