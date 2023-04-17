abstract class Character(private var life: Int, private var attack: Int, private var name: String){
  
  def getLife(): Int = this.life
  
  def getAttack(): Int = this.attack
  
  def getName(): String = this.name
  
  def decreaseLife(damage: Int) = this.life-=damage
   
  def upgradeAttack(upAttack: Int) = this.attack+=upAttack
  
  def upgradeLife(upLife: Int) = this.life+=upLife
  
  def printData()
}