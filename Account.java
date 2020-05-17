package Data_Structures;

public class Account {
    private final String FirstName;
    private final String LastName;
    private int id;
    private Account next;
    private Account prev;
    private byte age;
    private Account left;
    private Account right;

    public Account(String FirstName, String LastName, byte age, Account next){
        this.FirstName = FirstName;
        this.LastName = LastName;
        id = generateHashID();
        this.age = age;
        this.next = next;
    }

    public Account(String FirstName, String LastName, byte age, Account left, Account right) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        id = generateHashID();
        this.age = age;
        this.left = left;
        this.right = right;
    }
    
    private int generateHashID() {
        id ^= hashCode();
        id = (id << 5) | (id >>> 27);
        return id;
    }

    public String getFirstName() {
        return FirstName;
    }
    public String getLastName() {
        return LastName;
    }
    public int getID() {
        return id;
    }
    public byte getAge() {
        return age;
    }
    public Account getNext() {
        return next;
    }
    public Account getLeft() {
        return left;
    }
    public Account getRight() {
        return right;
    }
    public Account getPrev() {
        return prev;
    }
    public void setNext(Account n) {
        next = n;
    }
    public void setPrev(Account p){
        prev = p;
    }
    public void setAge(byte age) {
        this.age = age;
    }
}
