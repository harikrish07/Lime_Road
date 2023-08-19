package com.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.base.Base_class;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "H:\\Eclipse\\Lime_Road\\src\\test\\java\\com\\feature\\lime.feature", 
                 glue = "com.step", dryRun = false, 
                 plugin = {
                		 	"pretty", "json:Resource/lime_Read.json", "html:Resource/lime.html",
							"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" })

public class Runner {

}
