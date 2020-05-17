package Tree;
import Account.Account;

import java.util.Iterator;

public interface Tree extends Iterable<Account> {
    Account root( );
    Account parent(Account p) throws IllegalArgumentException;
    Iterable<Account> children(Account p)
    throws IllegalArgumentException;
    int numChildren(Account p) throws IllegalArgumentException;
    boolean isInternal(Account p) throws IllegalArgumentException;
    boolean isExternal(Account p) throws IllegalArgumentException;
    boolean isRoot(Account p) throws IllegalArgumentException;
    int size( );
    boolean isEmpty( );
    Iterator<Account> iterator();
    Iterable<Account> positions( );
    }