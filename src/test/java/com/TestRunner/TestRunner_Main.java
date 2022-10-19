package com.TestRunner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(

		//features = {"Feature/ToGet_Details_Using_CountryName_UsingAPI.feature"}
		features = {"Feature/WebOrder_Login_DataTable_All_TCs.feature"}
		//features = {"Feature/Spreecom_Login.feature"}
		//features = {"Feature/TestComplete_Login.feature"}
		//features = {"Feature/WebOrder_Login.feature"}
		//features = {"Feature"}
		,glue= "com.StepDefinition"
		,dryRun=false
		,monochrome=false
	    ,plugin  = {"pretty","html:CucumberReport/Report.html"}
		//,plugin  = {"pretty","html:CucumberReport/Report.html","rerun:Rerun/failed_scenarios.txt"}
		// ,tags="~@sanity"
		// ,tags= "@smoke,@sanity"
		// ,tags= "@smoke"
		// Execute all of them Except Sanity
		, tags = "not @sanity"
// Execute Smoke and Sanity both test cases
		// ,tags= "@smoke or @sanity"
// Execute Smoke and Sanity , but both should be marked together in feature
		// ,tags= "@smoke and @sanity"
		// ,tags= "@sanity"

		
		)

public class TestRunner_Main {

}
