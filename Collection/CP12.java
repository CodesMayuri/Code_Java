import java.util.ArrayList;

class CP12 {
    public static void main(String args[]) {

        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(10);
        arr.add(15);
        arr.add(20);
        arr.add(25);
        arr.add(30);
        arr.add(35);

        System.out.println("Original ArrayList: " + arr);

        for (int i = arr.size() - 1; i >= 0; i--) {
            if (arr.get(i) % 2 != 0) {
                arr.remove(i);
            }
        }

        System.out.println("ArrayList after removing even numbers: " + arr);
    }
}
