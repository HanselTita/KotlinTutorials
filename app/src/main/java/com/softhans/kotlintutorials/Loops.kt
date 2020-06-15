package com.softhans.kotlintutorials

fun main() {
    val family = arrayListOf("Father", "Mother", "Sons", "Daughters")
    val myContactsMap = hashMapOf("Father" to "0101010", "Mother" to "0202020", "Wife" to "0303030")

    //Loop for Array List
    for (member in family){  //This reads for as far as "member" is a member/an element in family...print name of "member"
        println("name: $member")
    }

    //Loop for Hash Map
    for((key, value) in myContactsMap){  // can equally be written as -> for(name, contact) in myContactMap
        println("$key has contact number as $value")
    }

    //The while Loop
    var x =10
    while (x > 0) { // This reads, starting from 10 as while or long as x is > 0 ...
        println(x)  // print x and ...
        x--         // minus 1 from the x and redo loop with new x value.... * Else it will keep printing to infinity
    }

    var y = 0
    while (y <= 10) {
    println(y)
        y ++
        //reads...starting from 0, while y < or = 10 print y and add 1 and do the loop all over with new y value
    }
}