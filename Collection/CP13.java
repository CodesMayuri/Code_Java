import java.util.ArrayList;
import java.util.Scanner;

class CP13 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("Original ArrayList: " + list);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number to insert: ");
        int num = sc.nextInt();

        System.out.print("Enter index position: ");
        int index = sc.nextInt();

        list.add(index, num);

        System.out.println("ArrayList after insertion: " + list);
    }
}
