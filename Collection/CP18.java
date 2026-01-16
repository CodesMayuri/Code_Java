import java.util.ArrayList;

class CP18 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int k = 2;

        for (int i = 0; i < k; i++) {
            int first = list.remove(0);
            list.add(first);
        }

        System.out.println("Output: " + list);
    }
}
