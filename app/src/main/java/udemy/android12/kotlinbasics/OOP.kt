package udemy.android12.kotlinbasics

// OOP
// Object-Oriented Programming 데이터와 함수가 하나의 단위로 묶임
// <-> Procedural Programming 데이터와 함수 분리
// -> JAVA, C#, Kotlin ...

// The 5 basic concepts
// 1) variables and types - ingredients
// 2) control flows -conditionally work
// 3) functions - separate and reuse code
// 4) collections - store multiple elements
// 5) classes and objects(including inheritance) - store members&methods


fun main(){
    var Student1 = Person("Suji", "Kim", 22) // Suji Kim
    Student1.age = 20
    println("Student1 is ${Student1.age} years old") // 20
    Student1.hobby = "Walking around" // hobby 프로퍼티 변경
    Student1.stateHobby() // stateHobby 메서드 사용

//    var Student2 = Person() // Amy Park
//    var Student3 = Person(lastName = "Lee") // Amy Lee
}

// 보조생성자는 객체 생성 시 값을 추가하게 해줘
// 객체 생성한다 = class의 instance를 생성한다. (주로 main 함수 내)
class Person(firstName: String = "Amy", lastName: String = "Park"){
    // Member Variables 멤버변수 (= Properties 프로퍼티)
    // : class 안의 변수
    var age : Int ?= null
    var hobby : String = "Watching Netflix"
    var firstName : String ?= null //

    // Initializer Block : class내 가장 먼저 호출. class 블록 내에서 프로퍼티 초기화 가능
    init{
        this.firstName = firstName
        println("Initialized a new Person object with" +
                "firstName = $firstName and lastName = $lastName")
    }
    // Member secondary Constructor
    constructor(firstName: String, lastName: String, age: Int)
            : this(firstName,lastName){
        // object 생성시 constructor에 전달된 age 값이 이 this 클래스의 age 값으로 지정되어야
        this.age = age
        println("Initialized a new Person object with" +
                "firstName = $firstName and lastName = $lastName and age = $age ")
            }

    // Member functions 멤버함수 (= Methods 메서드)
    // : class 안의 함수
    fun stateHobby(){
        println("$firstName\'s hobby is $hobby")
    }

}