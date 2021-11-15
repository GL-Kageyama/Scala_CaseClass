// Using the case class

// Define the case class
case class PhoneNumber(x: Int, y: Int)

// No need to override hashCode
// No need to override equals
// No need to override toString
// No need for a companion object for the Point class

object CaseClass extends App {
    val map = Map(PhoneNumber(180, 43218765) -> "Alex", 
                  PhoneNumber(190, 87654321) -> "Jessica")

    println(map(PhoneNumber(180, 43218765))) // Alex
    println(map(PhoneNumber(190, 87654321))) // Jessica
    println(map.toString) // Map(PhoneNumber(180,43218765) -> Alex, PhoneNumber(190,87654321) -> Jessica)

    // Using the case class, you can use match expressions.
    val p = PhoneNumber(180, 43218765)
    p match {
        case PhoneNumber(x, y) => 
            println(x) // 180
            println(y) // 43218765
    }
}


// =====================================
//         Output Sample
// =====================================
// $ scalac CaseClass.scala 
// $ scala CaseClass
// Alex
// Jessica
// Map(PhoneNumber(180,43218765) -> Alex, PhoneNumber(190,87654321) -> Jessica)
// 180
// 43218765