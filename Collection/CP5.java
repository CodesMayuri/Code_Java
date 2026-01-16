import java.util.ArrayList;
class CP5{
    public static void main(String args[]){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(50);
        arr.add(7);
        arr.add(20);
        arr.add(9);
        int evenc=0, oddc=0; 

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i)%2==0) {
                evenc++;
            }
            else{
                oddc++;
            }
        }

        System.out.println("Even count is: " + evenc);
        System.err.println("Odd count is: "+oddc);
    }
}