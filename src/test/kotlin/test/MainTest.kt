package test

import org.junit.Test
import kotlin.test.assertEquals

class MainTest {
    @Test fun greatingsTest() {
        val main = Main()
        assertEquals("Hello World!", main.greatings("World"))
    }
}
