package Queue;
import Account.Account;

public class AccountQueue implements Queue<Account> {
    private Account[] data;
    private int frontIndex = 0;
    private int size = 0;

    public AccountQueue() {
        data = new Account[1000];
    }

    public AccountQueue(int capacity) {
        data = new Account[capacity];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void enqueue(Account account) throws IllegalStateException {
        if (size == data.length)
            throw new IllegalStateException("Queue is full");
        int available = (frontIndex + size) % data.length;
        data[available] = account;
        size++;
    }

    @Override
    public Account first() {
        if (isEmpty())
            return null;
        return data[frontIndex];
    }

    @Override
    public Account dequeue() {
        if (isEmpty())
            return null;
        Account answer = data[frontIndex];
        data[frontIndex] = null;
        frontIndex = (frontIndex + 1) % data.length;
        size--;
        return answer;
    }
}
