package machine;

import java.util.Scanner;

public class CoffeeMachine {
    Scanner scanner = new Scanner(System.in);
    int water = 400;
    int milk = 540;
    int coffeeBeans = 120;
    int disposableCups = 9;
    int money = 550;

    public void printAmount() {
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(coffeeBeans + " of coffee beans");
        System.out.println(disposableCups + " of disposable cups");
        System.out.println("$" + money + " of money");

    }

    void calculateAmounts(int waterRequired, int milkRequired, int coffeeBeansRequired, int money) {

        String message = "";
        boolean flag = true;
        if (water - waterRequired < 0) {
            message = "Sorry, not enough water";
            flag = false;
        }
        if (milk - milkRequired < 0) {
            message = message.isEmpty()? "Sorry, not enough milk" : message + ", milk";
            flag = false;
        }
        if (coffeeBeans - coffeeBeansRequired < 0) {
            message = message.isEmpty()? "Sorry, not enough coffee beans" : message + ", coffee beans";
            flag = false;
        }
        if (disposableCups - 1 < 0) {
            message = message.isEmpty()? "Sorry, not enough disposable cups" : message + ", disposable cups";
            flag = false;
        }

        if (flag == true) {
            System.out.println("I have enough resources, making you a coffee!");
            water -= waterRequired;
            milk -= milkRequired;
            coffeeBeans -= coffeeBeansRequired;
            --disposableCups;
            this.money += money;
        } else {
            message += "!";
            System.out.println(message);
        }
    }

    void fill () {
        System.out.println("Write how many ml of water do you want to add:");
        water += scanner.nextInt();
        System.out.println("Write how many ml of milk do you want to add:");
        milk += scanner.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add: ");
        coffeeBeans += scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add: ");
        disposableCups += scanner.nextInt();
    }

    void take () {
        System.out.println("I gave you $" + money);
        money = 0;
    }

    public static void main(String[] args) {

        CoffeeMachine select = new CoffeeMachine();
        String choice;

        do {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            choice = select.scanner.next();

            if (choice.equals("buy")) {

                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
                String coffeeChoice = select.scanner.next();

                if (coffeeChoice.equals("1")) {

                    select.calculateAmounts(250,0,16,4);

                } else if (coffeeChoice.equals("2")) {

                    select.calculateAmounts(350,75,20,7);

                } else if (coffeeChoice.equals("3")) {

                    select.calculateAmounts(200,100,12,6);

                } else if (coffeeChoice.equals("back")) {
                    continue;
                }

                System.out.println();

            } else if (choice.equals("remaining")){

                select.printAmount();
                System.out.println();

            } else if (choice.equals("fill")) {

                select.fill();
                System.out.println();

            } else if (choice.equals("take")) {

                select.take();
                System.out.println();

            } else if (choice.equals("exit")) {
                break;
            }

        } while (true);
    }
}
