package steps;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src/test/java/c_27_28C_features",
glue="steps",
plugin = {"html:report"},
tags = {"@smoke"}
//snippets = SnippetType.CAMELCASE
)
public class TestRunner extends AbstractTestNGCucumberTests{

}
