public class PlanePilot extends Person{
    private final String license;
    private boolean piloting;

    public PlanePilot(String license, Person person){
        super(person.name, person.birth);
        this.license = license;
        this.piloting = false;
    }

    public void pilot(){
        if(!this.piloting) this.piloting = true;
    };
}
