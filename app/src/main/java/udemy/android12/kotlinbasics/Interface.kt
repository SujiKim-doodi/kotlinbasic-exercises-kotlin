package udemy.android12.kotlinbasics

// Interface
// 역할 : class 기능 확장.

// 특징
// 1) 모든 프로퍼티와 함수를 구현해줄 수 있지만,꼭 그래야 하는 것은 x.
// 2) 인터페이스를 구현하는 클래스의 하위 클래스도 똑같이 인터페이스 구현
// 3) 인터페이스는 다른 인터페이스에서 상속받을 수 있다.

// 의의
// 1) 나중에 구현하고 싶은 특정 함수와 class property가 있다면 유용.
// 2) 구체적인 함수 body를 아직 만들고 싶지 않을 때도
interface Drivable{
    val maxSpeed: Double
    fun drive(): String
    fun brake(){
        println("The drivable is braking")
    }
}
open class NormalCarIF(override val maxSpeed: Double, val name: String, val brand: String) : Drivable{
    open var range: Double = 0.0

    fun extendRange(amount: Double){
        if(amount > 0)
            range += amount
    }

    override fun drive():String{
        return "driving the interface drive"
    }

    open fun drive(distance: Double){
        println("Drove for $distance km")
    }
}

class ElectricCarIF(maxSpeed: Double, name: String, brand: String, batteryLife : Double)
    : NormalCarIF(maxSpeed, name, brand){

    override var range = batteryLife * 6

    override fun drive(distance: Double){
        println("Drive for $distance km on electricity")
    }

    override fun drive():String{
       return "Drove for $range km on electricity"
   }
}

fun main(){
    var clientCar1 = NormalCarIF(200.0,"A3","Audi")
    var clientCar2 = ElectricCarIF(200.0,"S-Model", "Tesla", 85.0)
    clientCar2.extendRange(200.0)

    clientCar2.brake()
    clientCar1.brake()

    // Polymorphism 다형성
    // 1) 같은 이름의 함수인데 다른 클래스에서 다르게 동작
    // 2) 같은 클래스인데 다르게 동작

    clientCar1.drive(110.0)
    clientCar2.drive(120.0)

}
