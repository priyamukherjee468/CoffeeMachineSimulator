package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        coffeeMachine coffeeMachine = new coffeeMachine();
        Scanner sc=new Scanner(System.in);


        while(true){
            System.out.println("Press 1 to buy espresso");
            System.out.println("Press 2 to buy latte");
            System.out.println("Press 3 to buy capuccino");
            System.out.println("Press 4 to Add ingredients");
            System.out.println("Press 5 to get money");
            System.out.println("Press 6 to show ingredients");
            System.out.println("Press 7 to show data");
            System.out.println("Press 8 to exit");

            int option=sc.nextInt();
            sc.nextLine();

            if(option==1){
                coffeeMachine.buyEspresso();
            }else if(option==2){
                coffeeMachine.buyLatte();
            }else if(option==3){
                coffeeMachine.buyCapuccino();
            }else if(option==4){
                System.out.println("Enter water(ml): ");
                int addedWater=sc.nextInt();
                System.out.println("Enter milk(ml): ");
                int addedMilk=sc.nextInt();
                System.out.println("Enter beans(g): ");
                int addedBeans=sc.nextInt();
                coffeeMachine.addIngredients(addedWater, addedMilk, addedBeans);
            }else if(option==5){
                coffeeMachine.getMoney();
            }else if(option==6){
                coffeeMachine.showIngredients();
            }else if(option==7){
                coffeeMachine.showData();
            }else if(option==8){
                System.exit(0);
            }else{
                System.out.println("Invalid option");
            }


        }
    }

}