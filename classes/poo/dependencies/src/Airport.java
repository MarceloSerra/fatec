import java.util.List;

public class Airport {
    private List<Plane> fleet;
    private List<PlanePilot> planePilots;
    private List<Flight> flights;

    public Airport(Plane[] fleet, PlanePilot[] planePilots, Flight[] flights){
        this.fleet = List.of(fleet);
        this.planePilots = List.of(planePilots);
        this.flights = List.of(flights);
    }

    public void addFlight(Flight flight){
        this.flights.add(flight);
    };
}
