package com.example.helloworld

fun main() {
    val n: Int = readlnOrNull()?.toInt() ?:0
    for (i in n..2 * n - 1) {
        var line = ""
        for (j in 1..i) {
            line += when(j) {
                in 1..2 * n - i - 1 -> " "
                in 2 * n - i..n -> (j - (2 * n - i  - 1)) % 10
                else -> (i - j + 1) % 10
            }
        }
        println(line)
    }
}
