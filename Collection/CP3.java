import java.util.ArrayList;
class CP3{
    public static void main(String args[]){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(30);
        arr.add(50);
        arr.add(40);
        arr.add(20);
        int max = arr.get(0);

        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) > max) {
                max = arr.get(i);
            }
        }

        System.out.println("Maximum value: " + max);
    }
}