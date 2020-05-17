package LinkedList;
import Account.Account;

public class DoublyLinkedList {
        private Account header;
        private Account trailer;
        private int size = 0;
        public DoublyLinkedList(){
            header = new Account();
            trailer = new Account(null,null,(byte)-1,null,header);
            header.setNext(trailer);
        }
        public int size(){return size;}
        public boolean isEmpty(){return size == 0;}
        public int first(){
            if (isEmpty())return 0;
            return header.getNext().getID();
        }
        public int last(){
            if (isEmpty()) return 0;
            return trailer.getPrev().getID();
        }
        public void addFirst(Account a){
            addBetween(a.getFirstName(),a.getLastName(),a.getAge(),header,header.getNext());
        }
        public void addLast(Account a){
            addBetween(a.getFirstName(),a.getLastName(),a.getAge(),trailer.getPrev(),trailer);
        }
        public int  removeFirst(){
            if(isEmpty()) return 0;
            return remove(header.getNext());
        }
        public int removeLast(){
            if(isEmpty())return 0;
            return remove(trailer.getPrev());
        }
        private void addBetween(String n, String s, byte age, Account successor, Account predecessor){
            Account newest = new Account(n, s, age, successor, predecessor);
            predecessor.setNext(newest);
            successor.setPrev(newest);
            size++;
        }
        private int remove(Account account){
            Account predecessor = account.getPrev();
            Account successor = account.getNext();
            predecessor.setNext(successor);
            successor.setPrev(predecessor);
            size--;
            return account.getID();
        }
    }

