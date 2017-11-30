package demo

import org.junit.Test
import kotlin.test.assertEquals

class GreeterTest {
  @Test fun greetingsTest() {
    val greeter = Greeter()
    assertEquals("Hello World!", greeter.greetings("World"))
  }
}
