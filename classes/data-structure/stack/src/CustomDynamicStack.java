import java.util.ArrayList;
import java.util.List;

public final class CustomDynamicStack<T> {
    private final List<T> storage;
    private T peek;
    private Integer size;

    public CustomDynamicStack(){
        this.storage = new ArrayList<T>();
        this.peek = null;
        this.size = -1;
    }

    private void increaseSize(){ ++this.size; };

    private void decreaseSize(){ --this.size; };

    public Boolean isEmpty() {
        return this.size() == 0;
    }

    private void setPeek(T arg) { this.peek = arg; };

    private void handleEmpty() {
        if(this.isEmpty()) throw new Error("Empty stack!");
    };

    private void handleNewPeek(){
        if (this.isEmpty()) {
            this.setPeek(null);
            return;
        }
        this.setPeek(this.storage.get(this.size));
    }

    private void log(){
        System.out.println("" +
                "[PEEK]: " + this.peek + "\n" +
                "[SIZE]: " + this.size() + "\n" +
                "[STORAGE]: " + this.storage + "\n" +
        "");
    }

    public T peek() { return this.peek; };

    public Integer size() { return this.size + 1; }

    public void push(T arg) {
        this.storage.add(arg);
        this.increaseSize();
        this.setPeek(arg);
        this.log();
    }

    public T pop() {
        this.handleEmpty();

        T peek = this.storage.remove(this.size() - 1);

        this.decreaseSize();
        this.handleNewPeek();

        this.log();
        return peek;
    }
}
