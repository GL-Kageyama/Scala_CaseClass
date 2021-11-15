# Scala Case Class

## Case Class
Class definitions to allow pattern matching of objects with less crested code.  

## Sample
```Scala
case class PhoneNumber(x: Int, y: Int)

val map = Map(PhoneNumber(180, 43218765) -> "Alex")

println(map(PhoneNumber(180, 43218765))) // Alex
```
