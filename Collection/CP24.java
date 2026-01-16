import java.util.Vector;

class CP24 {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(10);
        v.add(20);
        v.add(30);

        v.remove(1); 

        System.out.println("Vector after removal: " + v);
    }
}
