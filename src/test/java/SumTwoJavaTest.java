import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SumTwoJavaTest {

  @Test
  void sumTwo() {
    int a = 2;
    int b = 3;
    int expected = a + b;

    SumTwoJava sumTwoJava = new SumTwoJava();
    Assertions.assertEquals(expected, sumTwoJava.sumTwoValues(a, b));
  }

  @Test
  void sumTwoFail() {
    int a = 2;
    int b = 3;
    int notValidValue = 0;
    SumTwoJava sumTwoJava = new SumTwoJava();
    Assertions.assertEquals(notValidValue, sumTwoJava.sumTwoValues(a, b));
  }
}
