import java.util.ArrayList;

class CP14 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(45);
        list.add(20);
        list.add(60);
        list.add(35);

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : list) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        System.out.println("ArrayList: " + list);
        System.out.println("Second Largest Number: " + secondLargest);
    }
}
