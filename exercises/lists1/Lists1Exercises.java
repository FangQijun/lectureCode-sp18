public class Lists1Exercises {
    /** Returns an IntList identical to L, but with
      * each element incremented by x. L is not allowed
      * to change. */
    public static IntList incrList(IntList L, int x) {
        /* Your code here. */
        if (L == null) {
            return null;
        }
        
        IntList incrementedList = new IntList(L.first + x, null);
        incrementedList.rest = incrList(L.rest, x);
        return incrementedList;
    }

    /** Returns an IntList identical to L, but with
      * each element incremented by x. Not allowed to use
      * the 'new' keyword. */
    public static IntList dincrList(IntList L, int x) {
        /* Your code here. */
        L.first += x;
        if (L.rest != null) {
            L.rest = dincrList(L.rest, x);
        }
        return L;
    }

    public static void main(String[] args) {
        IntList L = new IntList(5, null);
        L.rest = new IntList(7, null);
        L.rest.rest = new IntList(9, null);
        System.out.println(L.get(0));
        System.out.println(L.get(1));
        System.out.println(L.get(2));

        IntList newL = incrList(L, 10);
        System.out.println(newL.get(0));
        System.out.println(newL.get(1));
        System.out.println(newL.get(2));
        
        
        
        IntList M = new IntList(5, null);
        M.rest = new IntList(7, null);
        M.rest.rest = new IntList(9, null);
        System.out.println(M.get(0));
        System.out.println(M.get(1));
        System.out.println(M.get(2));
        
        IntList newM = dincrList(M, 10);
        System.out.println(newM.get(0));
        System.out.println(newM.get(1));
        System.out.println(newM.get(2));
    }
}