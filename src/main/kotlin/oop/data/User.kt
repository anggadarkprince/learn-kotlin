package oop.data

// properties constructor (only primary), name of properties same as constructor parameter
/**
 * class User(username: String, password: String, passwordHint: String) {
 *    var username = username
 *    var password = password
 *    private var passwordHint = passwordHint
 * }
 */
class User(var username: String, var password: String, private var passwordHint: String = "secret")