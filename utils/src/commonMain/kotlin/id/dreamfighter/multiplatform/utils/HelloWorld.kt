package id.dreamfighter.multiplatform.utils

expect fun helloWorld(): String

fun printHelloWorld():String {
    return helloWorld()
}