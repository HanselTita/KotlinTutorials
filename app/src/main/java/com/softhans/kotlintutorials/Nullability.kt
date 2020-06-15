package com.softhans.kotlintutorials

fun main() {
    /**
     * To set a variable type to be nullable, meaning at certain point in time that variable can
     * be null, we add a question mark after the variable type.
     * IF this is not done, the system considers that no variable can be null after being given a value
     */

    var name : String? = "Hansel"

    //we can now use situation where name is null
    name = ""

    if (name.isNullOrEmpty()){
        println("Name is null")
    }

    //Checking length of variable incase it might be null

    name ="Hansel"
    println(name?.length)

    //in case it is null
    name = null
    println(name?.length)
}