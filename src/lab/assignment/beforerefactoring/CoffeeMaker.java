package lab.assignment.beforerefactoring;

public abstract class CoffeeMaker {

    public void prepareCoffee(){
        boilWater();
        brewEspresso();
        addIngredients();
        finalTouch();
        System.out.println(">>Serving coffee");
    }

    protected abstract void addIngredients();
    protected abstract void finalTouch();

    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void brewEspresso() {
        System.out.println("Brewing espresso");
    }
}
