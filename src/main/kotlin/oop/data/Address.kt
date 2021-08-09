package oop.data

class Address {
    // cannot access paramStreet because no primary constructor
    //var street: String = paramStreet
    var street: String = ""
    var city: String = ""
    var country: String = ""

    // secondary constructor without primary
    constructor(paramStreet: String, paramCity: String) {
        street = paramStreet
        city = paramStreet
    }
    constructor(paramStreet: String, paramCity: String, paramCountry: String) : this(paramStreet, paramCity) {
        country = paramCountry
    }
}