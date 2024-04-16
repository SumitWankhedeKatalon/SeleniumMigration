import org.example.SampleJUnitTest
import org.example.SimpleTest as SimpleTest

import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testng.keyword.JUnitRunnerResult
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW

List testSuites = ['Include/resources/testng.xml']

TestNGKW.runTestNGTestSuites(testSuites, FailureHandling.STOP_ON_FAILURE)

List testClasses = [SimpleTest.class]

TestNGKW.runTestNGTestClasses(testClasses, FailureHandling.STOP_ON_FAILURE)



