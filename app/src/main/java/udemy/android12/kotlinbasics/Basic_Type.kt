package udemy.android12.kotlinbasics

fun main(){
    // immutable variable

    // ctrl + / : 코틀린 주석 만들기 comment.
    // 컴파일러가 무시하는 부분 -> 코드가 뭘 하는지에 대해 다른 개발자의 이해도 도와
    /*
    다중 주석 만들기 multiple line comment
     */


    // type string
    val myName = "D00DI"
    // type int 32 bit
    var myAge = 1024

    // Integer Types : Byte (8 bit), Short (16 bit),
    // Int (32 bit), Long (54 bit)
    val myByte: Byte = 13
    val myShort: Short = 125
    val myInt: Int = 123123123
    val myLong: Long = 39_812_309_487_120_300 // 타입명시
    val myLong1 = 39_812_309_487_120_300 // 타입추론

    // 타입명시(Type Annotation) : 변수명뒤에 [: 타입명] 적는 것. 대문자시작. but 코틀린은 타입추론 가능
    // 타입추론(Type Inference) : 컴파일러가 코드 분석 -> 변수 또는 표현식 타입 추론

    // Floating Point number Types(부동소수점타입) : Float (32 bit), Double (64 bit)
    // 실수는 기본적으로 Double 타입으로 인식 -> f를 써서 Float 타입으로 명시적 표시
    val myFloat: Float = 13.45f // 대소문자 모두 허용 but 주로 소문자 f 쓰는 것이 관례
    val myDouble: Double = 3.2342351453453

    // Booleans he type Boolean is used to represent logical values.
    // It can have two possible values 'true' and 'false'.
    var isSunny: Boolean = true // 타입명시
    isSunny = false

    // Char[캐릭터] : 문자를 나타내는 데이터타입.('') ->여러개 모이면 String
    val letterChar = 'A'
    // val letterChar = 'AB' 오류
    val numberChar = '1'
    val symbolChar = '.'

    // String : 문자열을 나타내는 데이터타입. ("")
    val myStr = "Hello World"
    val firstCharInStr = myStr[0] // 0은 제일 첫번째 문자 의미 -> H
    val lastCharInStr = myStr[myStr.length-1] // 11(공백포함) - 1 -> d


    // 문자열 연결 (String Concatenation)-> print("문자열" + 변수명) [연결]
    // print("First Character is" + firstCharInStr)

    // 문자열 템플릿(String Template = String Interpolation) -> print("문장 $변수명 문장") [써넣음]
    // print("Last Character is $lastCharInStr.")
    // 역할 달러 기호($)는 Kotlin에서 문자열 내에서 변수 값을 삽입할 위치를 나타냅니다.

    // Q> 만약 변수안에 문장부호(.)가 들어간다면요..? e.x. myStr.Length
    // A> 복잡한 변수명,식,함수,프로퍼티 들은 중괄호 (Curly Bracket)으로 묶어주면 된다.
    //     print ("The length of my Str is ${myStr.length}.")




 }







