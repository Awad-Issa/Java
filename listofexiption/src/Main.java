import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {

    ArrayList<Object> myList = new ArrayList<Object>();
    myList.add("13");
    myList.add("hello world");
    myList.add(48);
    myList.add("Goodbye World");

    for (int i = 0; i < myList.size(); i++) {
      try {
        Integer castedValue = (Integer) myList.get(i);
        Integer number = (Integer) i;
        System.out.println("This is int number and bla bla bla   "+i);
        System.out.println();
      } catch (ClassCastException e){
        System.out.println("This is not an intiger nums so ...bla bla bla   "+i);

      }
    }
  }
}