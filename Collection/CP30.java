import java.util.Vector;

class CP30 {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);

        int sum = 0;
        for (int i = 0; i < v.size(); i++) {
            sum += v.get(i);
        }

        System.out.println("Sum of Vector elements: " + sum);
    }
}
