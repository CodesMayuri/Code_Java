import java.util.Vector;

class CP29 {
    public static void main(String[] args) {
        Vector<Integer> v1 = new Vector<>();
        Vector<Integer> v2 = new Vector<>();

        v1.add(5);
        v1.add(10);
        v1.add(15);

        v2.addAll(v1);

        System.out.println("Vector2: " + v2);
    }
}
