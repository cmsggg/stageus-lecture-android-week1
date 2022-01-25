package com.example.test

class MenuList {
    var menuInfoList: Array<Array<Array<String>>> = arrayOf(
        arrayOf(
            arrayOf("커피", "아메리카노", "3200", "100"),
            arrayOf("커피", "카페 라떼", "3700", "100"),
            arrayOf("커피", "카푸치노", "3700", "100"),
            arrayOf("커피", "카페 모카", "3900", "100"),
            arrayOf("커피", "카라멜 마끼아또", "3900", "100"),
            arrayOf("커피", "바닐라 라떼", "3900", "100"),
            arrayOf("커피", "화이트 초콜릿 모카", "3900", "100")
        ),
        arrayOf(
            arrayOf("음료", "에이드", "3800", "100"),
            arrayOf("음료", "과일 주스", "4200", "100"),
            arrayOf("음료", "쉐이크", "4300", "100"),
            arrayOf("음료", "과일차", "3800", "100"),
            arrayOf("음료", "아이스티", "2500", "100"),
            arrayOf("음료", "녹차 & 홍차", "2800", "100"),
            arrayOf("음료", "캐모마일", "3000", "100"),
            arrayOf("음료", "페퍼민트티", "3000", "100"),
            arrayOf("음료", "밀크티", "3800", "100")
        )
    )
    var menuList: ArrayList<ArrayList<Menu>> = ArrayList<ArrayList<Menu>>()

    init {
        for (category in menuInfoList) {
            val tmpList = ArrayList<Menu>()
            for (item in category) {
                val tmpMenu = Menu(item[0],item[1],item[2].toInt(),item[3].toInt())
                tmpList.add(tmpMenu)
            }
            menuList.add(tmpList)
        }
    }

    fun printType() {
        for (index in 0 until menuList.size) {
            print("${index + 1}. ")
            getMenu(index, 0).printMenu("type")
        }
        println("0. 뒤로가기")
    }

    fun printMenuList(typeIndex: Int) {
        for (index in 0 until menuList[typeIndex].size) {
            print("${index+1}. ")
            getMenu(typeIndex, index).printMenu("menu")
        }
        println("0. 뒤로가기")
    }

    fun getMenu(typeIndex: Int, menuIndex: Int): Menu {
        return menuList[typeIndex][menuIndex]
    }
}