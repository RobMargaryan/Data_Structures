package Tree;

import Account.Account;

public abstract class AccountTree implements Tree {
    public boolean isInternal(Account p) { return numChildren(p) > 0; }
    public boolean isExternal(Account p) { return numChildren(p) == 0; }
    public boolean isRoot(Account p) { return p == root( ); }
    public boolean isEmpty( ) { return size( ) == 0; }
    public int depth(Account p) {
        if (isRoot(p))
            return 0;
        else
        return 1 + depth(parent(p));
        }
    public int height(Account p) {
        int h = 0;
        for (Account c : children(p))
            h = Math.max(h, 1 + height(c));
        return h;
        }
    }

