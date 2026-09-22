// Task 6.3: unit tests for grade()

import kotlin.test.Test
import kotlin.test.assertEquals

class GradeTest {
    // Write tests here
    @Test
    fun lowMarkFails(){
        assertEquals("Fail",grade(25))
    }
    @Test
    fun fortyPasses(){
        assertEquals("Pass",grade(40))
    }
    @Test
    fun seventyGetDistinction(){
        assertEquals("Distinction",grade(70))
    }
}
