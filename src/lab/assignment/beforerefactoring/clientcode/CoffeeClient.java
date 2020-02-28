package lab.assignment.beforerefactoring.clientcode;

import lab.assignment.beforerefactoring.CoffeeMaker;
import lab.assignment.beforerefactoring.*;

public class CoffeeClient {


    public static void main(String[] args) {
        CoffeeTemplate coffeeType = new Mocha();
        coffeeType.prepareCoffee();
        System.out.println("********************");

        CoffeeTemplate coffeeType = new Capuccino();
        coffeeType.prepareCoffee();
        System.out.println("********************");

        CoffeeTemplate coffeeType = new Americano();
        coffeeType.prepareCoffee();
        System.out.println("********************");
    }

}
