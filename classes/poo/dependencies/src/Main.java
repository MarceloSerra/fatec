import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Person personOne = new Person("PersonOne", new Date("1984-01-01"));
        Person personTwo = new Person("PersonTwo", new Date("1984-01-01"));
        PlanePilot planePilotOne = new PlanePilot("LICENSE", personOne);
        FlightPassenger flightPassengerOne = new FlightPassenger("TICKET", "A1", personTwo);
        Plane planeOne = new Plane("MODEL", 150);
        Flight flightOne = new Flight("ID01", "DES", planeOne, planePilotOne);
        Airport airportOne = new Airport(
                new Plane[]{planeOne},
                new PlanePilot[]{planePilotOne},
                new Flight[]{flightOne}
        );

        Person personThree = new Person("PersonThree", new Date("1984-01-01"));
        Person personFour = new Person("PersonFour", new Date("1984-01-01"));
        PlanePilot planePilotTwo = new PlanePilot("LICENSE", personThree);
        FlightPassenger flightPassengerTwo = new FlightPassenger("TICKET", "A1", personFour);
        Plane planeTwo = new Plane("MODEL", 150);
        Flight flightTwo = new Flight("ID01", "DES", planeTwo, planePilotTwo);
        Airport airportTwo = new Airport(
                new Plane[]{planeTwo},
                new PlanePilot[]{planePilotTwo},
                new Flight[]{flightTwo}
        );

    }
}