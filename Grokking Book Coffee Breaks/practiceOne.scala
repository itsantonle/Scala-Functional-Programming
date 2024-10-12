package practices
//find the requirements at page 14 grokking

object practiceOne extends App{
def increment(x:Int): Int = {
   x + 1
}

def getFirstCharacterString(s:String):Char = {
  s.charAt(0)
}

def wordScore(word:String): Int = {
  return word.length
}

println(increment(6))
println(wordScore("Scala"))
}
