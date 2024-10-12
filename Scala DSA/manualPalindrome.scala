package dsa

object manualPalindrome extends App{
  def palindrome(str:String): Boolean = {
    if(str.isEmpty || str.length == 1) true
    else if(str.head == str.last) palindrome(str.slice(1, str.length - 1))
    else false
  }

  println(palindrome("kayak"))
}
