import android.telecom.Call

/**
     * Class is like a blueprint. A blueprint talks about the properties, characteristics of something
     * But does nothing. It needs to be constructed or built
     */

    //Example
    class Car constructor(make: String, model: String) {

        /**
         * A constructor is what we call when we are ready to create an instance of our class
         * An instance is a specific representation of an object.
         */

        val make = make
        val model = model

        /**
         *  In this case our class(blueprint) is Car. and in order to construct it we must include
         *  the kind of car to make and the model.
         *  Kotlin takes care of getters and setters.
         *  A simpler way to write the same class is as follows:
         *
         *  class Car(val make: String, val model: String) {}
         * To instantiate the class, you need to use that in a function or main function
          */


    }

    // **** A class is usually in a separate file

    fun main() {

        val car= Car ("Toyota","Alvalon")

        //From second class
        val truck = Truck("Ford", "T-150", 10000, "Red")
        truck.tow()
        truck.details()
    }

//second class
    class Truck(val make: String, val model: String, val towingCapacity: Int, val color: String){
    fun tow(){
        println("Easy to lift")
    }

    fun details(){
        println("This $make truck is a $model model and it has a $color colour. With a towing capacity of $towingCapacity lbs")
    }
}