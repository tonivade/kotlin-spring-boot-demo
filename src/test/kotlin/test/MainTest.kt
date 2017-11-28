package test

import org.junit.Test
import kotlin.test.assertEquals

class MainTest {
    @Test fun greatingsTest() {
        assertEquals("Hello World!", greatings("World"))
    }
}