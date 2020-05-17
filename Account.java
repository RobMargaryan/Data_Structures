package Data_Structures;

public class Account {
    String FirstName;
    String LastName;
    int AccNum;
    Account next;
    byte age;
    Account left;
    Account right;

    public Account(String FirstName, String LastName, int AccNum, byte age, Account next){
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.AccNum = AccNum;
        this.age = age;
        this.next = next;
    }


    public String getName(){return FirstName;}
    public String getSurName(){return LastName;}
    public int getAccNum(){return AccNum;}
    public byte getAge(){return age;}
    public Account getNext(){return next;}
    public void setNext(Account n){next = n;}

}
