import com.ttypic.objclibs.greeting.HelloWorld
import platform.posix.LOG_INFO
import platform.posix.log
import platform.posix.printf
import kotlin.test.Test
import kotlin.test.assertEquals

class IosFibiTest {

    @kotlinx.cinterop.ExperimentalForeignApi
    @Test
    fun `test 3rd element`() {
        printf("%s",)
        assertEquals(7, fibi.take(3).last())
    }
}