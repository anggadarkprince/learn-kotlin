package oop.data

open class Customer(val name: String, val type: String, val balance: Long) {
    constructor(name: String, type: String): this(name, type, 0)
    constructor(name: String): this(name, "Standard")
}

// no primary constructor
class PremiumCustomer: Customer {
    constructor(name: String): super(name, "Premium")
    constructor(name: String, balance: Long): super(name, "Premium", balance)
}

/*
// error extend because the ExecutiveCustomer has constructor then the parent must initialize the constructor as well
class ExecutiveCustomer(name: String): Customer {
    // error because should call primary constructor
    constructor(name: String, balance: Long): super(name, "Executive", balance)
}*/