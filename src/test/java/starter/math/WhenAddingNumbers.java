package starter.math;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Narrative;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import starter.stepdefinitions.MathAdditionSteps;
import starter.stepdefinitions.MathMultiplySteps;

@RunWith(SerenityRunner.class)
@Narrative(text={"Maths is important."})
public class WhenAddingNumbers {

    @Steps
    MathAdditionSteps michael;
    @Steps
    MathMultiplySteps jono;

    @Test
    public void addingSums() {
        // Given
        michael.startsWith(1);

        // When
        michael.adds(2);

        // Then
        michael.shouldHave(3);
    }

    @Test
    public void multiplyBy(){
        // Given
        jono.startsWith(5);

        // When
        jono.multiplyBy(10);

        // Then
        jono.shouldHave(50);
    }
}
