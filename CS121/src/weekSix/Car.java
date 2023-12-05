package weekSix;

public class Car {
    //state - attributes/properties and behavior - methods/function

    //member variables/instant variables/fields
    String Make,Model,VIN, Color;
    private int year;
    int miles;
    boolean isElectric;

    //default constructor(initializes variables)
    //Constructors
    Car(){
        this.year = 2000;
        this.Make = "Empty";
        this.Model = "Empty";
        this.VIN = "128563EHBCV4854";
        this.Color = "White";
    }
    Car(String make, String model, int year, int miles){
        this.Make = make;
        this.Model = model;
        this.year = year;
        this.miles = miles;
    }
    //Setters and Getters
    //setters(mutator method)
    public void setYear(int years){
        this.year = years;
    }
    //getters (accessor method)
    public int getYear(){
        return year;
    }

    }
