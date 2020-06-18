package myRunner;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
			features = {"D:\\CucumberWorkSpace\\FreeCRMDemoproject2\\src\\main\\java\\features\\"}
				,glue= {"stepDefination"}
				,plugin= {"pretty", "html:test-output"}
				,format= {"json:json_output/Cucumber.json","junit:junit_output/cucumber.xml"}
				,dryRun =true
				,monochrome= true
				,strict= true,
				tags = {"@SmokeTest"}
				)


public class MyRunner {

}




/*Note:Different tags of CucumberOptions:
	dryRun-Mapping is Correct or not, So see all the Implemention of the Feature File Should be there on the StepDefination class
	features - Where the Feature File is Present(Path Definition of the feature file)
	Glue - Path of the StepDefination File.
	Tags -
	Monochrome - Display the  Console Output in a readable format.
	Format - to Generate different Types of Report(Ex: html, Json, html)
	Strict - it will fail execution if there are any Pending Steps are there.
	*/

/*Data Driven Testing
Without Example keyword Regular expression (\"(.*)\")
With example Keywords
Note: If we are Using Scenario withOut Example Keyword then We have to use Scenario and if we are Using with Example keyword then we have to Use 
Scenario Outline
*/



/*Note:  different Tag Feature
 * tags= {"@SmokeTest"}   - It will execute only the Testcase that is tagged under the tag @SmokeTest.
 * OR : tags= {"@SmokeTest , @End2End"} - It will Execute the Scenarios which is having either of the two Tags.
 * And :tags= {"@SmokeTest" , "@End2End"} - It will execute the Scenarios Which is 
 * having both the tags i.e. @SmokeTest and @End2End Tags\
 * NotInculude:tags = {"~@SmokeTest" , "~@RegressionTest", "~@End2End"} - It will not include the Tags
 * If we want to run Multiple features then we have to Provide the tags on Feature level.and on 
 * the Runner class have to Include the tags( EX: tags = {"@SmokeTest"} )
 * It will Include the Smoke Test of both the Feature file 1st and 2nd.

*/






