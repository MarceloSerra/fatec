import java.util.List;

public class Airport {
    private List<Plane> fleet;
    private List<PlanePilot> planePilots;
    private List<Flight> flights;

    public void addFlight(Flight flight){
        this.flights.add(flight);
    };
}
