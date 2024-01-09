package udemy.android12.kotlinbasics

// 추상 클래스 vs 인터페이스
// 공통점 : 모두 추상화를 이용한 코드 구조화 방식. 추상 property는 하위 class에서 반드시 구현되어야해.
// 상태(state) 저장 가능. 단일 클래스만 상속 가능. vs 상태 저장 불가. 다중 상속 가능
// * 상태 저장 가능 = 상태를 저장할 수 있는 프로퍼티를 가질 수 있는가.

fun main() {
    val human = Human("Denis", "Russia",
        70.0, 28.0)
    val elephant = Elephant("Rosy", "India",
        5400.0, 25.0)


    human.run()
    elephant.run()

    human.breath()
    elephant.breath()

}

// An abstract class cannot be instantiated
// (you cannot create objects of an abstract class).
// However, you can inherit subclasses from can them.
// The members (properties and methods) of an abstract class are non-abstract
// unless you explicitly use the abstract keyword to make them abstract.
abstract class Mammal(val name: String, val origin: String,
                      val weight: Double) {   // Concrete (Non Abstract) Properties

    // Abstract Property (Must be overridden by Subclasses)
    abstract var maxSpeed: Double

    // Abstract Methods (Must be implemented by Subclasses)
    abstract fun run() // run이라는 추상함수. body 없이 method를 만들 수 있다.
    abstract fun breath()

    // Concrete (Non Abstract) Method
    fun displayDetails() {
        println("Name: $name, Origin: $origin, Weight: $weight, " +
                "Max Speed: $maxSpeed")
    }
}

class Human(name: String, origin: String, weight: Double,
            override var maxSpeed: Double): Mammal(name, origin, weight) {

    override fun run() {
        // Code to run
        println("Runs on two legs")
    }

    override fun breath() {
        // Code to breath
        println("Breath through mouth or nose")
    }
}

class Elephant(name: String, origin: String, weight: Double,
               override var maxSpeed: Double): Mammal(name, origin, weight) {

    override fun run() {
        // Code to run
        println("Runs on four legs")
    }

    override fun breath() {
        // Code to breath
        println("Breath through the trunk")
    }
}
