package weekSix.classActivity;

public class SandwichClass {
    private int Sandwiches;
    private String Meat;
    String Bread, Cheese, Toppings;

    SandwichClass(String bread, String cheese, String toppings) {
        this.Bread = bread;
        this.Cheese = cheese;
        this.Toppings = toppings;

    }
    public void setMeat(String meat){
        this.Meat = meat;
    }
    public void setSandwiches(int sandwiches){
        this.Sandwiches = sandwiches;
    }
    public String getMeat(){
        return Meat;
    }
    public int getSandwiches(){
        return Sandwiches;
    }
    public void displayInfo(){
        System.out.printf("Your sandwich has %s bread, %s, %s cheese and %s . You only made %d sandwiches.",Bread, Meat, Cheese, Toppings, Sandwiches);
    }
}