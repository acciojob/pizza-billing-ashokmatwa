package com.driver;

public class Main {
  public static void main(String[] args) {
    DeluxePizza dp = new DeluxePizza(true); //passing veg pizza
    System.out.println(dp.getPrice());
    dp.addTakeaway();
    dp.addExtraCheese();
    dp.addTakeaway();
    System.out.println(dp.getBill());

//    Pizza p = new Pizza(true); //passing veg pizza
    Pizza p = new Pizza(false);  //passing Non-veg pizza
    p.addExtraCheese();
    p.addExtraToppings();
//    p.addTakeaway();
    System.out.println(p.getBill());
  }
}