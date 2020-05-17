package Stack;
import Account.Account;

public class AccountStack implements Stack<Account> {
    public static final int CAPACITY = 5000;
    private Account[] data;
    private int topIndex = -1;

    // Default stack size set to 5000
    public AccountStack() {
        data = new Account[CAPACITY];
    }

    // User defined stack size
    public AccountStack(int capacity) {
        data = new Account[capacity];
    }

    @Override
    public int size() {
        return topIndex + 1;
    }

    @Override
    public boolean isEmpty() {
        return topIndex == -1;
    }

    @Override
    public void push(Account account) throws IllegalStateException {
        if (size() == data.length)
            throw new IllegalStateException("Stack.Stack is full");
        data[++topIndex] = account;
    }

    @Override
    public Account top() {
        if (isEmpty())
            return null;
        return data[topIndex];
    }

    @Override
    public Account pop() {
        if (isEmpty())
            return null;
        Account answer = data[topIndex];
        data[topIndex] = null;
        topIndex--;
        return answer;
    }
}
