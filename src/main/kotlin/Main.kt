fun main(){
    val school= "Akirachix"
    print(school[0])
    print(school[2])
    print(school[3])
    println()
    var sentence=personalDetails("Habiba", "24")
    println(sentence)
    println()
    var cloth= "Vintage"
    println(cloth.length)
    Vintage("Malia", "Malia")
    Vintage("Kayla", "Jules")
        }
fun schoolName(name:String){
    val school= "Akirachix"
}
fun personalDetails(name: String, age:String) :String{
    var sentence= ("Hi, my name is $name and I am $age years old.")
    return sentence
}
fun fashion(name:String):Int{
    var cloth = "Vintage"
    return cloth.length
}
fun Vintage( name1:String, name2: String){
    if (name1==name2)
        println("That`s me!")
    else
        println("I don`t know who that is")
}
