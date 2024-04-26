public class DeluxeHamburger extends VeggieBurger {
    public DeluxeHamburger(String breadRollType, String meat) {
        super(breadRollType, meat);
        name = "Deluxe Hamburger";
        price = 150;
    }

    @Override
    protected void calculateTotal() {
        System.out.println("""
                The base cost of the deluxe hamburger is Rs. 100.
                The total cost of the toppings is Rs. 50 which are:
                1) Soda
                2) Fries
                """);
        System.out.println(STR."The grand total for your Deluxe Hamburger with \{meat} will be Rs. 150");
    }
}