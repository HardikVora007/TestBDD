/**
 * 
 */
package com.cucumber.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * @author user
 *
 */


@RunWith(Cucumber.class)
@CucumberOptions(
		format = {"pretty", "html:target/cucumber-results"},
		features = {"src/com.cucumber.smoke/"}
		)

public class CucumberRunner {

	
}