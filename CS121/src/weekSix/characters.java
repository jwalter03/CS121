package weekSix;

public class characters {
    //access modifiers

    //instance variables
    //private
    //public
    //private package "default"
    //protected
    private String name, moveName;
    private int movePoint, hitPoint;
    int points;
    //parameterized constructor
    characters(String Name, String MoveName){
        this.name = Name;
        this.moveName = MoveName;
    }
    // setters and getters
    //setters
    public void setName(String Name){
        this.name = Name;
    }
    public void setMoveName(String moveName){
        this.moveName = moveName;
    }
    public void setMovePoint(int MovePoint){
        this.movePoint = MovePoint;
    }
    public void setHitPoint(int HitPoint){
        this.hitPoint = HitPoint;
    }

    //Getter
    public String getName(){
        return name;
    }
    public String getMoveName(){
        return moveName;
    }
    public int getMovePoint(){
        return movePoint;
    }
    public int getHitPoint(){
        return hitPoint;
    }
    //display method
    public void displayInfo(){
        System.out.printf("This is the characters name: %s%n This is the characters move name: %s%n ");

    }

}
