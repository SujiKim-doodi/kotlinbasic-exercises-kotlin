package udemy.android12.kotlinbasics

// The class that inherits the features of another
// class is called the Sub class or Child class or
// Derived class, and the class whose features are
// inherited is called the Super class or Parent class or Base class.

// 상속 원하면 class앞 open 키워드
// 상속 원하지않으면 class앞 sealed 키워드

// Super class, Parent class, Base class
//open class Vehicle{
//    // properties
//    // methods
//}

// Sub class, Child class, Derived class
open class NormalCar(val name: String, val brand: String){
    open var range: Double = 0.0

    fun extendRange(amount: Double){
        if(amount > 0)
            range += amount
    }

    open fun drive(distance: Double){
        println("Drove for $distance km")
    }
}

// 상속받는 클래스 특성은 다 가져야해. 프로퍼티 추가는 가능
class ElectricCar(name: String, brand: String, batteryLife : Double)
    : NormalCar(name,brand){

    override var range = batteryLife * 6

    override fun drive(distance: Double){
        println("Drive for $distance km on electricity")
    }

    fun drive(){
        println("Drove for $range km on electricity")
    }
}

fun main(){
    var clientCar1 = NormalCar("A3","Audi")
    var clientCar2 = ElectricCar("S-Model", "Tesla", 85.0)
    clientCar2.extendRange(200.0)

    clientCar2.drive()

    // Polymorphism 다형성
    // 1) 같은 이름의 함수인데 다른 클래스에서 다르게 동작
    // 2) 같은 클래스인데 다르게 동작

    clientCar1.drive(110.0)
    clientCar2.drive(120.0)

}