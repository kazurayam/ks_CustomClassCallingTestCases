# 

## Problem to solve

I want to do this:

1. Katalon Studio runs Katalon TestCase "main".
2. main calls a class "Inspectus".
3. Inspectus calls a sub class "AnteFestum".
4. Inspectus calls another Katalon TestCase "materialize".
5. Inspectus calls a sub class "PostFestum".

Is the 4 possible?

How can the CustomClassX calls another TestCaseB?

## Solution.

I want the CustomClassX to do the same processing as the `WebUI.callTestCase` keyword.

Let me try it in this project.

## Description

Source of [com.kms.katalon.core.keyword.BuiltinKeyword#callTestCase](https://api-docs.katalon.com/com/kms/katalon/core/keyword/BuiltinKeywords.html#callTestCase(com.kms.katalon.core.testcase.TestCase,%20java.util.Map))

```
    /**
     * Call and execute another test case
     * @param calledTestCase
     *      represents a test case
     * @param binding
     *      contains variables bindings for the called test case. 
     *      If the <code>binding<code> parameter is null, default values of all variables are used.
     * @param flowControl
     * @return returned value of called test case
     * @throws Exception
     */
    @CompileStatic
    @Keyword(keywordObject = StringConstants.KW_CATEGORIZE_UTILITIES)
    public static Object callTestCase(TestCase calledTestCase, Map binding, FailureHandling flowControl) throws Exception {
        return (Object)KeywordExecutor.executeKeywordForPlatform(KeywordExecutor.PLATFORM_BUILT_IN, "callTestCase", calledTestCase, binding, flowControl)
    }

```

I should be able to do just the same.