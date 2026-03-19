package be.ses.javatest;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.*;

public class DoublerTest {
  @Test
  public void gegevenOperationDivideX2Y1_wanneerDoubleCalculator_danResultIs4() {
    // 1. Arrange
    // Calculator calc = new Calculator();
    Calculator calculatorMock = mock(Calculator.class);
    when(calculatorMock.divide(2.0f, 1.0f)).thenReturn(2.0f);
    Doubler doubler = new Doubler();
    Float x = 2.0f;
    Float y = 1.0f;

    // 2. Act
    Float result = doubler.divide(calculatorMock, x, y);

    // 3. Assert
    assertThat(result).isEqualTo(4.0f).withFailMessage("result was " + result + " but expected 4.0.");
  }
}
