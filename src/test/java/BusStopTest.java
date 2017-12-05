import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    BusStop busStop;
    Person person;

    @Before
    public void before(){
        busStop = new BusStop("Royal Mile");
        person = new Person();
    }

    @Test
    public void canAddPerson(){
        busStop.addPerson(person);
        assertEquals(1, busStop.getQueueCount ());
    }
    @Test
    public void canRemovePerson(){
        busStop.addPerson(person);
        Person person = busStop.removePerson();
        assertEquals(0, busStop.getQueueCount ());
    }

}
