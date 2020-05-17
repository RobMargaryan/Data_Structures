package Data_Structures;
import Data_Structures.Account;


public class SinglyLinkedList {
    private Account head = null;
    private Account tail = null;
    private int size = 0;
    public SinglyLinkedList() { }
         public int size( ) { return size; }
    public boolean isEmpty( ) { return size == 0; }
    public int first( ) {
       if (isEmpty( )) return 0;
        return head.getAccNum();
        }
    public int last( ) {
        if (isEmpty( )) return 0;
        return tail.getAccNum();
        }

        public void addFirst(String FirstName, String LastName, int AccNum, byte age) {
        head = new Account(FirstName, LastName, AccNum, age, head);
        if (size == 0)
            tail = head;
        size++;
        }
    public void addLast(String FirstName, String LastName, int AccNum, byte age) {
        Account newest = new Account(FirstName, LastName, AccNum, age,null);
        if (isEmpty( ))
            head = newest;
        else
        tail.setNext(newest);
        tail = newest;
        size++;
        }
    public int removeFirst( ) {
        if (isEmpty( )) return 0;
        int answer = head.getAccNum();
        head = head.getNext( );
        size--;
        if (size == 0)
            tail = null;
        return answer;
        }
    }
