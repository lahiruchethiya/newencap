package javaeencap;
import java.util.ArrayList;
import  java.util.List;
//port com.pkg.test.Bus;


public class Application {
	
	
	 public static void main(String[] args) {
			// write your code here


		        //getset encapsulation
		 System.out.println("getset");
		        Bus bus = new Bus();
		        bus.setColor("white");
		       
		        System.out.println("color "+ bus.getColor());
		        

		        //Inner Class encapsulation
		        System.out.println("innerclass");
		        BusStation busStation = new BusStation();

		        busStation.addBuses(busStation.new Bus("white"));
		        busStation.addBuses(busStation.new Bus("red"));
		        busStation.addBuses(busStation.new Bus("blue"));

		        busStation.getbusses();

		        //Inner method encapsulation
		        System.out.println("inner method");
		        BusStation busStation1 = new BusStation();
		        busStation1.innerValidateBus();

		        //anonymous class
		        System.out.println("anonymous class");
		        BusStation busStation2 = new BusStation();
		        busStation2.anonyValidateBus();



		    }
}