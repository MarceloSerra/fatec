public class PlanePilot extends Person{
    private final String license;
    private boolean piloting;
    private Plane plane;

    public PlanePilot(String license, boolean piloting, Plane plane){
        this.license = license;
        this.piloting = false;
        this.plane = plane;
    }

    public void pilot(){
        if(!this.piloting) this.piloting = true;
        this.plane.fly();
    };
}
