package oop

import oop.data.Application
import oop.data.Application.Companion.deploy

fun main() {
    // access from class
    Application.deploy("staging")

    // access from Companion attribute
    Application.Companion.deploy("production")

    // import companion object
    deploy("staging")
}