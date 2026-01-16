import java.util.Vector;

class CP28 {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(1);
        v.add(2);
        v.add(4);

        v.add(2, 3); // insert 3 at index 2

        System.out.println(v);
    }
}
