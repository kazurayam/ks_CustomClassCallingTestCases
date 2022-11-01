package com.kazurayam.inspectus.katalon

import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

import com.kazurayam.inspectus.core.Festum
import com.kazurayam.inspectus.core.InspectusException
import com.kms.katalon.core.keyword.internal.KeywordExecutor
import com.kms.katalon.core.testcase.TestCase

public class KatalonTestCaseCaller implements Festum {

	KatalonTestCaseCaller() {}

	@Override
	public Object call(String calleeName, Map<String, Object> binding) throws InspectusException {
		try {
			return callKatalonTestCase(calleeName, binding)
		} catch (Exception e) {
			throw new InspectusException(e)
		}
	}

	private static Object callKatalonTestCase(String testCaseName, Map<String, Object> binding) throws Exception {
		TestCase calledTestCase = findTestCase(testCaseName)
		return (Object)KeywordExecutor.executeKeywordForPlatform(
				KeywordExecutor.PLATFORM_BUILT_IN,
				"callTestCase", calledTestCase, binding)
	}
}
