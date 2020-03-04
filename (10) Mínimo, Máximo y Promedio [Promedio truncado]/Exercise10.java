import java.util.ArrayList;
public class Exercise10 {
    public void maxMinAvg (int[] arr){
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        int max = arr[0];
        int min = arr[0];
        int sum = 0;
        for(int item : arr){
            if(item > max){
                max = item;
            }
            if(item < min){
                min = item;
            }
            sum = sum + item;
        }
        newArray.add(max);
        newArray.add(min);
        newArray.add(sum/arr.length);
        System.out.println(newArray);
    }
}