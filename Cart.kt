package com.example.test

class Cart {
    var cartList = ArrayList<Menu>()

    fun addMenu(menu: Menu) {
        cartList.add(menu)
    }

    fun delMenu() {
        printCart()
        println("0. 뒤로가기")
        print("? ")
        val delSelect = readLine()!!.toInt()
        cartList.removeAt(delSelect-1)
    }

    fun printCart() {
        for (index in 0 until cartList.size) {
            print("${index + 1}. ")
            cartList[index].printMenu("result")
            print("")
        }
    }

    fun printCartInfo() {
        println("총 개수 : ${calTotalNumber()}")
        println("총합 가격 : ${calTotalPrice()}")
    }

    fun calTotalNumber(): Int {
        return cartList.size
    }

    fun calTotalPrice(): Int {
        var totalPrice: Int = 0

        for (index in 0 until cartList.size) {
            totalPrice += cartList[index].price
        }

        return totalPrice
    }
}