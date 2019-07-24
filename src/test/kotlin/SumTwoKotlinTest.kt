import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class SumTwoKotlinTest {
  @Test
  fun sumTwo() {
    val a = 2
    val b = 3
    val expected = a + b

    val sumTwoJava = SumTwoJava()
    Assertions.assertEquals(expected, sumTwoJava.sumTwoValues(a, b))
  }

  @Test
  fun sumTwoFail() {
    val a = 2
    val b = 3
    val notValidValue = 0
    val sumTwoJava = SumTwoJava()
    Assertions.assertEquals(notValidValue, sumTwoJava.sumTwoValues(a, b))
  }
}