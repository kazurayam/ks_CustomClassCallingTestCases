package com.kazurayam.inspectus.core

public class Service {

	private Festum festum = null

	Service() {
		festum = null
	}

	public void setFestum(Festum festum) {
		this.festum = festum
	}

	public void execute(Map<String, Object> parameters) {
		if (festum == null) {
			throw new InspectusException("festum must not be null")
		}

		// ante festum
		AnteFestum ante = new AnteMaterialize();
		ante.preprocess([:])

		// in festum
		festum.call("Test Cases/materialize", [:])

		// post festum
		PostFestum post = new PostMaterialize();
		post.postprocess([:])
	}
}
