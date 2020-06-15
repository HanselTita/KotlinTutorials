package com.softhans.kotlintutorials

fun main() {

    /** What is a Variable? --> A variable is like a bucket.
     *
     * How to write a variable in kotlin? --> Start with the variable type, then a name for the variable and finally a value.
      */

    //Example of a variable
      var name = "Hansel"

    //The bucket here is "var", we gave it a lable or name "name". Then we put into the puckets the value "Hansel"

    var isAwesome = true

    println("is " + name + " awesome? The answer is " + isAwesome)

    /**
     * When we declare a variable as "var" it means we can change its value.
     * When we declare a variable as "val" it means we cannot change its value once we declare it.
     */

    val dateOfBirth = 1983

    //Although kotlin from your values can determine the type of variable, you can still specify the type.
    //Example:

    var myName : String = "Hansel"
     myName = " Sorry not hansel."
    var age : Int = 37
    var height : Double = 37.4

    println("My name is Hansel. " + myName + " I am " + age + "years old" )
    //YOu can equally set a variable without giving it a value
    var race : String
    race = "black"  // Then set the value later. In this case Kotlin will suggest you combine it as one statement


}




