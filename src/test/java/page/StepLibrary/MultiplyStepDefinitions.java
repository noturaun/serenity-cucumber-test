package page.StepLibrary;

import net.thucydides.core.annotations.Step;
import page.Calculator;

import static org.assertj.core.api.Assertions.*;

public class MultiplyStepDefinitions {

    String actor;
    Calculator calculator;

    @Step("#actor start with {0}")
    public void startsWith(int amount) {
        calculator = new Calculator(amount);
    }

    @Step("#actor multiply by {0}")
    public void multiplyBy(int amount) {
        calculator.multiply(amount);
    }

    @Step("#actor should have {0}")
    public void shouldHave(int expectedTotal){
        assertThat(calculator.getTotal()).isEqualTo(expectedTotal);
    }
}
