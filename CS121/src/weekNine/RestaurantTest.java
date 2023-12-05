package weekNine;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RestaurantTest {

    private Restaurant Mcdonalds;
    private Restaurant TacoBell;
    @BeforeEach
    public void setUp(){
        Mcdonalds = new Restaurant("sandwich", 1,"one",4);
        TacoBell = new Restaurant("taco", 1,"three",6);
    }

    @Test
    public void testInstanceCount(){

        assertEquals(2,Restaurant.getInstanceCount());
    }

}