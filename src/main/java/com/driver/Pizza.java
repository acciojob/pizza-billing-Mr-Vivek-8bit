package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    int countCheese  = 0, countTakeAway = 0;
    int countToppingsVeg = 0, countToppingsNonVeg = 0;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg == true)
            price = 300; // veg
        else
            price = 400; //nonVeg

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(countCheese < 1) {
            price += 80;
            countCheese++;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(isVeg == true && countToppingsVeg < 1 ) {
            price += 70; // veg
            countToppingsVeg++;
        }
        else if(countToppingsNonVeg < 1){
            price += 120; //nonVeg
            countToppingsNonVeg++;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(countTakeAway < 1) {
            price += 20;
            countTakeAway++;
        }
    }

    public String getBill(){
//         your code goes here
        if(isVeg == true)
            bill = "Base Price Of The Pizza: " + 300 + "\n";
        else
            bill = "Base Price Of The Pizza: "+400+"\n";

        bill +=   "Extra Cheese Added: "+80+"\n";
        if(isVeg == true)
        bill += "Extra Toppings Added: "+70+"\n";
        else
            bill += "Extra Toppings Added: "+120+"\n";

       if(countTakeAway == 1)
        bill +=  "Paperbag Added: "+20+"\n";


        bill += "Total Price: "+price+"\n";

        return this.bill;
    }
}
