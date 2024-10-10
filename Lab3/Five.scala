object Five {
  def main(args: Array[String]): Unit = {
    def goodbyeEven(even: List[Int]): List[Int] = {
      even.filter(_ % 2 != 0)
    }

    //unit test
    val test1 = goodbyeEven(List(2, 8, 9, 16, 23, 24, 31)) == List(9, 23, 31)
    val test2 = goodbyeEven(List(10, 15, 20, 25, 30, 35, 40)) == List(15, 25, 35)
    val test3 = goodbyeEven(List(2, 5, 7, 11, 12)) == List(5, 7, 11)
    val test4 = goodbyeEven(List(-11, -9, -6, -2, -1, 2, 4, 8 , 10)) == List(-11, -9, -1)
    val test5 = goodbyeEven(List(-5, -5, -4, -4, -3, -2, -2, -2, 1, 3, 4, 4, 5, 5)) == List(-5,-5,-3,1,3,5,5)

    if (!List(test1,test2,test3,test4,test5)
      .contains(false)) println("Tests passed") else println("Test failed")
  }
}
