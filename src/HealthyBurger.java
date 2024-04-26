public class HealthyBurger extends VeggieBurger {

    public HealthyBurger(String meat, int additions) {
        super("Healthy Rye Bread", meat);
        name = "Healthy Burger";
        price = 150;
        if (additions <= 6 && additions >= 0) {
            this.additions = additions;
        } else {
            System.out.println("You've entered an invalid number of toppings. The system will default to six toppings.");
            this.additions = 6;
        }
    }
}