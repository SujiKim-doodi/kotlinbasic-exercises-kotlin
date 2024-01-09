package udemy.android12.kotlinbasics

import kotlin.math.floor

fun main() {
    // listOf
    // 문자열 리스트 생성 키워드
    // 이지만 Any를 사용하여 객체가 어떤 종류든지 받아들일 수 있음.
    val stringList: List<String> = listOf(
        "Denis", "Frank", "Michael", "Garry"
    )
    val mixedTypeList: List<Any> = listOf(
        "Denis", 31, 5, "BDay", 70.5, "weighs", "kg"
    )

    for (value in mixedTypeList) {
        if (value is Int) {
            println("Integer: $value")
        } else if (value is Double) {
            println("Double: $value with Floor value ${floor(value)}")
        } else if (value is String) {
            println("String: $value of length ${value.length}")
        } else {
            println("Unknown Type")
        }
    }

    // 대안 (위 if-else if-else 문 대신)
    // Kotlin은 if문보다 when문을 더 좋아해
    for (value in mixedTypeList) {
        when (value) {
            is Int -> println("Integer: $value")
            is Double -> println("Double: $value with Floor value ${floor(value)}")
            is String -> println("String : $value of length ${value.length}")
            else -> println("Unknown Type")
        }
    }

    // Smart Cast 스마트 캐스트
    // 정의 : Kotlin이 is 연산자로 타입 검사 -> 검사결과에 따라 해당 타입으로 자동 변환 = 스마트 캐스트됨.
    val obj1: Any = "I have a dream"
    if (obj1 !is String) {
        println("Not a String")
    } else {
        // obj1은 여기서 자동으로 'String' 타입으로 스마트 캐스트됨.
        println("Found a String of length ${obj1.length}")

    }

    // Explicit (unsafe) Cast 명시적 캐스트
    // 정의 : 개발자가 as 연산자로 타입 직접 변환
    // 전제조건 : as 연산자로 타입 변환시, 실제 객체 타입이 변환하려는 타입과 호환되어야 함.
    val str1 : String = obj1 as String
    println(str1.length)


    val obj2: Any = 1234
    // -> 모든 객체의 최상위 타입인 Any타입으로 선언되었지만 객체 실제 타입은 Int

//    val str2: String = obj2 as String
//    // => Int를 String으로 캐스트 시도하니 컴파일러에서 이를 허용 x 오류 발생
//    println(str2)

    // :( Unsafe한 명시적 캐스트
    // 1) ClassCastException 오류 - 변수 선언 타입과 캐스트 타입 충돌
    // 2) NullPointerException 오류 - 변수에 할당된 값이 null일때

    // Explixit (safe) Cast 명시적 캐스트
    // 정의 : 개발자가 as? 연산자로 타입 직접 변환
    val obj3: Any = 5678
    val str3: String? = obj3 as? String
    println(str3) // prints null
}