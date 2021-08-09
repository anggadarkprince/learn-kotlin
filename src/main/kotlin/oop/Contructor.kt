package oop

import oop.data.Address
import oop.data.Car
import oop.data.User

fun main() {
    // constructor and execute initializer constructor (primary constructor)
    val carExpander = Car("Mitsubishi", "Expander", 2020)
    // constructor and execute initializer constructor (secondary constructor)
    val carFortuner = Car("Toyota", "Fortuner")
    val carMobilio = Car("Honda")
    carFortuner.year = 2021
    println(carMobilio.brand)

    // secondary constructor
    val address1 = Address("Avenue 34", "Surabaya")
    val address2 = Address("Avenue 34", "Surabaya", "Indonesia")
    println(address1.street + " " + address1.city + " " + address1.country)
    println(address2.street + " " + address2.city + " " + address2.country)

    // properties constructor
    val user1 = User("user1", "secret")
    val user2 = User("user2", "secret")
    println(user1.username + " " + user1.password)
}