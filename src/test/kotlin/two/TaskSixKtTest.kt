package two

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class TaskSixKtTest {

    @Test
    fun caesarEncryptTest1() {
        Assertions.assertEquals("Khoor!", caesarEncrypt("Hello!", 3))
    }

    @Test
    fun caesarEncryptTest2() {
        Assertions.assertEquals("Lipps!", caesarEncrypt("Hello!", 4))
    }

    @Test
    fun caesarEncryptTest3() {
        Assertions.assertEquals("Ebiil!", caesarEncrypt("Hello!", -3))
    }

    @Test
    fun caesarEncryptTest4() {
        Assertions.assertEquals("Ebiil.", caesarEncrypt("Hello.", -3))
    }

    @Test
    fun caesarEncryptTest5() {
        Assertions.assertEquals("Xyz", caesarEncrypt("Abc", -3))
    }

    @Test
    fun caesarEncryptTest6() {
        Assertions.assertEquals("Olccb", caesarEncrypt("Lizzy", 3))
    }
}