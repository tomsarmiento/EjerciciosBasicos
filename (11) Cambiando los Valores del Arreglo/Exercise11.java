import java.util.ArrayList;
public class Exercise11 {
    public void changeValues (int[] arr){
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        for(int i=1; i<arr.length; i++){
            newArray.add(arr[i]);
        }
        newArray.add(0);
        System.out.println(newArray);
    }
}