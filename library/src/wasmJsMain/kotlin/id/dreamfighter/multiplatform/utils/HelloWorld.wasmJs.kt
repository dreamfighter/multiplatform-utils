
package id.dreamfighter.multiplatform.utils
@JsModule("../js/fibiprops.wasmJs.kt")
external fun sayHello(name: String)
external fun greet(name: String):String

actual fun helloWorld(): String {
    return greet("Dreamfighter")
}