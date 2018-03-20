package com.cucumber.framework.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = { "classpath:featureFile/Login.feature" }, glue = { "classpath:com.cucumber.framework.stepDefinition" })
public class LoginFeatureRunner extends AbstractTestNGCucumberTests {

}
