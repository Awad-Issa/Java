public class Bat extends Mammal {

  public Bat(int energy) {
    this.energy = 300;
  }

  @Override
  public void displayEnergy() {
    super.displayEnergy();
  }


  public void fly() {
    energy -= 50;
    System.out.println("-50 The Bat is airborne!, the energy level is  " + energy);
  }

  public void eatHumans() {
    energy += 25;
    System.out.println("+25 The Bat eaten a human!, the energy level is " + energy);
  }

  public void attackTown() {
    energy -= 100;
    System.out.println("-100 The Bat attacked a town! the energy level is " + energy);
  }

}
