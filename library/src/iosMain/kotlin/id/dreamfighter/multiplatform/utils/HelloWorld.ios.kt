package id.dreamfighter.multiplatform.utils
import com.ttypic.objclibs.greeting.HelloWorld
import kotlinx.cinterop.ExperimentalForeignApi

@OptIn(ExperimentalForeignApi::class)
actual fun helloWorld(): String {
    return HelloWorld.helloWorld()
}