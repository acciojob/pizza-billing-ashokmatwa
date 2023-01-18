package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    boolean cheeseFlag = false;
    boolean toppingsFlag = false;
    boolean paperBagFlag = false;
    //The customer might ask for extra cheese or toppings by invoking your method multiple times,
// but you have to make sure you don’t add it in the bill multiple times.
    int vegPizzaBasePrice = 300;
    int nonVegPizzaBasePrice = 400;
    int extraCheesePrice = 80;
    int extraToppingsForVegPizza = 70;
    int extraToppingsForNonVegPizza = 120;
    int paperBagPrice = 20;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(this.isVeg){
//            this.price = 300; //veg price
            this.price = vegPizzaBasePrice;
        }
        else{
//            this.price = 400; //non-veg price
            this.price = nonVegPizzaBasePrice;
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(cheeseFlag == false){
//            this.price += 80;
            this.price += extraCheesePrice;
            cheeseFlag = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(toppingsFlag == false){
            if(this.isVeg){
//                this.price += 70;
                this.price += extraToppingsForVegPizza;
            }
            else{
//                this.price += 120;
                this.price += extraToppingsForNonVegPizza;
            }
            toppingsFlag = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(paperBagFlag == false){
//            this.price += 20;
            this.price += paperBagPrice;
            paperBagFlag = true;
        }
    }

    public String getBill(){
        // your code goes here
        int toppings = 0;
        if(this.isVeg) toppings = extraToppingsForVegPizza;
        else toppings = extraToppingsForNonVegPizza;

        if(isVeg)
            this.bill = "Base Price Of The Pizza: " + vegPizzaBasePrice + "\n";
        else
            this.bill = "Base Price Of The Pizza: " + nonVegPizzaBasePrice + "\n";

        if(cheeseFlag == true)
            this.bill += "Extra Cheese Added: " + extraCheesePrice + "\n";
        if(toppingsFlag == true)
            this.bill += "Extra Toppings Added: " + toppings + "\n";
        if(paperBagFlag == true)
            this.bill += "Paperbag Added: " + paperBagPrice + "\n";

        this.bill += "Total Price: " + this.price + "\n";
//        this.bill += "Total Price: " + price + "\n";

        return this.bill;

//        return "Base Price Of The Pizza: " + this.price + "\n" +
//                "Extra Cheese Added: " + 80 + "\n" +
//                "Extra Toppings Added: " + toppings + "\n" +
//                "Paperbag Added: " + 20 + "\n" +
//                "Total Price: " + this.total + "\n";

    }
}
