package com.softhans.kotlintutorials

fun main() {

    /*
     *In Kotlin, function is a group of related statements that perform a specific task.
     * It is a collection of statements that are grouped together to perform an operation.
     * function is used to break the code into smaller modules which makes the program more manageable.
     */

    //We must call a function after writing it for it to execute
    fun studyKotlin() {
        println("I can understand kotlin better...")
    }
    studyKotlin()

    //Passing an argument "line" of type "String" in a function.
    fun makeEntrance(line: String){
        println(line)
    }
    makeEntrance("All rise...")

    //Some functions need to return some results, indicated by a column and the variable type => ": Int"
    //Then "return" at the end
    fun numGoodGuys(rebel: Int, ewok: Int) : Int {
        val goodGuys = rebel + ewok
        return goodGuys
    }

    val rebel = numGoodGuys(5, 3)

    println(rebel)
    println(numGoodGuys(5,3))


    //**************************

    fun weatherCast (){
        var high = true
        var low = false
       if(high){
           println("The weather is hot")
       }
        }
    weatherCast()





}