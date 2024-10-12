package practices
//reference grokking page 40

object practiceTwo extends App{
// object is a single global insteance of something

object ShoppingCart{
  def getDiscountPercentage(items: List[String]): Int = {
    if(items.contains("Book")) 5 else 0
  }
}

//rewriting Tip Calculator page 41

object TipCalculator{
  def getTipPercentage(names:List[String]): Int ={
    if(names.size > 5) 20 else if(names.size > 0) 10 else 0
  }
}

//testing in Scala using bools

val testOne = TipCalculator.getTipPercentage(List.empty) == 1
val testTwo = TipCalculator.getTipPercentage(List.empty) == 0
val testThree = TipCalculator.getTipPercentage(List("Apple", "Book")) == 5
}
