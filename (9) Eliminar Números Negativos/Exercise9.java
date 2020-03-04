import java.util.ArrayList;
public class Exercise9 {
    public void noNegatives (int[] arr){
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        for(int item : arr){
            if(item >= 0){
                newArray.add(item);
            }
            else{
                newArray.add(0);
            }
        }
        System.out.println(newArray);
    }
}