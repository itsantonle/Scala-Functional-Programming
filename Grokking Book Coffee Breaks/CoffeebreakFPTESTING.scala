package practices

object CoffeebreakFPTESTING extends App{
/** Write tests for the functions */

def increment(x:Int):Int = {
  x + 1
}

val ItestOne = increment(1) == 2
val ItestTwo = increment(-1) == 0
val ItestThree = increment(0) == 1
val IboolTest = if(!List(ItestOne, ItestTwo, ItestThree).contains(false)) "Test Passed"
else "Test Failed"
}
