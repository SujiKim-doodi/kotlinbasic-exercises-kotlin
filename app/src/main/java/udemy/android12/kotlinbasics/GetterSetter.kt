package udemy.android12.kotlinbasics

import java.lang.IllegalArgumentException
import java.util.Locale

fun main(){
    var myCar = Car()
    myCar.maxSpeed = 240
    println("brand is : ${myCar.myBrand}")
    println("MaxSpeed is : ${myCar.maxSpeed}")
    println("Model is ${myCar.myModel}") // getter는 비공개x -> 오류x
    // myCar.myModel = "Hyundai" // setter은 비공개 -> 오류 ㅇ
}

class Car(){
    // 변수 초기화 후 -> lateinit 사용해야
    lateinit var owner : String

    val myBrand: String = "BMW"
        // Custom getter
        get(){
            return field.lowercase()
        }

    var maxSpeed: Int = 250
        // field : get와 set method 안에서 property 참조를 도와주며 뒷받침하는 역할
        get() = field
        set(value){
            field = if(value > 0) value
                        else throw IllegalArgumentException("Maxspeed cannot be less than 0.")
        }
    var myModel : String = "M5"
        // private : class 외부에서 해당 class나 Member에 접근을 제한하는 접근 제어자
        // Kotlin class에 사용될 때는 class 내부의 모든 member에 적용되지 x -> 명시적으로 지정해야
        private set
    init{
        this.myModel = "M3" // M3
        this.owner = "Frank"
    }
}
// Q. Car이라는 class를 변수에 할당할 수 있는가?
// Q. 왜 lateinit 다음에 또 init을 써야 하는지?
// Q. 19 get()과 24 get()_Redundant 차이
// Q. 왜 Car().myBrand라 써도 되는데 왜 main 함수에 myCar이라는 변수를 또 만드는가?
// Q. getter와 setter 쓰는 거랑 if else 쓰는거랑 뭐가 다른거지?
// Q. 11줄과 12줄 똑같은 private인데 하나만 오류나는 이유
// Q. getter나 setter안에 property를 입력하면 왜 stack overflow현상이 일어나는지
