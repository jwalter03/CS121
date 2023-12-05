package weekTen.activity21;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Jim", "jim@email.com", "abcd", 435,"t118", 54);
        RestaurantManager manager1 = new RestaurantManager("Jan", "Jan@email.com","defd", 342,5,23);

        System.out.println(customer1);
        System.out.println(manager1);

    }
}