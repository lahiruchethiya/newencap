
package javaeencap;
import java.util.ArrayList;
import java.util.List;

public class BusStation {

    List<Bus> buses ;
    {
        buses = new ArrayList<>();
    }

    //public BusStation() {

    //}
    public void addBuses(Bus bus) {
        buses.add(bus);
    }

    //anonymous
    public void anonyValidateBus(){
        new Object(){
            public void validate(String color){
                if ("BLUE".equalsIgnoreCase(color)){
                    System.out.println("Valid color");
                }else {
                    System.out.println("Not a valid color");
                }
            }
        }.validate("Green");
    }


    //Inner 

    public void innerValidateBus(){
        class BusValidator {
            public void validate(String color){
                if ("BLUE".equalsIgnoreCase(color)){
                    System.out.println("Valid color");
                }else {
                    System.out.println("Not a valid color");
                }
            }
        }
        new BusValidator().validate("Green");
    }

    public void getbusses() {

        for (Bus bus : buses) {
            System.out.println(bus.toString());
        }

    }

    //Inner class encapsulation

      class Bus {
        String color;
        public Bus(String color) {
            this.color = color;
        }
        @Override
        public String toString() {
            return color + " bus" ;
        }
    }
}

