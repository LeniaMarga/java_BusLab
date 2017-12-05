import java.util.ArrayList;

public class Bus {


    private String destination;
    private ArrayList<Person> passengers;
    private int capacity;

    public Bus(String destination, int capacity){
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<> ();
    }

    public int getPassengersCount(){
        return this.passengers.size();
    }

    public void addPerson(Person person){
        if (passengers.size() < capacity){
        passengers.add(person);
        }
    }

    public void removePerson(){
        passengers.remove(0);
    }

    public void pickUp(BusStop busStop){
        Person person = busStop.removePerson ();
        addPerson (person);
    }


}


//    public String checkCapacity(){
//        if (passengers.size() < capacity){
//            System.out.print("Please come on board");
//        }else System.out.print ("Sorry, the bus is full");}
//    }
//
//    public void addPerson(Person person) {
//        if (passengers.size ( ) < capacity) {
//            passengers.add (person);
//        }
//    }




