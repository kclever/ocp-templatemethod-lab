package lab.assignment.beforerefactoring;

public class Americano extends CoffeeMaker{

    @Override
    protected void addIngredients() {

        System.out.println("Add hot water");
    }

    @Override
    protected void finalTouch() {

        System.out.println("Add sugar and cream");
    }
}