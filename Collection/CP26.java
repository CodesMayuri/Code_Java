import java.util.Vector;

class CP26 {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(5);
        v.add(10);
        v.add(15);

        int search = 10;

        if (v.contains(search))
            System.out.println("Element found");
        else
            System.out.println("Element not found");
    }
}
