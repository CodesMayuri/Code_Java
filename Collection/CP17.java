import java.util.ArrayList;

class CP17 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(2);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(2);

        int n = list.size();

        for (int i = 0; i < n; i++) {
            int count = 0;

            for (int j = 0; j < n; j++) {
                if (list.get(i).equals(list.get(j))) {
                    count++;
                }
            }

            if (count > n / 2) {
                System.out.println("Majority Element: " + list.get(i));
                break;
            }
        }
    }
}
