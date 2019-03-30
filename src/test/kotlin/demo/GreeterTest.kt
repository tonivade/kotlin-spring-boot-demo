package demo

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.junit4.SpringRunner
import kotlin.test.assertEquals

@RunWith(SpringRunner::class)
class GreeterTest {
  
  @Autowired lateinit var greeter: Greeter
  
  @Test fun greetingsTest() {
    assertEquals("Hello World!", greeter.greetings("World"))
  }
}
