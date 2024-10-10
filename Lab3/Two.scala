object Two {
  def main(args: Array[String]): Unit = {
    def isRotation(str1: String, str2: String): Boolean = {
      val extended = str1.toLowerCase() + str1.toLowerCase()
      if (str1.length == str2.length && extended.indexOf(str2.toLowerCase()) != -1) true else false
    }

    //unit test
    val test1 = isRotation("waterbottle", "erbottlewat") == true
    val test2 = isRotation("waterbottle", "bottlewter") == false
    val test3 = isRotation("hungry", "GRYhun") == true
    val test4 = isRotation("alive", "LIvEa") == true
    val test5 = isRotation("alive", "livae") == false

    if (List(!test1,test2,test3,test4,test5)
      .contains(false)) println("Tests passed") else println("Tests failed")

  }
}
