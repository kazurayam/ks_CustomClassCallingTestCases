package com.kazurayam.inspectus.core

public class PostMaterialize implements PostFestum {

	@Override
	public void postprocess(Map<String, Object> parameters) throws InspectusException {
		println "Goodbye"
	}
}
