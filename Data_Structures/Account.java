package Data_Structures;

public class Account {
    private final String FirstName;
    private final String LastName;
    private int id;
    private Account next;
    private Account prev;
    private byte age;

    public Account(){
        FirstName = null;
        LastName = null;
        id = 0;
        next = null;
        prev = null;
        age = -1;
    }

    public Account(String FirstName, String LastName, byte age, Account next){
        this.FirstName = FirstName;
        this.LastName = LastName;
        id = generateHashID();
        this.age = age;
        this.next = next;
    }

    public Account(String FirstName, String LastName, byte age, Account next, Account prev){
        this.FirstName = FirstName;
        this.LastName = LastName;
        id = generateHashID();
        this.age = age;
        this.prev = prev;
        this.next = next;
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
    public Account getPrev() {
        return prev;
    }
    public Account getNext() {
        return next;
    }
    public void setPrev(Account p){
        prev = p;
    }
    public void setNext(Account n) {
        next = n;
    }
    public void setAge(byte age) {
        this.age = age;
    }
}
