import java.util.ArrayList;

class CP20 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(3);
        list.add(5);
        list.add(4);
        list.add(5);
        list.add(2);
        list.add(4);
        list.add(3);
        list.add(5);

        for (int i = 0; i < list.size(); i++) {
            int count = 0;

            for (int j = 0; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    count++;
                }
            }

            if (count % 2 != 0) {
                System.out.println("Output: " + list.get(i));
                break;
            }
        }
    }
}
