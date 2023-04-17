abstract class Enemy(life: Int, attack: Int, name: String) extends Character(life, attack, name){
  
  def specialAttack(f: Friend)
  
  def printData() = Printer.printEnemy(this)
 
}

class Executioner() extends Enemy(100, 40, "Boia"){
  
  def specialAttack(f: Friend) = {
    
    Printer.startSpecialAttack(this.getName())
    if(f.getSchield()){
      
      f.loseSchield()
      Printer.defenseSchield()
    }
    else{
       
      var random: Int = scala.util.Random.nextInt()
      random = (Math.abs(random % 41))
      Printer.enemyDamage(this.getAttack()+random)
      f.decreaseLife(this.getAttack()+random) 
   
    }
    
  }
}

class Giant() extends Enemy(150, 60, "Gigante"){
  
  def specialAttack(f: Friend) = {
    
    Printer.startSpecialAttack(this.getName())
    Printer.enemyDamage(this.getAttack())
    f.decreaseLife(this.getAttack())
  }
}

class Dragon() extends Enemy(130, 70, "Drago"){
  
  def specialAttack(f: Friend) = {
    
    Printer.startSpecialAttack(this.getName())
    if(f.getSchield()){
      
      f.loseSchield()
      Printer.defenseSchield()
    }
    else{
       
      var random: Int = scala.util.Random.nextInt()
      random = (Math.abs(random % 3))
      Printer.enemyDamage(this.getAttack()*random)
      f.decreaseLife(this.getAttack()*random)
    }
    
  }
}

