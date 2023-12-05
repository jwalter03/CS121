package weekTen.activity21;

public class RestaurantManager extends User {

    private int ordersProcessing;
    private int tablesReserved;

    public RestaurantManager() {

    }

    public RestaurantManager(String name, String email, String password, int number, int tablesReserved, int ordersProcessing) {
        super(name, email, password, number);
        this.ordersProcessing = ordersProcessing;
        this.tablesReserved = tablesReserved;
    }

    public int getOrdersProcessing() {
        return ordersProcessing;
    }

    public void setOrdersProcessing(int ordersProcessing) {
        this.ordersProcessing = ordersProcessing;
    }

    public int getTablesReserved() {
        return tablesReserved;
    }

    public void setTablesReserved(int tablesReserved) {
        this.tablesReserved = tablesReserved;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" Orders Processing: %d Tables Reserved: %d", ordersProcessing, tablesReserved);
    }
}
