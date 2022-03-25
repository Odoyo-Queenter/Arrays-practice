fun main(){
     var carName = "volvo"
     println(carName)
     born()
     var xy =addition(5,10)
     println(xy)
     var z = name("Hello")
     println(z)
     var q = print("Hello Word")
     println(q[0])
     data()
}
//create a variable name carName and assign the value volvo to it
//insert the missing part ---birthYear 1975
//display the sum of 5+10
//what is the datatype of x in val x=5 and x="Hello world"
fun born(){
     var birthyear = 1975
     println(birthyear)
}
fun addition(a:Int,b:Int):Int{
     var sum = a + b
     return sum
}
//val x = 5 is an Int
// x = "Hello world" is  a string
//inset the mising part to access the first element in the string
//var txt="Hello world"
//how to print the data type

fun name(n:String):String{
     var naming = "Hello"
     return naming
}
fun print(p:String):String{
     var txt = "Hello World"
     return txt


}
fun data(){
     var sumup = 20
     var add = 'n'
     println(sumup)
     println("${sumup::class.simpleName}")
     println("${add::class.simpleName}")
}





