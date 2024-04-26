import java.util.Scanner;

public class PlaceOrder {

    Scanner scanner = new Scanner(System.in);

    public PlaceOrder() {
        String welcomeMessage = """
                Welcome to Bob's Burgers. Happy to serve you vegan meat burger since 2011!
                We offer 3 types of burgers:
                1) Veggie Burger
                2) Healthy Burger
                3) Deluxe Hamburger
                Would you like to know more details about any of them?
                """;

        System.out.println(welcomeMessage);

        String answer = scanner.nextLine().toLowerCase();

        while (!answer.equals("no") && !answer.equals("yes")) {
            System.out.println("Invalid input entered.");
            System.out.println(welcomeMessage);
            answer = scanner.nextLine().toLowerCase();
        }

        if (answer.equals("yes")) {
            burgerInfo();
        }

        System.out.println("If you've decided on which burger to order, please enter its number:");
        int burgerNumber = scanner.nextInt();
        scanner.nextLine();
        switch (burgerNumber) {
            case 1 -> {
                System.out.println("You've selected the Veggie Burger. What kind of vegan meat would you like with it?");
                String meat = scanner.nextLine();
                System.out.println("And what kind of bread roll would you like with it?");
                String breadRoll = scanner.nextLine();
                System.out.println("Finally, how many toppings would you like with the burger? (Can select a maximum of 4.)");
                int toppings = scanner.nextInt();
                VeggieBurger veggieBurger = new VeggieBurger(breadRoll, meat, toppings);
                veggieBurger.calculateTotal();
            }

            case 2 -> {
                System.out.println("You've selected the Healthy Burger. What kind of vegan meat would you like with it?");
                String meat = scanner.nextLine();
                System.out.println("""
                        For your information, healthy burgers are always served with a rye bread roll.
                        How many toppings would you like with the burger? (Can select a maximum of 6)
                        """
                );
                int toppings = scanner.nextInt();
                HealthyBurger healthyBurger = new HealthyBurger(meat, toppings);
                healthyBurger.calculateTotal();
            }

            case 3 -> {
                System.out.println("You've selected the Deluxe Hamburger. What kind of vegan meat would you like with it?");
                String meat = scanner.nextLine();
                System.out.println("And what kind of bread roll would you like with it?");
                String breadRoll = scanner.nextLine();
                System.out.println("As you may be aware, deluxe hamburgers are always served with fries and soda.");
                DeluxeHamburger deluxeHamburger = new DeluxeHamburger(breadRoll, meat);
                deluxeHamburger.calculateTotal();
            }
            default -> System.out.println("Invalid input entered. Good bye.");
        }


    }

    public void burgerInfo() {
        String answer = "yes";
        while (answer.equals("yes")) {
            System.out.println("Which of the three burger's information would you like to see? Type number to get information.");
            int a = scanner.nextInt();
            scanner.nextLine();
            switch (a) {
                case 1 ->
                        System.out.println("Our Veggie Burgers cost a base price of Rs. 100 and offer up to 4 toppings.");
                case 2 ->
                        System.out.println("Our Healthy Burgers cost a base price of Rs. 150 and offer up to 6 toppings.");
                case 3 ->
                        System.out.println("Our Deluxe Hamburgers cost Rs. 150 and always come with chips and soda. You cannot add any toppings.");
                default -> System.out.println("Invalid input entered.");
            }
            System.out.println("Would you like to check the information for our other burgers?");
            answer = scanner.nextLine().toLowerCase();
        }
    }
}
