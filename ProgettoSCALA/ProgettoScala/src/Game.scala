class Game {
  
  private var level: Int = 1
  private var player_name: String = ""
  private var enemy: Enemy = null
  private var protagonist: Friend= null
  
  
  def startGame() = {
    
    var name: String= ""
    Printer.askName()
    name = scala.io.StdIn.readLine()
    println("")
    Printer.welcome(name)
    this.player_name=name
  }
  
  private def selectEnemy() = {
    
     var random: Int = scala.util.Random.nextInt()
     random = (Math.abs(random % 3))+1
     Printer.enemyAppears()
     if(random==1){
       
       this.enemy=new Executioner()
       this.enemy.printData()
     }
     else if(random==2){
       
       this.enemy=new Giant()
       this.enemy.printData()
     }
     else{
       
       this.enemy=new Dragon()
       this.enemy.printData()
     }
  }
  
  def selectFriend(): Unit = {
    
    var choose: String = "-1"
    Printer.selectFriend();
    choose = scala.io.StdIn.readLine()
    println("")
    if(choose=="1") this.protagonist=new Magician()
    else if(choose=="2") this.protagonist=new Knight()
    else if(choose=="3") this.protagonist=new Arcier()
    if(choose=="1" || choose=="2" || choose=="3"){
      
      this.protagonist.printData()
      Printer.goodLuck(this.player_name)
    }
    else this.selectFriend()
 }
  
  def battle() = {
    
    Printer.startLevel(this.level)
    scala.io.StdIn.readLine()
    println("")
    Printer.loading()
    this.selectEnemy()
    Printer.printStatus(this.protagonist, this.enemy)
    var choose: String = "-1"
    var gameOver: Boolean = false;
    while(!gameOver && this.enemy.getLife()>0){
      
      Printer.selectAttack()
      choose = scala.io.StdIn.readLine()
      println("")
      if(choose=="1") this.protagonist.attack(this.enemy)
      else if(choose=="2") this.protagonist.specialAttack(this.enemy)
      if(choose=="1" || choose=="2"){
        
        if(this.enemy.getLife()>0){
          
          Printer.enemyAttack()
          this.enemy.specialAttack(this.protagonist)
          gameOver=this.checkGameOver()
          Printer.printStatus(this.protagonist, this.enemy)
          if(!gameOver){
            
            Printer.continueBattle()
            scala.io.StdIn.readLine()
            println("")
          }
        }
        else{
          
          Printer.printStatus(this.protagonist, this.enemy)
          Printer.levelCompleted(this.level)
          this.level+=1
          this.assignLoot()
        }
      }
    }

  }
  
  def assignLoot() = {
    
    var random: Int = scala.util.Random.nextInt()
    random = (Math.abs(random % 3))
    var loot: Loot = null
    Printer.getLoot();
    if(random==0) loot = new Uplife
    else if(random==1) loot = new UpAttack
    else loot = new UpSchield
    loot.assignLoot(this.protagonist)
  }
  
  def checkGameOver(): Boolean = {
    
    if(this.protagonist.getLife()<1) true
    else false
  }
  
  def exit() = {
    
    Printer.gameOver(this.level)
  }
  
  
}