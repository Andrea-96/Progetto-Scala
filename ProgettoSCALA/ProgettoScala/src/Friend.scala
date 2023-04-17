abstract class Friend(life: Int, attack: Int, name: String, s: Boolean) extends Character(life, attack, name){
  
  private var schield: Boolean = s
  
  def printData() = Printer.printFriend(this)
  
  def getSchield(): Boolean = this.schield
  
  def loseSchield() = this.schield=false;
  
  def takeSchield() = this.schield=true;
  
  def attack(e: Enemy) = {
    
    Printer.startAttack(this.getName())
    Printer.damage(this.getAttack())
    print("\n\n") 
    e.decreaseLife(this.getAttack())
  }
  
  def specialAttack(enemy: Enemy)
}

class Magician() extends Friend(250, 50, "Mago", false){
  
  def specialAttack(enemy: Enemy) = {
    
    var random: Int = Math.random().asInstanceOf[Int]
    random = (Math.abs(random % 2))+2
    Printer.startSpecialAttack(this.getName())
    Printer.damage(this.getAttack()*random)
    print(" grazie al moltiplicatore magico...\n\n") 
    enemy.decreaseLife(this.getAttack()*random)
  }
}

class Knight() extends Friend(200, 70, "Soldato", true){
  
  def specialAttack(enemy: Enemy) = {
    
    print("Premi un tasto seguito da invio per lanciare una moneta,\n")
    print("se esce testa il tuo attacco sarà triplicato altrimenti l'attacco fallirà\n\n")
    scala.io.StdIn.readLine()
    println("")
    var random: Int = scala.util.Random.nextInt()
    random = (Math.abs(random % 2))
    if(random==1){
      
      print("!!!E' uscita testa!!!\n\n")
      Printer.startSpecialAttack(this.getName())
      Printer.damage(this.getAttack()*3)
      print(" grazie alla spada potenziata!!!\n\n")
      enemy.decreaseLife(this.getAttack()*3)
    }
    else print("!!!E' uscita croce, attacco fallito!!!\n\n")      
  }
}

class Arcier() extends Friend(225, 60, "Arciere", true){
  
  def specialAttack(enemy: Enemy) = {
    
    print("Premi un tasto seguito da invio per lanciare un dado,\n")
    print("se esce un numero minore di 3 l'attacco fallirà,\n")
    print("se esce un numero tra il 3 e il 4 verrà fatto un'attacco base,\n")
    print("se esce un numero maggiore di 4 il tuo nemico morirà all'istante\n\n")
    scala.io.StdIn.readLine()  
    println("")
    var random: Int = scala.util.Random.nextInt()
    random = (Math.abs(random % 6))+1
    if(random>2 && random<=4){
      
      print("!!!E' uscito "+ random +"!!!\n\n")
      this.attack(enemy)
    }
    else if(random<=2) print("!!!E' uscito " + random + ", attacco fallito!!!\n\n")
    else{
      
      print("!!!E' uscito "+ random +"!!!\n\n")
      var damage: Int= enemy.getLife()
      Printer.startSpecialAttack(this.getName)
      Printer.damage(damage)
      print(" grazie alla freccia infuocata\n\n")
      enemy.decreaseLife(damage)
    }
  }
}