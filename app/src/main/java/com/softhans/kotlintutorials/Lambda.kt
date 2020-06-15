package com.softhans.kotlintutorials

fun main() {

    //Example of Lambda. in braces, the left side is the variable type, the right side what it should return
    val printMessage = {message: String -> println(message)}

    //This is same as writing
    fun printMessage(message: String){
        println(message)
    }

    //Another Example
    val sumA = {x: Int, y:Int -> x + y}
    println(sumA(3, 5))

    fun downloadData (url: String, completion: ()-> Unit) {
        //send download request
        //got back data
        // no network error
        completion()
    }
    downloadData("fakeUrl.com") {
        println("Download successful only after completion()")
    }
}