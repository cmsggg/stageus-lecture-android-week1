package com.example.test

class Kiosk {
    var menuList: MenuList = MenuList()
    var cart: Cart = Cart()
    lateinit var payment: Payment
    var isFinish: Boolean = false

    fun start() {

        println("안녕하세요. 우리들의 카페 입니다.")

        var passageSelect = -1
        while (passageSelect != 0) {   // 기능 선택 무한 반복

            println("\n1. 메뉴 담기 2. 장바구니 보기 3. 결제하기 0. 키오스크 종료")
            print("? ")
            passageSelect = readLine()!!.toInt()

            when (passageSelect) {
                1 -> addCart()
                2 -> showCart()
                3 -> pay()
            }

            if (isFinish) {   // 결제까지 끝났으면 프로그램 종료
                print("\n이용해주셔서 감사합니다.")
                break
            }
        }
    }

    fun addCart() {

        println("\n[ 메뉴 담기 ] 페이지 입니다.")

        var typeSelect = -1
        while (typeSelect != 0) {   // 카테고리 선택 무한 반복

            println("\n아래 보기에서 카테고리를 골라주세요.")
            menuList.printType()
            print("? ")
            typeSelect = readLine()!!.toInt()

            if (typeSelect != 0) {

                var menuSelect = -1
                while (menuSelect != 0) {   // 메뉴 담기 무한 반복

                    println("\n아래 보기에서 메뉴를 골라주세요.")
                    menuList.printMenuList(typeSelect - 1)
                    print("? ")
                    menuSelect = readLine()!!.toInt()

                    if (menuSelect != 0) {
                        cart.addMenu(menuList.getMenu(typeSelect - 1, menuSelect - 1))
                        menuList.getMenu(typeSelect - 1, menuSelect - 1).printMenu("result")
                        println(" 추가 완료")
                    }
                }
            }
        }
    }

    fun showCart() {
        println("\n[ 장바구니 보기 ] 페이지 입니다.")

        var passageSelect = -1
        while (passageSelect != 0) {   // 기능 선택 무한 반복

            println("\n1. 장바구니 출력 2. 메뉴 삭제 0. 뒤로 가기")
            print("? ")
            passageSelect = readLine()!!.toInt()

            if (passageSelect == 1) {
                cart.printCart()
                cart.printCartInfo()
            }
            else if (passageSelect == 2) {
                cart.delMenu()
            }
        }
    }

    fun pay() {
        payment = Payment(cart)
        print("\n[ 결제 ] 페이지 입니다.")

        print("\n1. 현금 결제 2. 카드 결제 0. 뒤로 가기")
        print("? ")
        val passageSelect = readLine()!!.toInt()

        if (passageSelect == 1) {
            payment.cash()
            isFinish = true
        }
        else if (passageSelect == 2) {
            payment.card()
            isFinish = true
        }
    }
}

fun main() {
    val k = Kiosk()
    k.start()
}