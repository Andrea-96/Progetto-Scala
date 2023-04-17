object Printer {
  
  def selectFriend() = {
    
    print("Seleziona un numero e premi invio per scegliere un personaggio\n")
    print("1: Mago\n")
    print("2: Soldato\n")
    print("3: Arciere\n\n")
  }
  
  def goodLuck(name: String) = print("!!!Buona fortuna " + name + " inizia la tua avventura!!!\n\n")
 
  def printStatus(f: Friend, e: Enemy) = {
      
    print("Stato combattimento: \n\n")
    print("		TU		NEMICO\n")
    println("Spirito:	"+ f.getName() + "		" + e.getName())
    println("Vita:		"+ f.getLife() + "		" + e.getLife())
    println("Attaco base:	"+ f.getAttack() + "		" + e.getAttack())
    print("Scudo:		"+ f.getSchield() + "		" + "Nessuno scudo\n\n")
  }
  
  def loading() = {
    
    print("...........Caricamento...........\n")
    print("...........Caricamento...........\n")
    print("...........Caricamento...........\n\n")
  }
  
  def selectAttack() = {
    
    print("Seleziona un numero e premi invio per scegliere come attaccare il nemico\n")
    print("1: Attacco base\n")
    print("2: Attacco speciale\n\n")
  }
  
  def levelCompleted(level: Int){
    
    print("!!!Complimenti hai ucciso il nemico!!!\n\n")
    print("!!!Livello " + level + " completato!!!\n\n")     
  }
  
   def gameOver(level: Int){
    
    print("!!!Game over!!!\n\n")
    print("Hai terminato la tua avventura al livello " + level + "!\n")       
  }
   
  def askName() = print("Inserisci il tuo nome: ")
 
  def welcome(name: String) = print("!!!Benvenuto in Survivor " + name + "!!!\n\n")
  
  def enemyAppears() = print("!!!E' apparso un nemico da sconfiggere!!!\n")
  
  def startLevel(level: Int) = print("Premi un tasto seguito da invio per iniziare il livello " +level+ "\n\n")

  def enemyAttack() = print("Il nemico contrattacca...\n\n")
  
  def continueBattle() = print("Premi un tasto seguito da invio per continuare la battaglia!\n\n")

  def printFriend(f: Friend) = {
    
    print("Ecco le caratteristiche del personaggio selezionato: \n")
    println("Spirito: "+ f.getName())
    println("Vita: "+ f.getLife())
    println("Attaco base: "+ f.getAttack())
    print("Scudo: "+ f.getSchield() + "\n\n") 
  }
  
  def printEnemy(e: Enemy) = {
    
    println("Spirito: "+ e.getName())
    println("Vita: "+ e.getLife())
    print("Attaco base: "+ e.getAttack()+ "\n\n")
  }
  
  def startSpecialAttack(name: String) = print("Attacco speciale del " + name +"!!!")
  
  def startAttack(name: String) = print("Attacco del " + name +"!!!")
  
  def damage(damage: Int) = print(" Hai inflitto " + damage +" punti di danno al nemico")
  
  def enemyDamage(damage: Int) = print(" Il nemico ti ha inflitto " + damage + " punti di danno grazie alla sua abilità speciale\n\n")
  
  def defenseSchield() = print(" attacco parato grazie al tuo scudo, ora non hai più protezione!\n\n")
  
  def getLoot() = printf("Grazie alla bevenda magica una delle tue statistiche sarà migliorata nel prossimo livello\n\n") 
}