package weekNine;

public class Restaurant {
    private String menu;
    private String table;
    private double reservation;
    private int customers;
    private static int instanceCount = 0;

    Restaurant(){
        instanceCount++;
    }

    Restaurant(String menu, double reservation, String table, int customers){
        this.reservation = reservation;
        this.table = table;
        this.menu = menu;
        this.customers = customers;
        instanceCount++;
    }
    public  void setTable(String table){
        this.table = table;
    }
    public void setMenu(String menu){
        this.menu = menu;
    }
    public void setReservation(double reservation){
        this.reservation = reservation;
    }
    public void setCustomers(int customers){
        this.customers = customers;
    }
    public String getTable(){
        return table;
    }
    public String getMenu() {
        return menu;
    }
    public double getReservation() {
        return reservation;
    }
    public int getCustomers() {
        return customers;
    }
    public static int getInstanceCount(){
        return instanceCount;
    }

}
