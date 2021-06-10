import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class FizzBuzzTest {

    @Test
    fun `normal number should return original number`() {
        val fizzBuzz = FizzBuzz()
        val actual = fizzBuzz.convert(1)
        Assertions.assertEquals(1,actual)
    }
}