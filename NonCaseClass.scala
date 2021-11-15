// Not using the case class

// Normal class definition
class PhoneNumber(val x: Int, val  y: Int) {
    // Override hashCode and equals to make it a key for Map
    override def hashCode(): Int = x + y
    override def equals(that: Any): Boolean = that match {
        case that: PhoneNumber => (x == that.x) && (y == that.y) 
        case _ => false
    }
    // Override toString to make the result easier to read
    override def toString(): String = "PhoneNumber(" + x + "," + y + ")"
}
// Companion object to create an instance
object PhoneNumber {
    def apply(x: Int, y: Int): PhoneNumber = new PhoneNumber(x, y)
}

object NonCaseClass extends App {
    val map = Map(PhoneNumber(180, 43218765) -> "Alex", 
                  PhoneNumber(190, 87654321) -> "Jessica")

    println(map(PhoneNumber(180, 43218765))) // Alex
    println(map(PhoneNumber(190, 87654321))) // Jessica
    println(map.toString) // Map(PhoneNumber(180,43218765) -> Alex, PhoneNumber(190,87654321) -> Jessica)

    // You can't use a match expression unless it is a case class.
    // val p = PhoneNumber(180, 43218765)
    // p match {
    //     case PhoneNumber(x, y) => 
    //         println(x) 
    //         println(y) 
    // }

}


// =====================================
//         Output Sample
// =====================================
// $ scalac NonCaseClass.scala 
// $ scala NonCaseClass
// Alex
// Jessica
// Map(PhoneNumber(180,43218765) -> Alex, PhoneNumber(190,87654321) -> Jessica)