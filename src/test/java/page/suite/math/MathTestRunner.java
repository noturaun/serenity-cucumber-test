package page.suite.math;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.thucydides.core.annotations.Narrative;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        tags = "@Math",
        features = "src/test/resources/features/Math.feature",
        glue = {""})
@Narrative(text={"Maths is important."})
public class MathTestRunner {
}
