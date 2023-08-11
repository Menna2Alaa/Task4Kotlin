fun main() {
    println("please enter a number from 1 to 4")
    val game : Game? =when(readlnOrNull()?.toIntOrNull())
    {
        1 ->Football("football")
        2 ->Basketball("basketball")
        3 ->Karate("karate")
        4 ->Chess("chess")
        else ->null
    }
    game?.gameInformation()
}
open class Game (private var gameName : String, var gamePlayerNum : Int, var gameBall : String, var gameStatus : String)
{
    fun gameInformation(){
        println("Game Name : $gameName , Players Number = $gamePlayerNum , Game Ball : $gameBall , Game Status : $gameStatus")
    }
}
data class Football(var gameName: String):Game(gameName  , gamePlayerNum = 11 ,  gameBall = "have a ball" ,  gameStatus = "collective")

data class Basketball(var gameName: String):Game(gameName  , gamePlayerNum = 5 ,  gameBall = "have a ball" ,  gameStatus = "collective")

data class Karate(var gameName: String):Game(gameName  , gamePlayerNum = 1 ,  gameBall = "no ball" ,  gameStatus = "individual")

data class Chess(var gameName: String):Game(gameName  , gamePlayerNum = 1 ,  gameBall = "no ball" ,  gameStatus = "individual")