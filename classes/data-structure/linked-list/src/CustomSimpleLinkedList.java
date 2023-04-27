interface ICustomSimpleLinkedList {
    Node head = null;
    Integer length = 0;

    void add(Node node, Integer index);
    void addFirst(Node node);
    void addLast(Node node);
    void remove(Node node, Integer index);
    void removeFirst();
    void removeLast();

    Node get(Integer index);

    void set (Node value);

    Integer size();

    Boolean isEmpty();

}
public final class CustomSimpleLinkedList implements ICustomSimpleLinkedList {

    private Node head;
    private Node tail;
    private Integer length;

    public CustomSimpleLinkedList(){
        this.head = null;
        this.length = 0;
    }
    public Boolean isEmpty(){ return this.size() == 0; }
    public void add(Node node, Integer index) {

    }

    public void addFirst(Node node) {
            this.head = node;
            this.length++;
    }

    public void addLast(Node node) {
        if(this.isEmpty()) this.addFirst(node);
    }

    public void remove(Node node, Integer index) {

    }

    public void removeFirst() {

    }

    public void removeLast() {

    }

    public Node get(Integer index) {
        return null;
    }

    public Integer size() {
        return this.length;
    }
}
