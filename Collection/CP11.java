import java.util.ArrayList;
class CP11 {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(9);
        arr.add(11);

        int primeCount = 0;

        for (int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);

            if (num > 1) {
                boolean isPrime = true;

                for (int j = 2; j <= num - 1; j++) {
                    if (num % j == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    primeCount++;
                }
            }
        }

        System.out.println("Total Prime Numbers: " + primeCount);
    }
}
