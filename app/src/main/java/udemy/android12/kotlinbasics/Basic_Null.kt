package udemy.android12.kotlinbasics

fun main(){
    // NullPointerException problem
    // 원인 : Null 참조에 대한 접근, 함수 호출시 인자로 null 전달
    // Kotlin 해결방식 :
    // nullable형식 (e.x. nullable string), 안전한 호출 연산자(?.), 엘비스 연산자, 연산non-null 단언(!!.)

    // null
    // 앱 개발에서 쓰는 이유 : 사용자가 입력하는 값에 대한 불확실성 때문 (누락, 유효하지 않음, 미선택 등)

    // 일반적인 문자열(non-nullable string)
    // var name : String = "Amy"
    // name = "Sarah" // name = null 하면 Compilation ERROR (변수 name은 null타입의 String이 아니기 떄문에)
    // println(name.uppercase())

    // var len1 = name.length
    // println(len1) // 5

    /**/
    //Kotlin : 변수나 속성이 null을 값으로 가질 수 있는지 여부를 타입 시스템을 통해 지원

    // 방식 1. nullable형식 - null이 가능한 문자열(nullable string)
    // 형식 : typename ? -> ?표시는 nullable 연산자.변수나 속성에 null 값 허용
    // => null 안전성 강화 &NullPointerException 방지 도움
    var nullableName : String? = "Amy" // Amy 대신 바로 null 써줘도 된다.
    // nullableName = null // 일반 문자열과 다르게 이렇게 쓸 수 있다.
    //  println(nullableName?.lowercase()) -> null일때는 Error

    // 방식 2. null 안전 호출 연산자 (?.)
    // 해당 변수 또는 속성이 null이면 null을 반환. 그렇지 않으면 호출한 값을 반환
    var len2 = nullableName?.length // c.f.nullableName = null이 없어도 ?.해주어야 함
    println(len2) // null // nullableName = null이 없으면 3으로 출력.

    // let : 연산 정의 함수.
    // let 역할 : 객체가 null이 아닐 때만 특정 동작을 수행 <=> let 블록 실행되었으면 null 아님
    // 여기서 it은 nullableName의 매개변수
    // nullableName?.let { println(it.length) } // -> null 이면 null을, null이 아니면 let {} 블록 실행


    // 방식 3. 엘비스 연산자(Elvis operator) (?:)
    // 역할 : 할당하는 변수(여기서는 nullableName)의 값을 정해줌
    val AssignmentName = nullableName ?: "Guest" // -> nullableName이 null이면 디폴트 값인 Guest를 넣어달라
    println("Her name is $AssignmentName.") // null x -> Amy

    // 엘비스 연산자 심화.
    // val wivesAge: String? = user?.wife?.age ?: 0
    // ->  user, user.wife, user.wife.age 중 어느 하나라도 null이면 wivesAge는 "0".
    // 만약 모두 null이 아니라면, user.wife.age의 문자열 표현을 wivesAge에 할당.

    // 방식 4. non-null단언(!!.)
    // 역할 : nullable 타입 -> non-null 타입 변경. 만약 nullable 타입이 null 값 -> nullpointerexception 발생
    // 주의 : 변수에 값이 있음을 확신할 때만 사용
    println(nullableName!!.lowercase()) // null x -> amy


}
