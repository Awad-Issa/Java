import java.util.Arrays;
import java.util.ArrayList;


public class CafeUtil {

    public static int getStreakGoal(){
        int numOfPurchases = 0 ;
        for (int i = 1; i <= 10 ; i++){
            numOfPurchases+=i;
        }
        return numOfPurchases;
    }

    static double getOrderTotal(double[] prices){
        double [] intArray = new double []{3.5, 1.5, 4.0, 4.5};
        return Arrays.stream(intArray).sum();
    }

    static void displayMenu(ArrayList<String> menuItems){
        for(int i =0; i<= menuItems.size();i++){
            System.out.println(i+" "+menuItems.get(i));
        }
    }
    public static void addCustomer(ArrayList<String> customers){
        String username = System.console().readLine();
        System.out.println("Hello"+" "+username);
        customers.add(username);
        System.out.println("There are"+customers.size() +" people in front of you");
        System.out.println(customers);
    }
}
