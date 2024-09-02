object Scrabble extends App{
  def calculateScore(word: String) = {
    val char = word.toList
    val totalArray = char.map(_.toUpper).map(i => {
      if (List('A', 'E', 'I', 'L', 'N', 'O', 'R', 'S', 'T', 'U').contains(i)) 1
      else if (List('D', 'G').contains(i)) 2
      else if (List('B', 'C', 'M', 'P').contains(i)) 3
      else if (List('F', 'H', 'V', 'W', 'Y').contains(i)) 4
      else if (List('K').contains(i)) 5
      else if (List('J', 'X').contains(i)) 8
      else if (List('Q', 'Z').contains(i)) 10
      else 0
    })
    totalArray.sum
  }

  //test
  val test1 = calculateScore("TOUCH") == 10
  val test2 = calculateScore("GRASS") == 6
  val boolTest = if (List(!test1, test2) contains (false)) "Tests Passed" else "Tests Failed"

  print(boolTest)
}
