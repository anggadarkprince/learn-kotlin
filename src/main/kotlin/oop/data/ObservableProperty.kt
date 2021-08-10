package oop.data

import kotlin.properties.Delegates

class ObservableProperty(name: String) {
    var name: String by Delegates.observable(name) {
        property, oldValue, newValue ->
            println("$property changed from $oldValue to $newValue")
    }
}