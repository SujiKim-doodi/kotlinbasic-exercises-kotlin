package udemy.android12.kotlinbasics


// Scope 스코프 : 변수나 함수가 유효한 범위 e.x. main함수 스코프(fun main() {..}), 클래스 스코프
// ≠ Block 코드블럭 : {}로 둘러싸인 일련의 문장들. 스코프를 형성하는데 도움

// Scope는 위치에 따라 외부 스코프와 내부 스코프로 나뉜다.
// Shadowing 쉐도잉 : 내부 스코프에서 이미 존재하는 외부 스코프의 변수를 '동일한' 이름으로 다시 선언.
// => 변수는 그 함수 또는 class안에서만 보이는 것!
// ≠ Redeclaration 중복선언 : 같은 스코프내에서 변수를 '동일한' 이름으로 다시 선언. e.x. 내부-내부

// Shadowing 쉐도잉
// :) decoupling your code from other parts of the system
// ※ 내부 스코프 변수선언이 외부 스코프 변수 영향 x. 출력은 외부 스코프 변수 값으로 유지.
fun main(){
    myFunction(3)
    yourFunction(3)

}

// this x is a parameter 매개변수
fun myFunction(x:Int){
    // x is a variable
//    var x = x // 변수 = 파라미터 -> 가독성을 위해 이 문장은 지워
    println("My x is $x") // 3
}

// this x is a parameter 매개변수
fun yourFunction(x:Int){
    // x is a variable
    var x = 2 // Kotlin : 지역변수 > 매개변수 -> 가독성을 위해 이 문장은 지워
    println("Your x is $x") // 2
}