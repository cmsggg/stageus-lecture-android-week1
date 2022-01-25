package com.example.test

class Menu(var type: String, var name: String, var price: Int, var stock: Int) {

    fun setStock(number: Int): Boolean {

        if (stock < number) {
            stock += number
            return true
        }
        else {
            return false
        }
    }

    fun printMenu(format: String) {

        when (format) {
            "type" -> println(type)
            "menu" -> {
                print("%-20s".format(name))
                println("%-6d".format(price))
            }
            "result" -> println("%s %d".format(name, price))
            "all" -> {
                print("%-6s".format(type))
                print("%-20s".format(name))
                print("%-6d".format(price))
                println("%-5d".format(stock))
            }
        }
    }
}