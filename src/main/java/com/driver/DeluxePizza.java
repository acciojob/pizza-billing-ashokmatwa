package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        // your code goes here

        // Deluxe Pizza comes with extra cheese and toppings by default.
        // make sure it’s constructor takes care of extra cheese and toppings
        addExtraCheese();
        addExtraToppings();
    }
}
