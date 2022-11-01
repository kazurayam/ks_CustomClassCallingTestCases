package com.kazurayam.inspectus.core

import com.kazurayam.inspectus.core.PostMaterialize
import com.kazurayam.inspectus.core.AnteMaterialize
import com.kazurayam.inspectus.core.Service

import com.kms.katalon.core.testcase.TestCase
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import com.kms.katalon.core.keyword.internal.KeywordExecutor

public class Service {

	public void execute(Map<String, Object> parameters) {

		// ante festum
		AnteFestum ante = new AnteMaterialize();
		Map<String, Object> antep = new LinkedHashMap<>()
		ante.preprocess(antep)

		// festum
		Map<String, Object> binding = new LinkedHashMap<>()
		callKatalonTestCase("Test Cases/materialize", binding)

		// post festum
		PostFestum post = new PostMaterialize();
		Map<String, Object> postp = new LinkedHashMap<>()
		post.postprocess(postp)
	}

	private static Object callKatalonTestCase(String testCaseName,
			Map<String, Object> binding) throws Exception {
		TestCase calledTestCase = findTestCase(testCaseName)
		return (Object)KeywordExecutor.executeKeywordForPlatform(
				KeywordExecutor.PLATFORM_BUILT_IN,
				"callTestCase", calledTestCase, binding)
	}
}
