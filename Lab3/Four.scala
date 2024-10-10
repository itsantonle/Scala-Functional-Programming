object Four {
  def main(args: Array[String]): Unit = {
    def partition(list: List[Int], divider: Int): (List[Int], List[Int]) = {
      list.partition(_ < divider)
    }

    //unit test
    val test1 = partition(List(2, 8, 9, 16, 23, 24, 31), 17) == (List(2, 8, 9, 16), List(23, 24, 31))
    val test2 = partition(List(10, 15, 20, 25, 30, 35, 40), 35) == (List(10, 15, 20, 25, 30), List(35, 40))
    val test3 = partition(List(2, 4, 6, 8), 6) == (List(2, 4), List(6,8))
    val test4 = partition(List(5 ,17 ,19 ,20 ), 21) == (List(5,17,19,20), List())
    val test5 = partition(List(2, 5, 6, 8, 11, 16), 0) == (List(), List(2, 5, 6, 8, 11, 16))
    val test6 = partition(List(-4, -2, -1 , 1, 4), -2) == (List(-4), List(-2, -1, 1, 4))
    val test7 = partition(List(-5, -2, -1, 2), -6) == (List(), List(-5, -2, -1, 2))

    if (!List(test1,test2,test3,test4,test5,test6,test7)
      .contains(false)) println("Tests passed") else println("Tests failed")

  }
}
