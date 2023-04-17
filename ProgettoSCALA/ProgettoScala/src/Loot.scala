trait Loot {
  
  def assignLoot(f: Friend)
}

class Uplife extends Loot{
  
  def assignLoot(f: Friend) = {
    
    f.upgradeLife(25) 
    print("La tua vita è stata potenziata di 25 punti\n\n")
  }
}

class UpAttack extends Loot{
   
   def assignLoot(f: Friend) = {
     
     f.upgradeAttack(5) 
     print("Il tuo attacco è stato potenziato di 5 punti\n\n")
   }   
}

class UpSchield extends Loot{
  
   def assignLoot(f: Friend) = {
     
     f.takeSchield()
     print("Hai guadagnato uno scudo protettivo\n\n")
   }
}