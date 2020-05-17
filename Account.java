package Data_Structures;

public class Account {
    private String FirstName;
    private String LastName;
    private int AccNum;
    private Account next;
    private byte age;
    private Account left;
    private Account right;

    public Account(String FirstName, String LastName, int AccNum, byte age, Account next){
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.AccNum = AccNum;
        this.age = age;
        this.next = next;
    }

    public Account(String FirstName, String LastName, int AccNum, byte age, Account left, Account right) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.AccNum = AccNum;
        this.age = age;
        this.left = left;
        this.right = right;
    }
    public String getFirstName() {
        return FirstName;
    }
    public String getLastName() {
        return LastName;
    }
    public int getAccNum() {
        return AccNum;
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
    public void setNext(Account n) {
        next = n;
    }

}
