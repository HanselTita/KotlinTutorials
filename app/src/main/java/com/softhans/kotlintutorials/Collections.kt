package com.softhans.kotlintutorials

import android.os.Build
import androidx.annotation.RequiresApi

@RequiresApi(Build.VERSION_CODES.N)
fun main(args: Array<String>) {

    /**
     * The following kind of arrays are immutable, meaning they cannot be changed
     */
    val brothers = listOf("Hansel", "Claude", "Edwin")
    println(brothers)

    //list alphabetically
    println(brothers.sorted())

    //list specific index
    println(brothers[2])

    //check a particular item in list -> true or false
    println(brothers.contains("Luke"))

    //check last item in list
    println(brothers.last())

    //check the size or numbers of item
    println(brothers.size)

    /**
     * This other type of arrays are the mutable, meaning they can be changed
     */

    val family = arrayListOf("Father", "Mother", "Sons", "Daughters")

    family.add("Grand Sons")
    println(family)

    //adding an element to a particular index
    family.add(3, "Grand Daughters")
    println(family)

    //getting the index of a particular element
    println(family.indexOf("Sons"))

    //removing an element from the list
    family.remove("Grand Daughters")
    println(family)

    //removing an element in a particular index
    family.removeAt(4)
    println(family)


    //*************************
    /**
     * Immutable Maps
     */

    val contactMap = mapOf("Father" to "0123456", "Mother" to "0654321", "Wife" to "0808080")
    println(contactMap)

    //getting the value attached to a specific element
    println(contactMap["Father"])

    //should in case you don't find the value you are looking for
    println(contactMap.getOrDefault("Husband", "This contact does not exist"))

    /**
     * Mutable versions of Maps
     */

    val myContactsMap = hashMapOf("Father" to "0101010", "Mother" to "0202020", "Wife" to "0303030")
    println("Your contacts are  $myContactsMap")

    //Changing the value of a key
    myContactsMap["Wife"] = "0404040"
    println(myContactsMap)

    //adding a new key and its value
    myContactsMap["Brother"] = "05050505"
    println(myContactsMap)

    //To remove a key and its value
    myContactsMap.remove("Brother")
    println(myContactsMap)

    //to clear everything in the entry
    myContactsMap.clear()
    println(myContactsMap)
}