package udemy.android12.kotlinbasics

fun main(){
    // 산술 연산자 Arithimetic operators (+, -, *, /, %)
    var result  = 5+3
    result /= 2
    result *= 3
    // print(result) // 12

    var modulo = 15%2 // Modulo Operator 나머지 값
    // print(modulo) // 1

    val a = 7
    val b = 3
    //result = a / b // 2
    //print(result)

    // 자동 형변환 (= 자동 타입변환) ; 타입이 다른 두 피연산자 계산 -> 결과값은 더 큰 데이터 타입으로
    val a1 = 7
    val b1 = 3
    result  = a1 / b1
    // resultDouble: Double or (a1 / b1).toDouble() 명시적인 형변환
    // print(result)

    /*
     val a1 = 7.0
     val b1 = 3.0
     var resultDouble = (a1 / b1).toDouble() // toDouble() 없어도 됨.
     print(resultDouble)
     */

    // result = a1 / b1 // 2.333..
    // a1 % b1 = 1.0


    // Comparison operators (==, !=, <, >, <=, >=)
    val isEqual = 7==3
    //print("isEqual is $isEqual.")

    val isNotEqual = 7!=7
    //println("is NotEqual  $isNotEqual.")

    //println("is -7 Greater than 3  ${-7>3}.")
    //println("is 3 LowerEqual than 3.1 ${3<=3.1}.")

    // 코틀린 공식 문서  Augmented assignment operators 증가 대입 연산자
    // 강의 Assignment operators 네이버 복합 대입 연산자 Compound Assignment Operators
    var myNum = 7
    myNum += 3 // myNum = myNum + 3 과 동일.
    // println("myNum is $myNum.") // 10
    myNum /= 5
    // println("myNum is $myNum.") // 2
    myNum *= 8 // 16
    myNum %= 5
    // println("myNum is $myNum.") // 1

    // Increment & Decrement operators (++, --)
    // myNum++ // ++myNum 이렇게 써도 상관 x. but 대체로 변수명++ 이렇게 쓰임
    // 차이 : '언제' 변수를 증가 or 감소시킬거니? (변수 실행 전 or 실행 후)
    // println("myNum is $myNum.") // 2
    // println("myNum is ${myNum++}.") // 변수 실행 후 증가 -> 게임 2배 당첨
    // println("myNum is ${++myNum}.") // 변수 실행 전 증가

    /* ++ 예제
    var myplusNum = 0
    ++myplusNum
    println(++myplusNum)
    println(myplusNum++)
    println(myplusNum++)
    println(++myplusNum)
    println(myplusNum++)
    println("Final myplusNum is ${++myplusNum}.")
     */

    // 현재 myNum은 3.
    // println("myNum is ${--myNum}.") // 2
}