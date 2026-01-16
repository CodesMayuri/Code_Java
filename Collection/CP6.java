import java.util.*;
class CP6{
    public static void main(String args[]){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(50);
        arr.add(7);
        arr.add(20);
        arr.add(9);
        
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter search key: ");
        int s = sc.nextInt();
        boolean flag = false;
        int index =-1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i)==s) {
                flag = true;
                index=i;
            }
        }

        if (flag) {
            System.out.println(s+ " found at index position: " + index);
        } else {
            System.out.println(s+ " not found in the ArrayList");
        }
    }
}