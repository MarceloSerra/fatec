import java.util.Date;

public class Person {
    protected String name;
    protected Date birth;
    protected boolean moving;

    public Person(String name, Date birth){
        this.name = name;
        this.birth = birth;
        this.moving = false;
    }
    public void move(){
        if(!this.moving) this.moving = true;
    };
}
