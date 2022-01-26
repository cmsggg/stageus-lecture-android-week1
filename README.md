## Project Description

개발 언어 : Kotlin
과정 : [심화 과정] 안드로이드앱 과정  
주차 : 1주차  
과제 : 카페의 Kiosk 소프트웨어 개발  
조건 : 기초 과정인 Python으로 구현했던 내용을 Kotlin으로 변경하여, Kotlin과 Class Diragram에 대해 복습하는 과제  

## Difference between Python and Kotlin

1. Python 때 했던 설계와 비교하여, Type Checker 기능 및 Narrowing 기능을 적용하여 변경.
2. Python에서 None의 부분에 대하여, Kotlin은 기본적으로 Null값을 허용하지 않으므로 0 혹은 ""로 초기화 하거나, 불가능 한 부분에 대해서는 lateinit을 사용할 수 있음.
3. Switch명령어를 사용할 수 없는 python에서 if-elif로 처리했던 복잡한 로직을 when으로 변경할 수 있음.
4. Kotlin에선, Class로 받아온 매개변수를 따로 멤버변수로 선언해주지 않아도 사용할 수 있으므로 생성자 함수의 역할이 줄어들 수 있음.
5. list만 존재했던 Python과 다르게 Kotlin은 배열과 관련하여 Array, ArrayList 등으로 나눠지고 추가적으로 여러 함수가 존재하므로 확인해봐야 함.
6. 함수, class, for문 등의 문법이 상이하므로 변경하여 적용해야 함.

## Reference

## Class Diagram

<p align="center"><img src="cd.png" width="617" height="540"></p>
