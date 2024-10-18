package id.dreamfighter.multiplatform.utils

@JsModule("currency-formatter")
@JsName("default")
external fun sayHello1(value:String)

fun options(): JsAny = js("({ code: 'IDR'})")

actual fun Double.toCurrency(code: String): String {
    //sayHello1("name: String")

    //println(defaultCurrency())
    return "format(this, options())"
}