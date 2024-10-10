object One {
  def main(args: Array[String]): Unit = {
    def isPalindrome(str: String): Boolean = {
      val reverse = str.reverse.toLowerCase()
      val lowerString = str.toLowerCase
      if (lowerString == reverse) true else false
    }

    // unit test
    val test1 = isPalindrome("level") == true
    val test2 = isPalindrome("ignorance") == false
    val test3 = isPalindrome("Noon") == true
    val test4 = isPalindrome("KAyak") == true
    val test5 = isPalindrome("Mom") == true

    if (!List(test1,test2,test3,test4,test5)
      .contains(false)) println("Tests passed") else println("Test failed")

  }
}
