package com.example.kotlinpractice

fun main() {
    ignoreNulls(null)
}

//4. 조건식

fun maxBy(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

fun maxBy2(a: Int, b: Int) = if (a > b) a else b

fun checkNum(score: Int) {
    when (score) {
        0, 1 -> println("0")
    }
    var b = when (score) {
        1 -> 1
        else -> 1
    }
}

fun array() {
    val array = arrayOf(1, 2, 3)
    val list = listOf(1, 2, 3)
    val arrlist = arrayListOf<Int>()
    array[0] = 3
    arrlist.add(10)
    arrlist.add(10)

}

fun forAndWhile() {
    val students = arrayListOf("jai", "sata", "data", "jucie")
    for (name in students) {
        println(name)
    }
    for ((index, name) in students.withIndex()) {
        println("${index + 1} ${name}")
    }
    var sum = 0
    for (i in 1..10) {
        sum += i
    }
    var index = 0
    while (index < 10) {
        println("current index: ${index}")
        index++
    }
}

fun nullcheck() {
    var name = "joyce"

    var nullName: String? = null
    var nullNameInUpperCase = nullName?.uppercase()
    println(nullNameInUpperCase)
    var fullName = name+" "+(nullName?: "No lastname")
}

fun ignoreNulls(str : String?){
    val email : String? = str
    email?.let{
    println(email)
    }
}