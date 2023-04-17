object ProgettoScala {
  
  def main(args: Array[String]): Unit = {
    
    var game: Game = new Game()
    game.startGame()
    game.selectFriend()
    while(!game.checkGameOver()) game.battle() 
    game.exit()
  }
}