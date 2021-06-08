import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

        private Bus bus;

    @Before
    public void before(){

        bus = new Bus("Edingurgh", 69);


    }

    @Test
    public void busStartsEmpty(){
        assertEquals(0,bus.passengerCount());
    }

}
