object coffeebreakRankingWords {

  def main(args: Array[String]): Unit = {

    // one point for every letter that isn't a and
    // the array must be ranked by the highest sum

    val arr = List("ada", "haskell", "scala", "java", "rust")

    def rankingWords(arr:List[String]) = {

      val op = arr.map(word => (word.replaceAll("a", "").length, arr.indexOf(word))).sortBy( x => -x._1)
      val result = op.map(tuple => (arr(tuple._2), tuple._1))
      result
    }

    println(rankingWords(arr))
  }
}
