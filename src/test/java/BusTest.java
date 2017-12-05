import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    Bus bus;
    Person person;
    BusStop busStop;


    @Before
    public void before(){
        bus = new Bus("Edinburgh", 10);
        person = new Person();
        busStop = new BusStop("Royal Mile");
        busStop.addPerson(person);
    }

    @Test
    public void canAddPerson(){
        bus.addPerson(person);
        assertEquals(1, bus.getPassengersCount());
    }

    @Test
    public void cannotAddPersonBusFull(){
        bus.addPerson(person);
        bus.addPerson(person);
        bus.addPerson(person);
        bus.addPerson(person);
        bus.addPerson(person);
        bus.addPerson(person);
        bus.addPerson(person);
        bus.addPerson(person);
        bus.addPerson(person);
        bus.addPerson(person);
        bus.addPerson(person);
        assertEquals( 10, bus.getPassengersCount());
    }


    @Test
    public void canRemovePerson(){
        bus.addPerson(person);
        bus.removePerson();
        assertEquals (0, bus.getPassengersCount ());
    }

    @Test
    public void canPickUpPerson(){
        busStop.addPerson(person);
        bus.pickUp (busStop);
        assertEquals (1, bus.getPassengersCount ());
    }




}
