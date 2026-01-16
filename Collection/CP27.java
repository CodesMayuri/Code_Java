import java.util.Vector;

class CP27 {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(10);
        v.add(20);
        v.add(30);

        v.clear();

        System.out.println("Vector after clear: " + v);
    }
}
