import java.util.Date;

public class Person {
    protected String name;
    protected Date birth;
    protected boolean moving;

    public Person(String name, Date birth, boolean moving){
        this.name = name;
        this.birth = birth;
        this.moving = false;
    }
    public Person() {}
    public void move(){
        if(!this.moving) this.moving = true;
    };
}
