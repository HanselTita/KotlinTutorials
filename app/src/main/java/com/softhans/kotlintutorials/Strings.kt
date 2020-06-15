package com.softhans.kotlintutorials

fun main() {

    // Escape string or characters are strings that can be written in a string...
    // Examples of escape strings are quotation marks =>  \"Are you serious?"\
    var str = "He  asked: \"Are you serious?\""
    println(str)

    // the paragraph => \n
    str = "He asked: \n\"Are you serious?\" "
    println(str)

    // the indent space => \t
    str = "\t He asked: \n\"Are you serious?\""
    println(str)

    // backspace => \b
    // delete all to the left => \r

    // A raw string uses 3 pair of quotation marks

    var startAllOver = """ |Like I was saying, 
        |my name is Hansel
        |I am studying Kotlin
    """.trimMargin()
    // .trimMargin() automatically trims off all uneccesary indent space,
    // indicating the beginning with a pipe => | (most of the time this is automatic)
    println(startAllOver)

    //To print each character from a string
    for (char in str) {
        println(char)
    }

    //Code to compare or a particular string
    str = "Who is this?"

    val contentEquals = str.contentEquals("Who is this?")
println(contentEquals)

    //To check or compare a particular word in a string
    val contains = str.contains("Who", true)
    println(contains)

    //To write string all in upper case
    val upperCase = str.toUpperCase()

    //To write all in lower case
    val lowerCase = str.toLowerCase()

    println(upperCase)
    println(lowerCase)

    //To write string segments without using " + "

    val myName = "Hansel"
    val car = "Camry"
    val color = "grey"

    //old fashion way
    println(myName + " has a " + color + " old " + car)

    //kotlin way
    println("$myName has a $color old $car")
}