package com.softhans.kotlintutorials

/** Inheritance is when we make it possible for a class to inherit the properties of another
 * class. That way avoiding to retype same codes for the different classes.
 * Vehicle will be our parent class from which we will make child class car and truck inherit from. Such class
 * must be declared open. And the child class must declare the primary constructors of the parent class
 * we can additional constructor value to child class but it must inherit all of parent class
 * We use a colon ":" to implement inheritance
 */
        open class Vehicle(val make: String, val model: String){

    //We can open a function in the parent class, so that we can override that function in a child class
    //Override means ignoring the parent class value and personalizing a value for that child class
    open fun accelerate(){
        println("Vroom, vroom, vroom")
    }

    fun parking(){
        println("Parking vehicle")
    }
    fun brake(){
        println("Stop!!!")
    }
        }

    //child class Car inheriting from parent class Vehicle. Car has an extra constructor for color
    // This class has no specific functions so we do not add the open and close braces "{}"
    class Car(make: String,  model: String, color: String) : Vehicle(make, model)


    //Child class TRuck
class  Truck(make: String, model: String, towingCapacity: Int) : Vehicle(make, model)
    {
        fun tow(){
            println("Easy going...")
        }

        //Let's override the accelerate() properties of Vehicle in this Truck class
        override fun accelerate() {
            println("Broom!! Broom!!")
        }
    }
fun main() {

    val makeCar = Car("Toyota", "Camry", "White")
    makeCar.accelerate()
    makeCar.parking()
    makeCar.brake()

    val makeTruck = Truck("Ford", "T-150", 10000)
    makeTruck.accelerate()
    makeTruck.brake()
    makeTruck.tow()



}