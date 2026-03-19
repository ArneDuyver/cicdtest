package be.ses.javatest;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {

  // Wat commentaar
  @Test
  public void gegevenXis4enYis2_wanneerDivide_danResultIs2punt0(){
    // 1. Arrange
    Calculator calc = new Calculator();
    Float x = 4.0f;
    Float y = 2.0f;

    // 2. Act
    Float result = calc.divide(x,y);

    // 3. Assert
    assertThat(result).isEqualTo(2.0f);
  }

  @Test
  public void gegevenTeller2Noemer1_wanneerDivide_danResult2() {
    // 1. Arrange
    Calculator calculator = new Calculator();

    // 2. Act
    Float result = calculator.divide(2.0f, 1.0f);
    System.out.println(result);

    // 3. Assert
    assertThat(result).isEqualTo(2);
  }

  @Test
  public void gegevenTeller2Noemer4_wanneerDivide_danResult0point5() {
    // 1. Arrange
    Calculator calculator = new Calculator();

    // 2. Act
    Float result = calculator.divide(2.0f, 4.0f);
    System.out.println(result);

    // 3. Assert
    assertThat(result).isEqualTo(0.5f);
  }

  @Test
  public void gegevenTellerXNoemer0_wanneerDivide_danDivideByZeroException() {
    // when
    Throwable thrown = catchThrowable(() -> {
      // 1. Arrange
      Calculator calculator = new Calculator();

      // 2. Act
      Float result = calculator.divide(2.0f, 0.0f);
    });

    // 3. Assert
    assertThat(thrown)
        .isInstanceOf(ArithmeticException.class)
        .hasMessageContaining("/ by zero");
  }

}
