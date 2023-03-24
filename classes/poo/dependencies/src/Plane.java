public class Plane {
    private String model;
    private Integer capacity;
    private boolean flying;

    public Plane(String model, Integer capacity) {
        this.model = model;
        this.capacity = capacity;
    }
public void fly(){
    if (!this.flying) this.flying = true;
};
}
