package dsa

object fib extends App{

  //declare an emtpy map use the map.empty property
  def fibonacci (n:Int, memo:Map[Int,Long] = Map.empty[Int,Long]):Long = {
    if(memo.contains(n)) memo(n)
    else if (n<=2) 1
    else {
    val result = fibonacci(n-1, memo) + fibonacci(n-2, memo)
    val Nmemo = memo + (n -> result)
    Nmemo(n)
    }
  }

  println(fibonacci(3))
}
