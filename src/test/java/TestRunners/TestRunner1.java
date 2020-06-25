package TestRunners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by SagarGa on 17/05/18.
 */
@RunWith(Cucumber.class)
//@CucumberOptions(plugin = {"pretty"})
@CucumberOptions(
        features = "src/test/java/features"
        ,glue={"stepDef"}
        ,tags="@regression or @smoke"
        //,tags="@smoke"
        ,format = {"pretty", "html:build/cucumber-html-report"}
)
public class TestRunner1 {
    /*@BeforeClass
    public static void setup() {
        BaseSpec.getBaseSpecInstance().before();
    }

    @AfterClass
    public static void teardown() {
        BaseSpec.getBaseSpecInstance().after();
    }*/
}

