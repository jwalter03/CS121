package weekTen.activity21;

public class Customer extends User{
    private String pastReser;
    private int loyaltyPts;
    public Customer(){

    }
    public Customer(String name, String email, String password, int number, String pastReser, int loyaltyPts){
        super(name, email, password, number);
        this.pastReser = pastReser;
        this.loyaltyPts = loyaltyPts;
    }
    public String getPastReser(){
        return pastReser;
    }
    public void setPastReser(String pastReser){
        this.pastReser = pastReser;
    }
    public int getLoyaltyPts(){
        return loyaltyPts;
    }
    public void setLoyaltyPts(int loyaltyPts){
        this.loyaltyPts = loyaltyPts;
    }
    @Override
    public String toString(){
        return super.toString() +String.format(" Loyalty Points: %d Past Reservation: %s",loyaltyPts,pastReser);
    }



}
