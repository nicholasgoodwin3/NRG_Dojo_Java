package OrderandItems;

public class TestOrders {
    public static void main(String[] args) {
        
//items
        Item item1 = new Item();
        item1.price = 1.50;
        item1.name="Mocha";

        Item item2 = new Item();
        item2.price=2.50;
        item2.name="Latte";

        Item item3 = new Item();
        item3.price=4.00;
        item3.name="Drip Coffee";

        Item item4 = new Item();
        item4.price=5.00;
        item4.name="Capuccino";
//orders 

        Order order1= new Order();
        order1.name = "Cindhuri";

        Order order2 = new Order();
        order2.name = "Jimmy";

        Order order3 = new Order();
        order3.name = "Noah";

        Order order4 = new Order();
        order4.name = "Sam";

//App Sims
        order2.items.add(item1);
        order2.total += item1.price; //op and tested

        order3.items.add(item4);
        order3.total += item4.price; //op tested

        order4.items.add(item2);
        order4.total += item4.price; //op and tested

        order1.ready = true; //op and tested

        order4.items.add(item2);
        order4.items.add(item2);
        order4.total += item2.price * 2; //op and tested

        order2.ready = true; //op and tested

        order1.items.add(item1);
        order1.items.add(item3);
        order1.total += item1.price + item3.price; //added for curiosity!


//output testing
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: $%s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);

        System.out.printf("Name: %s\n", order2.name);
        System.out.printf("Total: $%s\n", order2.total);
        System.out.printf("Ready: %s\n", order2.ready);

        System.out.printf("Name: %s\n", order3.name);
        System.out.printf("Total: $%s\n", order3.total);
        System.out.printf("Ready: %s\n", order3.ready);

        System.out.printf("Name: %s\n", order4.name);
        System.out.printf("Total: $%s\n", order4.total);
        System.out.printf("Ready: %s\n", order4.ready);
    }
}
