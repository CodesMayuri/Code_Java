import java.util.ArrayList;

class CP19 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        // Given input
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(1);

        int start = 0;
        int end = list.size() - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (!list.get(start).equals(list.get(end))) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome)
            System.out.println("Output: Palindrome");
        else
            System.out.println("Output: Not Palindrome");
    }
}
