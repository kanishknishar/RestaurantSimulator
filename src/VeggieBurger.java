import java.util.Scanner;

public class VeggieBurger {
    protected String name = "Veggie Burger";
    protected String breadRollType;
    protected String meat;
    protected int additions;
    protected int price = 100;
    protected String stringToppings = "Your chosen toppings are:";

    public VeggieBurger(String breadRollType, String meat) {
        this.breadRollType = breadRollType;
        this.meat = meat;
    }

    public VeggieBurger(String breadRollType, String meat, int additions) {
        this.breadRollType = breadRollType;
        this.meat = meat;
        if (additions <= 4 && additions >= 0) {
            this.additions = additions;
        } else {
            System.out.println("Invalid number of additions selected. 4 additions will be selected by default");
            this.additions = 4;
        }
        calculateTotal();
    }

    public int calculateTopping(int additions) {
        int toppingTotal = 0;
        int count = 1;
        while (count <= additions) {
            System.out.println(STR."Choose your topping no. \{count}: ");
            Scanner scanner = new Scanner(System.in);
            String topping = scanner.nextLine().toLowerCase();
            switch (topping) {
                case "tomatoes":
                    toppingTotal += 20;
                    stringToppings += STR."Topping No. \{count} - Tomatoes";
                    count++;
                    break;
                case "lettuce":
                    toppingTotal += 10;
                    stringToppings += STR."Topping No. \{count} - Lettuce";
                    count++;
                    break;
                case "carrots":
                    toppingTotal += 15;
                    stringToppings += STR."Topping No. \{count} - Carrots";
                    count++;
                    break;
                case "onions":
                    toppingTotal += 35;
                    stringToppings += STR."Topping No. \{count} - Onions";
                    count++;
                    break;
                case "mushrooms":
                    toppingTotal += 50;
                    stringToppings += STR."Topping No. \{count} - Mushrooms";
                    count++;
                    break;
                case "pineapple":
                    toppingTotal += 20;
                    stringToppings += STR."Topping No. \{count} - Pineapples";
                    count++;
                    break;
                default:
                    System.out.println("Invalid topping chosen. Try again.");
            }
        }

        return toppingTotal;
    }

    protected void calculateTotal() {
        System.out.println("Good evening. Would you like to look at our menu of toppings?");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine().toLowerCase();
        if (answer.equals("yes")) {
            System.out.println("""
                    You have 6 options:
                    1) Tomatoes - Rs. 20
                    2) Onions - Rs. 35
                    3) Mushrooms - Rs. 50
                    4) Lettuce - Rs. 10
                    5) Carrots - Rs. 15
                    6) Pineapple - Rs. 20
                    """);
        }

        if (additions == 0) {
            System.out.println(STR."I see you have chosen to not add any toppings. Very well, sir. The total price of the \{name} will be Rs. \{price}");
        } else {
            System.out.println(STR."Very well. What should your \{additions} toppings be?");
            int toppingTotal = calculateTopping(additions);
            System.out.println(STR."The base cost of the burger is Rs. \{price}.");
            System.out.println(STR."The total cost of the toppings is Rs. \{toppingTotal} because \{stringToppings}");
            int grandTotal = price + toppingTotal;
            System.out.println(STR."The grand total for the \{name} with \{meat} and \{breadRollType} bread roll will be Rs. \{grandTotal}.");
        }
    }
}




