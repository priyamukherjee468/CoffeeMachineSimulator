package org.example;

public class coffeeMachine {
    private int water;
    private int milk;
    private int beans;
    private int moneyEarned;
    private int espressoCount;
    private int latteCount;
    private int capuccinoCount;

    public coffeeMachine() {
        this.water=0;
        this.milk=0;
        this.beans=0;
        this.moneyEarned=0;
        this.espressoCount=0;
        this.latteCount=0;
        this.capuccinoCount=0;
    }

    //condition to make coffee
    public boolean canMakeCoffee(int waterAdded, int milkAdded, int beansAdded) {
        if (waterAdded <= this.water && milkAdded <= this.milk && beansAdded <= this.beans) {
            return true;
        }
        return false;

    }

    //coffee making
    public void makeCoffee(int waterAdded, int milkAdded, int beansAdded, int price) {
        if(canMakeCoffee(waterAdded, milkAdded, beansAdded)) {
            this.water -= waterAdded;
            this.milk -= milkAdded;
            this.beans -= beansAdded;
            this.moneyEarned += price;
            System.out.println("Coffee Ordered successfully !!");
        }else{
            System.out.println("Sorry, not enough ingredients");
        }

    }

    //ingredients to add
    public void addIngredients(int addedWater, int addedMilk, int addedBeans) {
        this.water += addedWater;
        this.milk += addedMilk;
        this.beans += addedBeans;

    }

    //money to get
    public void getMoney() {
        System.out.println("Here is your money: $" + this.moneyEarned);
        moneyEarned=0;

    }

    //show ingredients
    public void showIngredients() {
        System.out.println("Water: " + this.water +" ml");
        System.out.println("Milk: " + this.milk+" ml");
        System.out.println("Beans: " + this.beans+" g");
        System.out.println("Money Earned:$ " + this.moneyEarned+" $");
    }

    //show data
    public void showData() {
        System.out.println("Coffee sold: ");
        System.out.println("Espresso: " + this.espressoCount+" cups");
        System.out.println("Latte: " + this.latteCount+" cups");
        System.out.println("Capuccino: " + this.capuccinoCount+" cups");
        System.out.println("Total Money Earned:$ " + this.moneyEarned+" $");
    }

    //buy coffee

    public void buyEspresso() {
        makeCoffee(250, 0, 16, 4);
        espressoCount++;
    }

    public void buyLatte(){
        makeCoffee(350, 75, 20, 7);
        latteCount++;
    }

    public void buyCapuccino(){
        makeCoffee(200, 100, 12, 6);
        capuccinoCount++;
    }

}
