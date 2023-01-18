package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int total;
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
            price = vegPizzaBasePrice;
        }
        else{
//            this.price = 400; //non-veg price
            price = nonVegPizzaBasePrice;
        }
        this.total = this.price;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(cheeseFlag == false){
//            this.total += 80;
//            this.price += 80;
            price += extraCheesePrice;
            cheeseFlag = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(toppingsFlag == false){
            if(this.isVeg){
//                this.total += 70;
//                this.price += 70;
                price += extraToppingsForVegPizza;
            }
            else{
//                this.total += 120;
//                this.price += 120;
                price += extraToppingsForNonVegPizza;
            }
            toppingsFlag = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(paperBagFlag == false){
//            this.total += 20;
//            this.price += 20;
            price += paperBagPrice;
            paperBagFlag = true;
        }
    }

    public String getBill(){
        // your code goes here
        int toppings = 0;
        if(this.isVeg) toppings = 70;
        else toppings = 120;

        if(isVeg)
            bill = "Base Price Of The Pizza: " + vegPizzaBasePrice + "\n";
        else
            bill = "Base Price Of The Pizza: " + nonVegPizzaBasePrice + "\n";

        if(cheeseFlag == true)
            bill += "Extra Cheese Added: " + 80 + "\n";
        if(toppingsFlag == true)
            bill += "Extra Toppings Added: " + toppings + "\n";
        if(paperBagFlag == true)
            bill += "Paperbag Added: " + 20 + "\n";

        bill += "Total Price: " + price + "\n";
//        this.bill += "Total Price: " + this.price + "\n";
//        this.price = this.total;

        this.bill = bill;
        return this.bill;

//        return "Base Price Of The Pizza: " + this.price + "\n" +
//                "Extra Cheese Added: " + 80 + "\n" +
//                "Extra Toppings Added: " + toppings + "\n" +
//                "Paperbag Added: " + 20 + "\n" +
//                "Total Price: " + this.total + "\n";

    }
}
