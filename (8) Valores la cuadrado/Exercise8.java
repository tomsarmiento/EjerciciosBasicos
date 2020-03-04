import java.util.ArrayList;
public class Exercise8 {
    public void oddArr (int[] arr){
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        for(int item : arr){
            item = item*item;
            newArray.add(item);
        }
        System.out.println(newArray);
    }
}