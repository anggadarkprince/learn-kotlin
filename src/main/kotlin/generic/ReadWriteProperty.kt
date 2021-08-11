package generic

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

// interface delegate read and write property (var)
class StringLogReadOnlyProperty(var data: String) : ReadWriteProperty<Any, String> {
    override fun getValue(thisRef: Any, property: KProperty<*>): String {
        println("Get property ${property.name} with value $data")
        return data
    }

    override fun setValue(thisRef: Any, property: KProperty<*>, value: String) {
        println("Set property ${property.name} from value $data to $value")
    }
}

class Person(param: String) {
    var name: String by StringLogReadOnlyProperty(param)
}

fun main() {
    val person = Person("angga")
    println(person.name)
    person.name = "Ari"
    println(person.name)
}