import java.util.*

fun main() {
var Janet= AnitaB("Janet","female",2001)
    println(Janet.introduction("Janet"))
    println(Janet.age())
    Janet.qualification()
   println( Janet.name)
}
class AnitaB(var name: String, var sex:String, var yearOfBirth:Int){
    //prints out the introdution of an student in class AnitaB
    fun introduction(myName:String):String{
      return "Hi my name is $myName. I am in Anita B class"
    }
    //prints out the qualifications to be in AnitaB class
    fun qualification(){
       var qualifyArray=arrayOf("African","female")
        var students= Arrays.toString(qualifyArray)
        println(students)
    }
    //calculates the age of the student
    fun age():Int{
        var age=2021-yearOfBirth
        return age
    }
}
