package Data_Structures;

public class CircularlyLinkedList {
    private Account tail = null;
    private int size = 0;
    public CircularlyLinkedList() { }

        public int size( ) { return size; }
        public boolean isEmpty() { return size == 0; }
        public int first( ) {
            if (isEmpty( )) return -1;
        return tail.getNext( ).getID( );
        }
        public int last( ) {
        if (isEmpty( )) return -1;
        return tail.getID();
        }

        public void rotate( ) {
        if (tail != null)
                tail = tail.getNext( );
        }
        public void addFirst(String FirstName, String LastName, int id, byte age) {
        if (size == 0) {
            tail = new Account(FirstName, LastName, age, null);
            tail.setNext(tail);
            } else {
            Account newest = new Account(FirstName, LastName, age, tail.getNext( ));
            tail.setNext(newest);
            }
        size++;
        }
        public void addLast(String FirstName, String LastName, int id, byte age) {
        addFirst(FirstName, LastName, id, age);
        tail = tail.getNext( );
        }
        public int removeFirst( ) {
        if (isEmpty( )) return -1;
        Account head = tail.getNext();
        if (head == tail) tail = null;
        else tail.setNext(head.getNext());
        size--;
        return head.getID();
        }
    }
