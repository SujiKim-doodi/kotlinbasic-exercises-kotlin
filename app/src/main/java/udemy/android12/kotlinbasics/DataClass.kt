package udemy.android12.kotlinbasics

// data class : data를 보관하는 것이 주요 목적인 class (hold the data)

// date class 중요사항
// 1) Main Constructor은 Parameter가 최소 하나 이상 있어야
// 2) Parameter는 var 또는 val로 넣어야 한다.
// 3) data class는 abstract추상, open오픈, sealed봉인, inner내부 class일 수 없다.

// 자동 생성 함수
// .equals(), .toString(), .componentN(), .copy()
data class User(val id:Long, var name : String) // 기본적으로 public 접근제어자

fun main(){
    val user1 = User(1, "Suji") // 데이터 클래스 객체 생성

    val name = user1.name
    println(name)
    user1.name = "Sarah"

    val user2 = User(2,"Sarah")
    println(user1 == user2) // false (id가 다르기 때문)

    println("User Details : $user1")

    val updatedUser = user1.copy(name="SujiKim") // id는 동일하게
    println("Updated User Datails : $updatedUser")

    // component 메소드 : 구조 분해 선언 역할
    println(updatedUser.component1()) // 1
    println(updatedUser.component2()) // SujiKim

    val (id, name) = updatedUser // 13 val name과 Conflicting declarations
    println("id=$id, name=$name")

}