import java.util.ArrayList;
class CP4{
    public static void main(String args[]){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(50);
        arr.add(30);
        arr.add(20);
        arr.add(40);
        int min = arr.get(0);

        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) < min) {
                min = arr.get(i);
            }
        }

        System.out.println("Minimum value: " + min);
    }
}