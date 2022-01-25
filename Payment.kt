package com.example.test

class Payment(var cart: Cart) {
    var totalPrice = cart.calTotalPrice()
    var money: Int = 0
    var rest: Int = 0

    fun cash() {
        println("\n총합 급액 : $totalPrice")

        while (true) {
            println("\n얼마를 넣으시겠습니까")
            print("? ")
            money += readLine()!!.toInt()

            if (money < totalPrice) {
                print("\n금액이 부족합니다.")
            }
            else {
                rest = money - totalPrice
                print("\n결제 완료")
                break
            }
        }

        printReceipt("cash")
    }

    fun card() {
        println("\n총합 급액 : $totalPrice")
        println("IC카드 인식 중 입니다.")
        println("\n결제 완료")

        printReceipt("card")
    }

    fun printReceipt(method: String) {
        println("\n====== 영수증 ======")
        println("\n* 주문 내역")
        cart.printCart()

        println("\n* 주문 정보")
        cart.printCartInfo()

        println("\n* 결제 내용")
        if (method == "cash") {
            println("현금 결제")
            println("투입 금액 : $money")
            println("결제 금액 : $totalPrice")
            println("반환 금액 : $rest")
        }
        else if (method == "card") {
            println("카드 결제")
            println("결제 금액 : $totalPrice")
        }
    }
}