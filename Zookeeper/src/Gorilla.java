public class Gorilla extends Mammal {

  public Gorilla(int energy) {
    energy = energy;
  }

  @Override
  public void displayEnergy() {
    super.displayEnergy();
  }

  public void throwSomething() {
    energy -= 5;
    System.out.println("-5 The Gorilla has thrown something, the energy level is " + energy);
  }

  public void eatBananas() {
    energy += 10;
    System.out.println("+10 The Gorilla has eaten a banana, the energy level is " + energy);
  }

  public void climb() {
    energy -= 10;
    System.out.println("-10 The Gorilla has climbed, the energy level is " + energy);
  }

}
