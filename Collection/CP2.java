import java.util.ArrayList;
class CP2{
    public static void main(String args[]){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        int sum=0;
        for(int i:arr){
            sum+=i;
        }
        System.err.println(sum);
    }
}