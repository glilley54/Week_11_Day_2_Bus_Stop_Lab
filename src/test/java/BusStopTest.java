import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {
    private BusStop busStop;
    private Person person;

    @Before
    public void before(){
        busStop = new BusStop("Sewer");
        person = new Person();
    }

    @Test
    public void busStopStartsEmpty(){
        assertEquals(0, busStop.queueCheck());
    }

    @Test
    public void canAddpassengerToQueue(){
        busStop.addPassenger(person);
        assertEquals(1, busStop.queueCheck());
    }
}
