import java.util.Vector;

class CP23 {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(100);
        v.add(200);
        v.add(300);

        for (int i = 0; i < v.size(); i++) {
            System.out.print(v.get(i) + " ");
        }
    }
}
