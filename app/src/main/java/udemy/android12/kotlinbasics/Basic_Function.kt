package udemy.android12.kotlinbasics

// fun : stands for function
// main : 프로그램의 시작점. 안에 코드가 없으면 어떠한 결과도 없다.
fun main(){
    // argument 인수 : 함수에 값을 전달하는 부분. 여기서는 1과 2.
    myFunction()
    // var result = addUp(1,2) // 3
    var result = avg(2.toDouble(),3.toDouble())
    print("result is $result.")
}

// Function
// 형식 : fun키워드 + 함수이름 + 괄호( // 모든 매개변수) + 중괄호{ // 실행할 코드 The body of function}
// 이점 : 코드 재사용, 다른 사람과도 작업 가능


// Method - a Method is a Function within a class 클래스 안의 함수 ≠ 그냥 함수
// 객체지향 프로그래밍이 아니면 그냥 다 Function -> 객체지향 프로그래밍에서는 대체로 클래스 안에 생성된 method
// Parameter 매개변수 = input 입력값. 여기서는 a와 b
fun addUp(a:Int, b:Int) : Int{
    // output
    return a+b // return문이 실행되면 함수종료.
}

fun myFunction(){
        print("Called from myFunction")
}

fun avg(a : Double, b:Double) : Double{
    return (a+b)/2
}

// null
// 정의 : 변수가 null을 값으로 가질 수 있게 해주는 거. 0은 아니다.
