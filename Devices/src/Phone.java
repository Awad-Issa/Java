public class Phone extends Device {

  public Phone() {
  }

  @Override
  public void batteryLife() {
    super.batteryLife();
  }

  public void makeACall() {
    System.out.println("You are making a phone call");
    battery = battery - 5;
    batteryLife();
    System.out.println("------------------------------------");
  }

  public void playAGame(){
    System.out.println("You are playing a game");
    battery = battery - 20;
    batteryLife();
    System.out.println("------------------------------------");
  }

  public void charge(){
    System.out.println("You are charging your phone");
    battery = battery + 50;
    batteryLife();
    System.out.println("------------------------------------");

  }



}
