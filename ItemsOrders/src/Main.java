import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        Item item1 = new Item();
        item1.name = "mocha";
        item1.price=3;

        Item item2 = new Item();
        item2.name = "latte";
        item2.price=3.5;

        Item item3 = new Item();
        item3.name = "drip coffee";
        item3.price = 2.5;

        Item item4 = new Item();
        item4.name = "capuccino";
        item4.price = 5;


        Order order1 = new Order();
        order1.name = "Cindhuri";
        order1.ready = true;
        System.out.println("================");
        System.out.println("Name: "+order1.name);
        System.out.println("Ready? "+order1.ready);
        System.out.println("================");


        Order order2 = new Order();
        order2.name = "Jimmy";
        order2.items.add(item1);
        order2.ready = true;
        System.out.println("================");
        System.out.println("Name: "+order2.name);
        System.out.println("Order Name: " +order2.items.get(0).name);
        System.out.println("Price: "+order2.items.get(0).price);
        System.out.println("Ready? "+order2.ready);
        System.out.println("================");
        order2.total = item1.price;

        Order order3 = new Order();
        order3.name = "Noah";
        order3.items.add(item4);
        System.out.println("================");
        System.out.println("Name: "+order3.name);
        System.out.println("Order Name: " +order3.items.get(0).name);
        System.out.println("Price: "+order3.items.get(0).price);
        System.out.println("Ready? "+order3.ready);
        System.out.println("================");
        order3.total = item4.price;
        order3.ready = false;


        Order order4 = new Order();
        order4.name = "Sam";
        order4.items.add(item2);
        System.out.println("================");
        System.out.println("Name: "+order4.name);
        System.out.print("Order Name: " +order4.items.get(0).name+" ");
        System.out.println(order4.items.get(0).name);
        System.out.println("Price: "+order4.items.get(0).price);
        System.out.println("Ready? "+order4.ready);
        System.out.println("================");
        order4.total = item4.price;
        order4.ready = false;

//        System.out.println(order2.items);


        // Application Simulations
//        // Use this example code to test various orders' updates
//        System.out.printf("Name: %s\n", item1.name);
//        System.out.printf("Total: %s\n", order2.total);
//        System.out.printf("Ready: %s\n", order1.ready);
    }
}
