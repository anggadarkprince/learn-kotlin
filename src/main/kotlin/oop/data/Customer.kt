package oop.data

open class Customer(var name: String, val type: String, val balance: Long) {
    operator fun component1(): Any {
        return name
    }
    operator fun component2(): Any {
        return type
    }
    operator fun component3(): Any {
        return balance
    }

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