
enum DinossaurOptionsEnum {
    JUMP('J'), RUN('R'), EAT('E'), SING('S'), SUNBATHE('B'), SHADE('D');
    private final Character option;
    DinossaurOptionsEnum(Character option){
        this.option = option;
    }
    public Character getOption(){
        return this.option;
    }
}
interface IDinossaurAttributes {
    Integer energy = 0;
    Integer speed = 0;
    Integer temperature = 0;
    Integer humor = 0;
}

interface IDinossaurMethods {
    void jump();
    void run();
    void eat();
    void sunbathe();
    void sing();
    void stayInShade();
}

public final class Dinossaur implements IDinossaurAttributes, IDinossaurMethods{

    public Dinossaur(){
        this.energy = 0;
        this.speed = 0;
        this.temperature = 0;
        this.humor = 0;
    }
    private Integer energy;
    private Integer speed;
    private Integer temperature;
    private Integer humor;

    protected Integer getEnergy() { return this.energy; };
    protected Integer getSpeed() { return this.speed; };
    protected Integer getTemperature() { return this.temperature; };
    protected Integer getHumor() { return this.humor; };
    public void jump() {
        --this.energy;
        --this.speed;
        ++this.humor;
    }
    public void run() {
        this.jump();
    }

    public void eat() {
        ++this.energy;
        --this.speed;
        ++this.humor;
    }
    public void sing() {
        --this.energy;
        ++this.humor;
    }
    public void sunbathe() {
        ++this.speed;
        ++this.temperature;
        ++this.humor;
    }
    public void stayInShade() {
        ++this.energy;
        --this.temperature;
        --this.humor;
    }
}


