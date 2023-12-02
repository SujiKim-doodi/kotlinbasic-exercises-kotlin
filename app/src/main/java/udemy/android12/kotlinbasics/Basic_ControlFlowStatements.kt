package udemy.android12.kotlinbasics

fun main(){

    // 1. 조건문 (Conditionals) - if문, when문
    val age = -15

    // 1) if문
    //if(age >= 21) // 단순한 if문
    // println("You can everything in the US.")
    // println("You can everything in the US.") -> 얘는 if문 안에 있는다고 판단 x. 출력x.

    if(age >= 21){ // if문은 항상 첫 평가식만 본다 -> 이게 참이면 아래 볼필요x (계층)
        println("You may drink in the US.")
    }else if(age >= 18){ // first else if statement - only executed if the if statment is not true
        println("You may vote.")
    }else if(age >= 16){ // else if statement - only executed if the foregoing else if statement is not true.
        println("You may drive.")
    }else{ // else statement - only exexuted if all of the foregoing statements weren't true.
        println("You are too young.")
    }

    // 2) when문
    // switch문(c, c++, Java) 대신 쓰이는.switch 문 보다 훨씬 powerful 하고 compact 하다.
    // ->in 대신 case 라는 키워드를 쓰는데 case 구문 내에서는 in문과 달리 범위 직접 지정할 수 x.
    // Translate upper if statement to when statement
    when(age){
        !in 0..200 -> println("Pleas try again:(")
        in 21..200 -> println("You may drink in the US.")
        in 18..200 -> println("You may vote.")
        in 16..200 -> println("You may drive.")
        else -> println("You are too young.")
    }

    // Any 키워드와 is 키워드 이해
    var x : Any = 2
    when(x){
        is Int -> println("$x is an Integer.")
        is Float -> println("$x is a Float")
        is Double -> println("$x is a Double.")
        is String -> println("$x is a String.")
        //!is String ; String이 아니라면 -> ("")을 출력.
        else -> println("I guess it's Boolean")
    }





    // if문 string문
    val name = "D00"

    if(name == "D00DI"){ // False
        println("Welcome home D00DI")
    }
    else{
        println("Who are you?")
    }

    val isRainy = true
    if(isRainy)
        println("It's rainy")


    // when 문
    var season = 3
    when(season){
        // value emptyspace minus greatersign code(you want to execute)
        1 -> println("Spring")
        2 -> println("Summer")
        3 -> println("Fall/Autumn")
        4 -> println("Winter")
        else -> println ("Invalid Season")
    }


    var month = 3
    when(month){
        in 3..5 -> println("Spring")
        in 6..8 -> println("Summer")
        in 9..11 -> println("Fall/Autumn")
        in 12 downTo 1 -> println("Winter")
    }


    // 2. 반복문 (Loops) - while문, do-while문, for문

    // 1) while 문
    // : exexutes a block of code repeatedly as long as a given condition is true
    // 원리 : 조건 검사 -> 루프 실행
    // 형식 : while(조건) { // 실행할 코드}
    var n = 0 // 선언 Declaration
    while(n < 10){
        print("$n") //0123...
        n++
    }
    println("\nwhile loop is done.") // \n은 코드로 인식.


    // 2) do while 문 : 다양한 사용자 목록을 서버에서 받을 때
    // 루프 한번 실행 -> 조건 검사
    // 형식 : do{ // 실행할 코드}while(조건)
    n = 15 // 할당 Assignment
    do {
        print("$n")
        n--
    }while(n >20)
    print("\ndowhile loop is done.")


    // 3) for문 : 범위(range), 배열(array)에서 기본적으로 사용
    // 형식 : for(변수명 in 범위) { // 실행할 코드}
    // 역할 : 다양한 반복 구조 처리
    for(num in 1..10){
        print("$num")
    }

    for(i in 1 until 10){ // 10 until 1 은 empty range. // = for(i in 1.until(10))
        print("$i")
    } // 12345678910

    for(i in 10 downTo 1 step 2){ // = for(i in 10.downTo(1).step(2))
        print("$i")
        // 10 8 6 4 2
    }



    // 3. break 와 continue
    // 1) break : loop를 끝냄  -> 랜덤조건, 조건 통제 불가할때
    // terminate the nearest enclosing loop.
    // Q. 1부터 20까지 범위중 2로 나눴을때 5가 나오는 수에서 루프를 멈춰죠
    for(i in 1 until 20) {
        print(" $i")
        if (i/2 == 5) {
            break
        }
    }
    print(" Done with the loop.")
    // 1 2 3 4 5 6 7 8 9 10 Done with the loop.


    // 2) continue : 루프 안의 코드를 건너뛰고 다음 루프로 이동
    // proceeds to the next step of the nearest enclosing loop.
    for(i in 1 until 20) {
        if (i / 2 == 5) {
            continue
        }
        print(" $i")
    }
    print(" Done with the loop.")
    // 1 2 3 4 5 6 7 8 9 12 13 14 15 16 17 18 19
}