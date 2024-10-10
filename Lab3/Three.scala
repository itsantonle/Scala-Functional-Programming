object Three {
  def main(args: Array[String]): Unit = {
    def compress(s: String): String = {
      val sL = s.toLowerCase()
      if (sL.isEmpty) ""
      else {
        val (segment, rest) = sL.span(_ == sL.head)
        sL.head + segment.length.toString + compress(rest)
      }
    }
    val test1 = compress("aabcccccaaa") == "a2b1c5a3"
    val test2 = compress("ccc   llllll  iiii") == "c3 3l6 2i4"
    val test3 = compress("CccBbb") == "c3b3"
    val test4 = compress("***   ") == "*3 3"
    val test5 = compress("DDdAaAbBB") == "d3a3b3"
    val test6 = compress("000111,,**") == "0313,2*2"

    if (List(!test1,test2,test3,test4,test5,test6)
      .contains(false)) println("Tests passed") else println("Tests failed")

  }
}