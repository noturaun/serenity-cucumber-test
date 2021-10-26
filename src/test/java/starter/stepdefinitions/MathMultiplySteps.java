package starter.stepdefinitions;

import net.thucydides.core.annotations.Step;
import starter.Calculator;

import static org.assertj.core.api.Assertions.*;

public class MathMultiplySteps {

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
