import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

        private Bus bus;
        private Person person;

    @Before
    public void before(){

        bus = new Bus("Edingurgh", 1);
        person = new Person();


    }

    @Test
    public void busStartsEmpty(){
        assertEquals(0,bus.passengerCount());
    }

    @Test
    public void canAddPassenger(){
        bus.addNewPassenger(person);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void cannotAddPassenger(){
        bus.addNewPassenger(person);
        bus.addNewPassenger(person);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void removePassenger(){
        bus.removePassenger(person);
        assertEquals(0,bus.passengerCount());
    }

}
