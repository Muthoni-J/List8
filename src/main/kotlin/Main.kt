fun main(){
    var counties= favCounties(listOf("Nairobi","Murang'a","Nakuru","Kericho","Kisumu","Embu","Wajir","Machakos","Narok","Busia"))
    var heightAndAverage = heightOfPeople(listOf(2.3,1.49,1.76,1.88))
    println(heightAndAverage)
    var w = People("James",12,167.0,47.5)
    var j = People("Paul",15,140.0,54.5)
    var t = People("Peter",23,170.0,70.5)
    var list1 = listOf(w,j,t)
    var individuals = list1.sortedByDescending { person-> person.age }
    println(individuals)
    var  p = People("Sharon",22,1.49,53.5)
    var  y = People("Mary",23,1.70,52.5)
    var list2 = listOf(p, y)
    println(list1.plus(list2))
    var Prado = Fortuner("KCS123J",80)
    var V8 = Fortuner("KDD123A",120)
    var Fortuner = listOf(Prado, V8)
    println(myfortuner(Fortuner))

}
//Given a list of 10 strings, write a function that returns a list of the strings
//at even indices i.e index 2,4,6 etc
fun favCounties(names: List<String>): List<String>{
    names.forEachIndexed { index, s ->
        if (index%2==0) {
            println(s)
        }

    }
    return  names
}



//Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height
fun heightOfPeople(values: List<Double>): String {
    var height = values.sum()
    var avg = values.average()
    var y = "$height, $avg"

    return y
}

//Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age

data class People(var name: String, var age:Int, var height:Double, var weight:Double)


//Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.
//(1 points)
fun fruit(grapes: List<Any>): List<Any>{
    return listOf()

}
//Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.
data class Fortuner(var registration: String, var mileage: Int)
fun myfortuner(vehicle: List<Fortuner>): Int{
    var spin = 0
    vehicle.forEach { car-> car.mileage
        spin+= car.mileage
    }
    var avg = spin/vehicle.count()
    return  avg
}