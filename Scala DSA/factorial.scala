package dsa

object factorial extends App{

  def factorialAlgo(n:Long):Long =
    {
      if(n <= 1) 1 else  (n  * factorialAlgo(n-1))

    }
// the data type matters in scala as ints can only store 32 bit and will start going negative
// for big types you should use Long
  println(factorialAlgo(3))
}
