object DonutShop extends App{

  val storedDonut = Map(
    "chocolate" -> 12,
    "vanilla" -> 30,
    "pandan" -> 15
  )

//donut but its a static class

    object DonutMethods{
      // check for number of donuts left
      //by specific type
      // if string == "all" will return the total donuts regardless of flavors
      // will return zero if donut does not exist

      def checkStock(storage: Map[String, Int],donut: String): Int = {
        val result = if (donut.toLowerCase == "all") storage.values.sum
        else if (storage.contains(donut.toLowerCase)) storage(donut.toLowerCase)
        else 0

        result
      }

      //display assorted Prettier

      def displayAll(storage:Map[String,Int]):String={
        val display = storage.map((k,v)=>{
          s"${k} - ${v}"
        }).mkString("\n")

        "FLAVOUR - QUANTITY" +"\n" + display
      }

      //add to existing without manipualating the old map
      // creates a new map
      def addToExisting(storage: Map[String, Int], name: String, quantity: Int): Map[String, Int] = {
        def result = if (storage.contains(name.toLowerCase)) storage(name.toLowerCase) + quantity
        else storage(name.toLowerCase)
        val nMap = storage + (name.toLowerCase -> result)
        nMap

      }

      //remove a cetain number of donuts
      //if the removed is more than the stock
      // stock is immediately set to zero
      //creates a new map
      def decreaseDonutStock(storage: Map[String, Int], name: String, quantity: Int): Map[String, Int] = {
        val result = if (storage.contains(name.toLowerCase)) storage(name.toLowerCase) - quantity
        else storage(name.toLowerCase)
        val test = if (result < 0 || result == 0) 0 else result
        val nMap = storage + (name.toLowerCase -> test)
        nMap
      }

      //add flavor
      //if the flavor exists it does nothing and does not changing the existing value
      // if flavor quanitity was not declared is immediately zero
      // returns a new map
      def addFlavor(storage: Map[String, Int], name: String, quantity: Int = 0): Map[String, Int] = {
        val nMap = if (!storage.contains(name.toLowerCase())) storage + (name.toLowerCase -> quantity)
        else storage
        nMap
      }

      //remove flavor
      //returns a new map with specified removed element
      // if element does not exist the no data changes in new map
      def removeFlavor(storage:Map[String,Int], name:String)={
        val nMap = if(storage.contains(name.toLowerCase)) storage - name.toLowerCase
        else storage
        nMap

      }


    }

println(DonutMethods.displayAll(storedDonut))
println(DonutMethods.addToExisting(storedDonut,"chocolate",2))
println(DonutMethods.displayAll(storedDonut))
println(DonutMethods.decreaseDonutStock(storedDonut,"chocolate",11))
println(DonutMethods.addFlavor(storedDonut, "strawberry"))
println(DonutMethods.addFlavor(storedDonut, "Ube",5))
println(DonutMethods.removeFlavor(storedDonut,"chocolate"))

//create tests here
 }
