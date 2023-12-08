package udemy.android12.kotlinbasics

fun main(){
    /*
    var nullableName : String? = "Denis"
    nullableName = null

    var len2 = nullableName?.length
    nullableName.let { it:String? -> println(it?.length) }
    // println(nullableName?.length)
     */

    var phone1 = MobilePhone("Android", "Samsung", "Galaxy S20 Ultra" )
    val phone2 = MobilePhone("iOS", "Apple", "iPhone 13")
    val phone3 = MobilePhone("Android", "Google", "Pixel 6")
}
// #54. class와 object practice
class MobilePhone(osName : String, brand : String, model : String){
    init{
        println ("$osName $brand $model")
    }
}
