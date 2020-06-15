package com.softhans.kotlintutorials

fun main() {


    var a = 2
    var b = 2
    var c = 3

    if (a == b) {
        println("\'a\' infact equals \'b\'")
    }

    if(a == c){
        println("\'a\' infact equals \'c\'")
    }else
    {
        println("\'a\' is not equal to \'c\'")
    }

    if (b != c) {
        println("And \'b\' is not equals \'c\'")
    }

    var accountBalance = 100
    val price1 = 50
    val price2 = 120

    if (accountBalance >= price1){
        println("Definitely you can buy this!!")
    }

    if (accountBalance >= price2){
        println("Definitely you can buy this!!")
    }else
    {
        println("You do not have enough balance in your account")
    }

    val degree = 70

    if (degree == 60){
        println("Nice wheather today")
    } else if (degree <60 && degree >50)
    {
        println("It's gonna be cold today")
    } else
    {
        println("No idea of the weathercast today")
    }

    var happy = true
    var sad = false

    if (happy == true || sad == true){
        println("Let's go for a walk")
    }

    var smile =false
    var frown = false
    if(smile || frown){
        println("what's the matter")
        //  if(smile || frown) is the same as if(smile == true || frown == true)
    }else
    {
        println("How are you doing?")
    }

    if (!smile || !frown){
        println("oh boy...")
        // if (!smile || !frown) is same as if (smile == false || frown == false)
    }

    //*****************

    var x = 8

    when (x) {
        1 -> println("x is 1")  // This is checking for the value of x and giving out this result if it it 1
        2 -> println("x is 2")
        3 -> println("x is 3")
        4 -> println("x is 4")
        5 -> println("x is 5")
        else -> println("x cannot be found")
    }
}