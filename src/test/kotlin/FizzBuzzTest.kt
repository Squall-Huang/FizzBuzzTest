import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

class FizzBuzzTest {

    @Test
    fun `normal number should return original number`() {
        val fizzBuzz = FizzBuzz()
        val actual = fizzBuzz.convert(1)
        Assertions.assertEquals("1",actual)
    }

    @Test
    fun `number 3 should return fizz`() {
        val fizzBuzz = FizzBuzz()
        val actual = fizzBuzz.convert(3)
        Assertions.assertEquals("fizz",actual)
    }

    @Test
    fun `number 5 should return buzz`() {
        val fizzBuzz = FizzBuzz()
        val actual = fizzBuzz.convert(5)
        Assertions.assertEquals("buzz",actual)
    }

    @Test
    fun `number 15 should return fizzbuzz`() {
        val fizzBuzz = FizzBuzz()
        val actual = fizzBuzz.convert(15)
        Assertions.assertEquals("fizz buzz",actual)
    }
}