public class FlightPassenger extends Person {
    private String ticket;
    private String seat;
    private boolean boarded;

    public FlightPassenger(String ticket, String seat){
        super();
        this.ticket = ticket;
        this.boarded = false;
        this.seat = seat;
    }

    public void board(){
        if(!this.boarded) this.boarded = true;
    }

}
