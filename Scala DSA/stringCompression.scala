package dsa

object stringCompression extends App {

  def compression(str:String, nstr:String = "", count:Int = 0): String=
    {
      if(str == "") {
        nstr
      }
      else if (str.length == 1){
        val newCount = count + 1
        nstr + str.head + newCount
      }
      else if(str.charAt(0) == str.charAt(1)){
        val newCount = count + 1
        compression(str.substring(1), nstr, newCount)
      } else {
        val newCount = count + 1
        val newString = nstr + s"${str.charAt(0)}${newCount}"
        compression(str.substring(1),newString,0)
      }
    }

  println(compression("aabbee0tte"))

}
