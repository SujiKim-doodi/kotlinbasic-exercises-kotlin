package udemy.android12.kotlinbasics

fun main(){
    var nullableName : String? = "Denis"
    nullableName = null

    var len2 = nullableName?.length
    nullableName.let { it:String? -> println(it?.length) }
    // println(nullableName?.length)
}