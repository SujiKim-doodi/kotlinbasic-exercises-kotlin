package udemy.android12.kotlinbasics

fun main() {
    var myString: String = "Android Masterclass"
    val myFloat: Float = 13.37F
    val myDouble: Double = 3.14159265358979
    var myShort: Short = 25
    var myInt: Int = 2020
    var myLong: Long = 18881234567
    var myBoolean: Boolean = true
    var myChar: Char = 'a'


    // 36. While 반복문 - 100부터 2씩 줄어드는 수들을 모두 출력.0되면 'Finished' 출력.
    // var x = 100
    // while (x >= 0) {
    //     print("$x")
    //     x -= 2
    // }
    // print("\nwhile loop is done")

    // 41-1. 반복문 연습하기
    var n = 0
    while (n <= 9001){
        print("$n ")
        n++
    }
    println("\n IT'S OVER 9000!!!")

    /*
    강사님
    for(num in 1..10000){
        if(num == 9001)
            print("IT'S OVER 9000!!!")
     */

    // 41-2. 반복문 연습하기
    var humidityLevel = 80
    var humidity = "humid"
    for(humidityLevel in 80 downTo 60 step 5){
        println("humidity decreased : $humidityLevel")
    }
    println("it's comfy now")
    humidity = "comfy"

   /*
   강사님 코드
    var humidity = "humid"
    var humidityLevel = 80
    while (humidity == "humid"){
        humidityLevel-=5
        println("humidity decreased")
        if(humidityLevel < 60){
            humidity = "comfy"
            println("it's comfy now")
         }
     }
     */

    // Quiz 3-2. Loops
    var x = 2
    while(x <= 8) {
        print("$x")
        if (x == 6){
            x = 8
        }
        x++
    }
    // 23456

    // Quiz 3-3. Problem of Loop
    var z = 12
    do {
        print(" $z")
    } while(z <= 10)
    // 12

    // Quiz 3-4. For문
    for (x in 0..5) {
        for (y in 0..5) {
            print(" Result = ${x * y}")
        }
    }
    // Result = 0 Result =0 ... Result = 20 Result = 25
}