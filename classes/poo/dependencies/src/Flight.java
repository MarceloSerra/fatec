import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Flight {

    private String register;
    private String destination;
    private Plane plane;
    private List<FlightPassenger> flightPassengers;
    private PlanePilot planePilot;

    public Flight(String register, String destination, Plane plane, PlanePilot planePilot){
        this.register = register;
        this.destination = destination;
        this.plane = plane;
        this.planePilot = planePilot;
    }

    public void addPassenger (FlightPassenger passenger) {
        this.flightPassengers.add(passenger);
    }

}
